package com.charlene.onlineapp.ui.theme.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charlene.onlineapp.R
import com.charlene.onlineapp.navigation.ROUTE_DASHBOARD
import com.charlene.onlineapp.navigation.ROUTE_LOGIN
import com.charlene.onlineapp.navigation.ROUTE_MYAPP
import com.charlene.onlineapp.navigation.ROUTE_MYSCREEN
import com.charlene.onlineapp.navigation.ROUTE_REGISTER
import com.charlene.onlineapp.ui.theme.MyBlue

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun Home_screen(navController: NavHostController) {


    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)) {
        Text("Kasudi's App",
            color = Color.Blue,
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace,

        )
        Spacer(modifier = Modifier.height(30.dp))
        Text("Welcome to Kasudi's app",
            color = Color.Magenta,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_LOGIN)},
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            modifier = Modifier.width(300.dp)
        ) {
            Text("Click to Log in",
                color = Color.Black,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
            )

        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {navController.navigate(ROUTE_REGISTER)},
            colors = ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier.width(300.dp)
        ) {
            Text("Click to register",
                color = Color.Black,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {navController.navigate(ROUTE_MYAPP)},
            colors = ButtonDefaults.buttonColors(MyBlue),
            modifier = Modifier.width(300.dp)) {
            Text("My App",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Cursive
            )
        }



        Spacer(modifier = Modifier.height(30.dp))
        Image(painter = painterResource(id = R.drawable.blackrose),
            contentDescription = "rose",
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
        )




    }


}

@Preview
@Composable
private fun HomePrev() {
    Home_screen(rememberNavController())

}