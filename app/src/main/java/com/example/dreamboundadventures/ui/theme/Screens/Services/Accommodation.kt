package com.example.dreamboundadventures.ui.theme.Screens.Services

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
//import com.example.dreamboundadventures.Navigation.ROUTE_BOOKINGTRANS
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_AIRLINE
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_APARTMENT
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_CAMP
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_CAR
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_HOTEL
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_TRAIN
import com.example.dreamboundadventures.R

@Composable
fun AccommodationScreen(navController: NavHostController){
    Column (Modifier.verticalScroll(rememberScrollState())){
        Text(text = "Hotel Accomodation")
        Card {
            Image(
                painter = painterResource(id = R.drawable.hilton), contentDescription = "hoteli",
            )
            Button(
                onClick = { navController.navigate("explorehotel") }) {
                Text(text = "Explore More")

            }
            Card {
                Text(text = "Camp Accommodation")
                Image(
                    painter = painterResource(id = R.drawable.cabin), contentDescription = "taxi",
                )
                Button(
                    onClick = { navController.navigate("explorecamp") }) {
                    Text(text = "Explore More")

                }
                Card {
                    Text(text = "Apartment Accommodation")
                    Image(
                        painter = painterResource(id = R.drawable.adams),
                        contentDescription = "taxi",
                    )
                    Button(
                        onClick = { navController.navigate("exploreapartment") }) {
                        Text(text = "Explore More")

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
}
