package com.charlene.onlineapp.ui.theme.screens.login

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charlene.onlineapp.navigation.ROUTE_HOME
import com.charlene.onlineapp.navigation.ROUTE_LOGIN
import com.charlene.onlineapp.navigation.ROUTE_REGISTER
import com.charlene.onlineapp.navigation.ROUTE_SPLASH
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun Login_Screen(navController: NavHostController) {


    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }


    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)) {
        Text("The login Screen",
            color = Color.Green,
            fontSize =35.sp,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(value = email, onValueChange = {email=it},
           label = { Text("Enter email",
              color = Color.White,
               fontSize = 25.sp,
               fontFamily = FontFamily.Monospace,
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(4.dp)
           ) }
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(value = password, onValueChange = {password=it},
           label = { Text("Enter password",
              color = Color.White,
               fontSize = 25.sp,
               fontFamily = FontFamily.Monospace,
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(4.dp)
           ) }
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.fillMaxWidth()) {
            Text("Click to Log in",
                color = Color.Black,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Text("   Don't have an account?    ",
            color = Color.Magenta,
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.SansSerif
        )
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





    }

}

@Preview
@Composable
private fun LoginPrev() {
    Login_Screen(rememberNavController())

}