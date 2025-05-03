package com.charlene.onlineapp.ui.theme.screens.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charlene.onlineapp.ui.theme.NewBlue

@Composable
fun CalculatorScreen(@Suppress("UNUSED_PARAMETER") navController: NavHostController) {
    var fnum by remember { mutableStateOf(TextFieldValue("")) }
    var snum by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(NewBlue)) {


        Text(answer,
            color = Color.Black,
            fontSize =35.sp,
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(value = fnum, onValueChange = {fnum=it},
            label = { Text("Enter First Number",
                color = Color.White,
                fontSize = 25.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)) }
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(value = snum, onValueChange = {snum=it},
            label = { Text("Enter Second Number",
                color = Color.White,
                fontSize = 25.sp,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)) }
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            val myfirstnum=fnum.text.trim()
            val mysecondnum=snum.text.trim()
            if (myfirstnum.isEmpty() &&mysecondnum.isEmpty()){
                answer="Please fill in all detail"
            }else {
                val myanswer = myfirstnum.toDouble() +mysecondnum.toDouble()
                answer = myanswer.toString()
            }
        },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.width(150.dp)) {
            Text("+",
                color = Color.Black,
                fontSize = 40.sp,
                fontFamily = FontFamily.Serif
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            val myfirstnum=fnum.text.trim()
            val mysecondnum=snum.text.trim()
            if (myfirstnum.isEmpty() &&mysecondnum.isEmpty()){
                answer="Please fill in all detail"
            }else {
                val myanswer = myfirstnum.toDouble() - mysecondnum.toDouble()
                answer = myanswer.toString()
            }
        },
                colors = ButtonDefaults.buttonColors(Color.Blue),
                modifier = Modifier.width(150.dp)) {
                Text("-",
                    color = Color.Black,
                    fontSize = 40.sp,
                    fontFamily = FontFamily.Serif
                )}

                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = {
                    val myfirstnum=fnum.text.trim()
                    val mysecondnum=snum.text.trim()
                    if (myfirstnum.isEmpty() &&mysecondnum.isEmpty()){
                        answer="Please fill in all detail"
                    }else {
                        val myanswer = myfirstnum.toDouble() / mysecondnum.toDouble()
                        answer = myanswer.toString()
                    }
                },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    modifier = Modifier.width(150.dp)) {
                    Text("/",
                        color = Color.Black,
                        fontSize = 40.sp,
                        fontFamily = FontFamily.Serif
                    )}

                Spacer(modifier = Modifier.height(30.dp))
                Button(onClick = {
                    val myfirstnum=fnum.text.trim()
                    val mysecondnum=snum.text.trim()
                    if (myfirstnum.isEmpty() &&mysecondnum.isEmpty()){
                        answer="Please fill in all detail"
                    }else {
                        val myanswer = myfirstnum.toDouble() * mysecondnum.toDouble()
                        answer = myanswer.toString()
                    }
                },
                        colors = ButtonDefaults.buttonColors(Color.Blue),
                        modifier = Modifier.width(150.dp)) {
                        Text("*",
                            color = Color.Black,
                            fontSize = 40.sp,
                            fontFamily = FontFamily.Serif
                        )

                    }

    }
}

@Preview
@Composable
private fun CalcPrev() {
    CalculatorScreen(rememberNavController())

}


