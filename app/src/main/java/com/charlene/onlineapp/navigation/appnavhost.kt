package com.charlene.onlineapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.charlene.onlineapp.ui.theme.screens.calculator.CalculatorScreen
import com.charlene.onlineapp.ui.theme.screens.dashboard.DashboardScreen
import com.charlene.onlineapp.ui.theme.screens.home.Home_screen
import com.charlene.onlineapp.ui.theme.screens.intent.IntentScreen
import com.charlene.onlineapp.ui.theme.screens.login.Login_Screen
import com.charlene.onlineapp.ui.theme.screens.myapp.My_app_screen
import com.charlene.onlineapp.ui.theme.screens.register.Register_Screen
import com.charlene.onlineapp.ui.theme.screens.splash.Splash_Screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_SPLASH) {
NavHost(navController = navController,
    modifier = modifier,
    startDestination = startDestination){
    composable(ROUTE_SPLASH){
    Splash_Screen(navController)
    }
    composable(ROUTE_HOME){
        Home_screen(navController)
    }
    composable(ROUTE_REGISTER){
        Register_Screen(navController)
    }
    composable(ROUTE_LOGIN){
        Login_Screen(navController)
    }
    composable(ROUTE_MYAPP){
        My_app_screen(navController)
    }
    composable(ROUTE_CALCULATOR){
        CalculatorScreen(navController)
    }
    composable(ROUTE_DASHBOARD){
        DashboardScreen(navController)
    }
}
}