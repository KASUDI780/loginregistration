package com.charlene.onlineapp.ui.theme.screens.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.charlene.onlineapp.navigation.ROUTE_CALCULATOR
import com.charlene.onlineapp.navigation.ROUTE_DASHBOARD
import com.charlene.onlineapp.navigation.ROUTE_INTENT
import com.charlene.onlineapp.navigation.ROUTE_MYSCREEN
import com.charlene.onlineapp.ui.theme.MyBlue
import com.charlene.onlineapp.ui.theme.NewBlue

@Composable
fun My_app_screen(navController: NavHostController) {
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(NewBlue)){

        Image(painter = painterResource(id = R.drawable.myapp),
            contentDescription = "myimage")

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {navController.navigate(ROUTE_CALCULATOR)},
            colors = ButtonDefaults.buttonColors(MyBlue),
            modifier = Modifier.width(300.dp)) {
            Text("CALCULATOR",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {navController.navigate(ROUTE_INTENT)},
            colors = ButtonDefaults.buttonColors(MyBlue),
            modifier = Modifier.width(300.dp)) {
            Text("INTENT",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold

            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {navController.navigate(ROUTE_DASHBOARD)},
            colors = ButtonDefaults.buttonColors(MyBlue),
            modifier = Modifier.width(300.dp)) {
            Text("DASHBOARD",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold

            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {navController.navigate(ROUTE_MYSCREEN)},
            colors = ButtonDefaults.buttonColors(MyBlue),
            modifier = Modifier.width(300.dp)) {
            Text("MY SCREEN",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold

            )
        }

    }

}

@Preview
@Composable
private fun MyappPrev() {
    My_app_screen(rememberNavController())

}