package com.example.dreamboundadventures.ui.theme.Screens.Home

import android.media.Image
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.GenericFontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
//import com.example.dreamboundadventures.Navigation.ROUTE_ACCOMMODATION
//import com.example.dreamboundadventures.Navigation.ROUTE_BOOKINGTRANS
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_AIRLINE
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_APARTMENT
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_CAMP
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_CAR
//import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_HOTEL
//import com.example.dreamboundadventures.Navigation.ROUTE_HOMEPAGE
//import com.example.dreamboundadventures.Navigation.ROUTE_ITINERARY
//import com.example.dreamboundadventures.Navigation.ROUTE_OUR_SERVICES
//import com.example.dreamboundadventures.Navigation.ROUTE_REGISTER
//import com.example.dreamboundadventures.Navigation.ROUTE_TRANSPORT
import com.example.dreamboundadventures.R





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize())
    {
        Image(
            painter = painterResource(id = R.drawable.homescreen),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
//    Image(painter = painterResource(id = R.drawable.homepage), contentDescription ="homepage" )


        Column(
            modifier = Modifier
                .fillMaxSize(),
//        .background(Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {


            val context = LocalContext.current.applicationContext
            androidx.compose.material3.TopAppBar(title = { Text(text = "DreamBound Adventures") },
                navigationIcon = {


//                    IconButton(onClick = { TODO() }) {
//                        Icon(
//                            painter = painterResource(id = R.drawable.homepage),
//                            contentDescription = "/DreamBound Adventures/"
//                        )
////        Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu", tint = Color.White)
//
//                    }
//                },
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color.White,
//                    titleContentColor = Color.Black,
//                    navigationIconContentColor = Color.Black
//                ), actions = {
                    Row {
                        IconButton(onClick = {
                            navController.navigate("Homepage")
                            Toast.makeText(
                                context,
                                "Home",
                                Toast.LENGTH_SHORT
                            ).show()
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Home,
                                contentDescription = "Home",
                                tint = Color.White
                            )
                        }

                        IconButton(onClick = {
                            navController.navigate("Ourservices")
                            Toast.makeText(
                                context,
                                "Our Services",
                                Toast.LENGTH_SHORT
                            ).show()
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = "Our Services",
                                tint = Color.White
                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))

//                    IconButton(onClick = {navController.navigate(ROUTE_CONTACT_US)
//                        Toast.makeText(
//                            context,
//                            "My profile",
//                            Toast.LENGTH_SHORT
//                        ).show()
//                    })
//                    {
//                        Icon(
//                            imageVector = Icons.Filled.Person,
//                            contentDescription = "My profile",
//                            tint = Color.Black
//                        )

                    }


//                    Text(
//                        textAlign = Alignment.BottomCenter,
//                        text = "Welcome to DreamBound Adventures",
//                        color = Color.Blue, fontFamily = FontFamily.Serif, fontSize = 20.sp
//                    )


                })
        }


    }





    fun Text(
        textAlign: Alignment,
        text: String,
        color: Color,
        fontFamily: GenericFontFamily,
        fontSize: TextUnit
    ) {


    }

//@Composable
//fun ImageCard(painter: Painter,
//              contentDescription: String,
//              title: String,
//              modifier: Modifier = Modifier){
//    Card(
////        modifier = Modifier.fillMaxWidth(),
//        shape = RoundedCornerShape(15.dp),
//        elevation = CardDefaults.cardElevation(10.dp)
//    ){
//        Box(modifier = Modifier.height(200.dp)
//        ) {
//            Image(painter = painter , contentDescription = contentDescription)
//            Box(modifier = Modifier
//                .matchParentSize()
////                .fillMaxSize()
//                .padding(10.dp),
//                contentAlignment = Alignment.BottomCenter
//            ){
//                Text(text = "OUR SERVICES")
//            }
//        }
//        Button(
//            onClick = {
//                val navController = null
//                navController.navigate(ROUTE_ITINERARY)
//            }) {
//            Text(text = "To itinerary")
//
//        }
//
//    }
//}
//
//private fun Nothing?.navigate(routeItinerary: String) {
//
//
//}
}
@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}