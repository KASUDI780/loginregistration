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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charlene.onlineapp.R
import com.charlene.onlineapp.ui.theme.Myblue
import com.charlene.onlineapp.ui.theme.Newblue

@Composable
fun My_app_screen(navController: NavHostController) {
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Newblue)){

        Image(painter = painterResource(id = R.drawable.myapp),
            contentDescription = "myimage")

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Myblue),
            modifier = Modifier.width(300.dp)) {
            Text("CALCULATOR",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Myblue),
            modifier = Modifier.width(300.dp)) {
            Text("INTENT",
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