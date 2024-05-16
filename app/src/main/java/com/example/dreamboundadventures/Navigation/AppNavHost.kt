package com.example.dreamboundadventures.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.example.myandroidproject.ui.theme.Screens.ContactUs.ContactUs
import com.example.dreamboundadventures.ui.theme.Screens.Home.HomeScreen
import com.example.dreamboundadventures.ui.theme.Screens.Login.LoginScreen
//import com.example.myandroidproject.ui.theme.Screens.OurServices.ItineraryScreen
import com.example.dreamboundadventures.ui.theme.Screens.Register.RegisterScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.AccommodationScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.AccommodationScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.BookingAccomodationScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.BookingScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.ExploreAirLineScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.ExploreApartmentScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.ExploreCampScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.ExploreCarScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.ExploreCarScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.ExploreHotelScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.ExploreTrainScreen
//import com.example.dreamboundadventures.ui.theme.Screens.Services.ItineraryScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.OurServicesScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.OurServicesScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.TransportScreen
import com.example.dreamboundadventures.ui.theme.Screens.Services.TransportScreen


@Composable
fun  AppNavHost(modifier: Modifier = Modifier, navController: androidx.navigation.NavHostController =  rememberNavController(), startDestination:String = ROUTE_REGISTER ){
    NavHost(navController = navController, modifier = modifier, startDestination = startDestination) {
        composable(ROUTE_HOMEPAGE) {
            HomeScreen(navController)
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }
        composable(ROUTE_OUR_SERVICES) {
            OurServicesScreen(navController)
        }
//        composable(ROUTE_ITINERARY) {
//            ItineraryScreen(navController)
//        }
        composable(ROUTE_EXPLORE_CAR) {
            ExploreCarScreen(navController)
        }
        composable(ROUTE_BOOKINGTRANS) {
            BookingAccomodationScreen(navController)
        }
        composable(ROUTE_EXPLORE_AIRLINE) {
            ExploreAirLineScreen(navController)
        }
        composable(ROUTE_EXPLORE_TRAIN) {
           ExploreTrainScreen(navController)
        }
        composable(ROUTE_EXPLORE_HOTEL) {
            ExploreHotelScreen(navController)
        }
        composable(ROUTE_EXPLORE_CAMP) {
            ExploreCampScreen(navController)
        }
        composable(ROUTE_EXPLORE_APARTMENT) {
            ExploreApartmentScreen(navController)
        }
        composable(ROUTE_TRANSPORT) {
            TransportScreen(navController)
        }
        composable(ROUTE_ACCOMMODATION) {
            AccommodationScreen(navController)
        }

//        composable(ROUTE_ACCOMMODATION) {
//            AccommodationCard(navController)
//        }
    }
}