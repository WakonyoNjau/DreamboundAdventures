package com.example.dreamboundadventures.ui.theme.Screens.Services

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
//import com.example.dreamboundadventures.Navigation.ROUTE_ACCOMMODATION
//import com.example.dreamboundadventures.Navigation.ROUTE_BOOKINGTRANS
//import com.example.dreamboundadventures.Navigation.ROUTE_TRANSPORT
import com.example.dreamboundadventures.R

@Composable
fun OurServicesScreen(navController: NavHostController){
    Column {
        Card {
            Text(
                text = "TRANSPORT SERVICES")
            Image(painter = painterResource(id= R.drawable.taxi), contentDescription ="taxi" ,
            )
            Button(
                onClick = { navController.navigate("transport") }) {
                Text(text = "Explore More")

            }
            Card {
                Text(text = "ACCOMMODATION FACILITIES")
                Image(painter = painterResource(id= R.drawable.hilton), contentDescription ="taxi" ,
                )
                Button(
                    onClick = { navController.navigate("accommodation") }) {
                    Text(text = "Explore More")


                }


            }

        }
    }
}