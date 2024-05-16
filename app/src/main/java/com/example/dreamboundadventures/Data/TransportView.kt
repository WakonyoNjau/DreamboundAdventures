package com.example.dreamboundadventures.Data
import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.dreamboundadventures.Models.user
import com.example.dreamboundadventures.Navigation.ROUTE_HOMEPAGE
import com.example.dreamboundadventures.Navigation.ROUTE_HOMEPAGE
import com.example.dreamboundadventures.Navigation.ROUTE_LOGIN
import com.example.dreamboundadventures.Navigation.ROUTE_REGISTER
import com.example.dreamboundadventures.Navigation.ROUTE_TRANSPORT
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.auth.User

//
class TransportView(var navController:NavHostController,var context:Context){

    var mAuth:FirebaseAuth
    val progress:ProgressDialog

    init {
        mAuth= FirebaseAuth.getInstance()
        progress=ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("PLease Wait.....")
    }
    fun signup(email:String,number:String,transport:String){
        progress.show()

        if (email.isBlank() || number.isBlank() ||transport.isBlank()){
            progress.dismiss()
            Toast.makeText(context,"Please enter your email",Toast.LENGTH_LONG).show()
            return
//        }else if (number != confpass){
//            Toast.makeText(context,"Please enter your full name",Toast.LENGTH_LONG).show()
            return
        }else{
            mAuth.createUserWithEmailAndPassword(email,number).addOnCompleteListener {
                if (it.isSuccessful){
                    val userdata=user(email,number,mAuth.currentUser!!.uid)
                    val regRef=FirebaseDatabase.getInstance().getReference()
                        .child("Users/"+mAuth.currentUser!!.uid)
                    regRef.setValue(userdata).addOnCompleteListener {

                        if (it.isSuccessful){
                            Toast.makeText(context,"Booked successfully",Toast.LENGTH_LONG).show()
                            navController.navigate(ROUTE_TRANSPORT)

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
//    fun login(email: String,pass: String){
//        progress.show()
//
//        mAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {
//            progress.dismiss()
//            if (it.isSuccessful){
//                Toast.makeText(context,"Succeffully Logged in",Toast.LENGTH_LONG).show()
//                navController.navigate(ROUTE_HOMEPAGE)
////                navController.navigate(ROUTE_REGISTER)TO TAKE YOU TO A DIIFFERNT PAGE
//            }else{
//                Toast.makeText(context,"${it.exception!!.message}",Toast.LENGTH_LONG).show()
//                navController.navigate(ROUTE_LOGIN)
//            }
//        }
//
//    }
//    fun logout(){
//        mAuth.signOut()
//        navController.navigate(ROUTE_LOGIN)
//    }
//    fun isloggedin():Boolean{
//        return mAuth.currentUser !=null
//    }
//
//}

//class TransportView {
//}