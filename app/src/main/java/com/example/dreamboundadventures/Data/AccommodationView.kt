package com.example.dreamboundadventures.Data
import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.dreamboundadventures.Models.user
import com.example.dreamboundadventures.Navigation.ROUTE_BOOKING_ACCOMMODATION
import com.example.dreamboundadventures.Navigation.ROUTE_HOMEPAGE
import com.example.dreamboundadventures.Navigation.ROUTE_HOMEPAGE
import com.example.dreamboundadventures.Navigation.ROUTE_LOGIN
import com.example.dreamboundadventures.Navigation.ROUTE_REGISTER
import com.example.dreamboundadventures.Navigation.ROUTE_TRANSPORT
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.auth.User

//
class AccommodationView(var navController:NavHostController,var context:Context){

    var mAuth:FirebaseAuth
    val progress:ProgressDialog

    init {
        mAuth= FirebaseAuth.getInstance()
        progress=ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("PLease Wait.....")
    }
    fun signup(email:String,pass:String,confpass:String){
        progress.show()

        if (email.isBlank() || pass.isBlank() ||confpass.isBlank()){
            progress.dismiss()
            Toast.makeText(context,"Please enter your email",Toast.LENGTH_LONG).show()
            return
        }else if (pass != confpass){
            Toast.makeText(context,"Please enter your full name",Toast.LENGTH_LONG).show()
            return
        }else{
            mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener {
                if (it.isSuccessful){
                    val userdata=user(email,pass,mAuth.currentUser!!.uid)
                    val regRef=FirebaseDatabase.getInstance().getReference()
                        .child("Users/"+mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {

                        if (it.isSuccessful){
                            Toast.makeText(context,"Booked successfully",Toast.LENGTH_LONG).show()
                            navController.navigate(ROUTE_BOOKING_ACCOMMODATION)

                        }else{
                            Toast.makeText(context,"${it.exception!!.message}",Toast.LENGTH_LONG).show()
                            navController.navigate(ROUTE_TRANSPORT)
                        }
                    }
                }else{
                    navController.navigate(ROUTE_TRANSPORT)
                }

            } }

    }
}