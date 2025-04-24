package com.charlene.onlineapp.ui.theme.screens.intent

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
import com.charlene.onlineapp.ui.theme.Mygreen
import com.charlene.onlineapp.ui.theme.Myorange


@Composable
fun IntentScreen(navController: NavHostController) {

//    create 7 buttons ;call,dial,camera,sms,share,stk,email
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Myorange)) {

        Image(painter = painterResource(id = R.drawable.intent),
            contentDescription = "intent")

        Spacer(modifier = Modifier.height(30.dp))


        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Mygreen),
            modifier = Modifier.width(300.dp)) {
            Text("CALL",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold

            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Mygreen),
            modifier = Modifier.width(300.dp)) {
            Text("DIAL",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold

            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Mygreen),
            modifier = Modifier.width(300.dp)) {
            Text("CAMERA",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold

            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Mygreen),
            modifier = Modifier.width(300.dp)) {
            Text("SHARE",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold

            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Mygreen),
            modifier = Modifier.width(300.dp)) {
            Text("SMS",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold

            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Mygreen),
            modifier = Modifier.width(300.dp)) {
            Text("STK",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold

            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Mygreen),
            modifier = Modifier.width(300.dp)) {
            Text("EMAIL",
                color = Color.Black,
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold

            )
        }


    }

}

@Preview
@Composable
private fun IntentPrev() {
    IntentScreen(rememberNavController())

}