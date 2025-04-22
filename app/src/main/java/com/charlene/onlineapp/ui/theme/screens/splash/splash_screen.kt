package com.charlene.onlineapp.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charlene.onlineapp.R
import com.charlene.onlineapp.navigation.ROUTE_HOME
import com.charlene.onlineapp.ui.theme.Mygreen
import com.charlene.onlineapp.ui.theme.Mynewcolor
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun Splash_Screen(navController: NavHostController ){
    val coroutine= rememberCoroutineScope()
    coroutine.launch {
        delay(3000)
        navController.navigate(ROUTE_HOME)
    }

    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Mynewcolor)
    ) {
        Image(painter = painterResource(R.drawable.splash),
            contentDescription = "splash",
            modifier = Modifier
                .width(300.dp)
                .height(300.dp))
        Text("Roses",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Mygreen
        )

    }

}

@Preview
@Composable
private fun Splashprev() {
    Splash_Screen(rememberNavController() )
}





