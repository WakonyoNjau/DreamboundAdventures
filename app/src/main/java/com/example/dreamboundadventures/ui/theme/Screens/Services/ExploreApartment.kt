package com.example.dreamboundadventures.ui.theme.Screens.Services

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.dreamboundadventures.Navigation.ROUTE_BOOKINGTRANS
import com.example.dreamboundadventures.R

@Composable
fun ExploreApartmentScreen(navController: NavHostController){
    Column {
        Card {
            Text(text = "Lake View Apartments")
            Image(painter = painterResource(id= R.drawable.lakeview), contentDescription ="taxi" ,
            )
            Button(
                onClick = { navController.navigate(ROUTE_BOOKINGTRANS) }) {
                Text(text = "Book Now")

            }
            Card {
                Text(text = "Mary Vale Apartments")
                Image(painter = painterResource(id= R.drawable.maryvale), contentDescription ="taxi" ,
                )
                Button(
                    onClick = { navController.navigate(ROUTE_BOOKINGTRANS) }) {
                    Text(text = "Book Now")

                }
                Card {
                    Text(text = "Adams Apartment")
                    Image(painter = painterResource(id= R.drawable.adams), contentDescription ="taxi" ,
                    )
                    Button(
                        onClick = { navController.navigate(ROUTE_BOOKINGTRANS) }) {
                        Text(text = "Book Now")

                    }

                }
            }

        }
    }
}