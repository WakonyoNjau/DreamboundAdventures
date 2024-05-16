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
fun ExploreTrainScreen(navController: NavHostController){
    Column {
        Card {
            Text(text = "Steam Locomotive")
            Image(painter = painterResource(id= R.drawable.electrictrain), contentDescription ="taxi" ,
            )
            Button(
                
                onClick = { navController.navigate(ROUTE_BOOKINGTRANS) }) {
                Text(text = "Book Now")

            }
            Card {
                Text(text = "Electric Train")
                Image(painter = painterResource(id= R.drawable.manualtrain), contentDescription ="taxi" ,
                )
                Button(
                    onClick = { navController.navigate(ROUTE_BOOKINGTRANS) }) {
                    Text(text = "Book Now")

                }

            }
        }

    }
}