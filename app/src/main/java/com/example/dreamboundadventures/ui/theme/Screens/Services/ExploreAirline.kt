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
import com.example.dreamboundadventures.R

@Composable
fun ExploreAirLineScreen(navController: NavHostController){
    Column (Modifier.verticalScroll(rememberScrollState())){
        Card {
            Text(text = "Emirates")
            Image(painter = painterResource(id= R.drawable.emirates), contentDescription ="taxi" ,
            )
            Button(
                onClick = { navController.navigate("bookingtrans") }) {
                Text(text = "Book Now")

            }
            Card {
                Text(text = "British Airways")
                Image(painter = painterResource(id= R.drawable.british), contentDescription ="taxi" ,
                )
                Button(
                    onClick = { navController.navigate("bookingtrans") }) {
                    Text(text = "Book Now")

                }
                Card {
                    Text(text = "Qatar Airline")
                    Image(painter = painterResource(id= R.drawable.qatar), contentDescription ="taxi" ,
                    )
                    Button(
                        onClick = { navController.navigate("bookingtrans") }) {
                        Text(text = "Book Now")

                    }

            }
        }

    }
}
}