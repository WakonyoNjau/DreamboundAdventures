package com.example.dreamboundadventures.ui.theme.Screens.Services

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
//import com.example.dreamboundadventures.Navigation.ROUTE_BOOKINGTRANS
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_AIRLINE
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_CAR
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_TRAIN
import com.example.dreamboundadventures.R

@Composable
fun TransportScreen(navController: NavHostController){
    Column (Modifier.verticalScroll(rememberScrollState())){
        Text(text = "Road Transport")
        Card {
            Image(
                painter = painterResource(id = R.drawable.road), contentDescription = "hoteli",
            )
            Button(
                onClick = { navController.navigate("explorecar") }) {
                Text(text = "Explore More")

            }
            Card {
                Text(text = "Air Transport")
                Image(
                    painter = painterResource(id = R.drawable.british), contentDescription = "taxi",
                )
                Button(
                    onClick = { navController.navigate("exploreairline") }


                ) {
                    Text(text = "Explore More")

                }
                Card ( modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Train Transport")
                    Image( modifier = Modifier.fillMaxSize(),
                        painter = painterResource(id = R.drawable.tr11),
                        contentDescription = "taxi",
                    )
                    Button(
                        onClick = { navController.navigate("exploretrain") }) {
                        Text(text = "Explore More")

                    }


                }
            }

        }
    }
}
