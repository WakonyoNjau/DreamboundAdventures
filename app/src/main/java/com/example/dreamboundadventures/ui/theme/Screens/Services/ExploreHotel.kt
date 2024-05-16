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
fun ExploreHotelScreen(navController: NavHostController){
    Column {
        Text(text = "StarBucks Hotel")
        Card {
            Image(painter = painterResource(id= R.drawable.hilton), contentDescription ="hoteli" ,
            )
            Button(
                onClick = { navController.navigate(ROUTE_BOOKINGTRANS) }) {
                Text(text = "Book Now")

            }
            Card {
                Text(text = "Sarova Whitesands")
                Image(painter = painterResource(id= R.drawable.sarova), contentDescription ="taxi" ,
                )
                Button(
                    onClick = { navController.navigate(ROUTE_BOOKINGTRANS) }) {
                    Text(text = "Book Now")

                }
//                Card {
//                    Text(text = "StarBucks Hotel")
//                    Image(painter = painterResource(id= R.drawable.endpoint
//                    ), contentDescription ="taxi" ,
//                    )
//                    Button(
//                        onClick = { navController.navigate(ROUTE_BOOKINGTRANS) }) {
//                        Text(text = "Book Now")
//
//                    }

                }
            }

        }
    }
