package com.charlene.onlineapp.ui.theme.screens.intent

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.MediaStore
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charlene.onlineapp.R
import com.charlene.onlineapp.ui.theme.Mygreen
import com.charlene.onlineapp.ui.theme.Myorange
import androidx.core.net.toUri


@Composable
fun IntentScreen(navController: NavHostController) {
    val context= LocalContext.current

//    create 7 buttons ;call,dial,camera,sms,share,stk,email
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Myorange)) {

        Image(painter = painterResource(id = R.drawable.intent),
            contentDescription = "intent")

        Spacer(modifier = Modifier.height(30.dp))


        Button(onClick = {
            val intent = Intent(Intent.ACTION_CALL, ("tel:" + "+254722421532").toUri())

            if (ContextCompat.checkSelfPermission(
                    context,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    context as Activity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                context.startActivity(intent)
            }
        },


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

        Button(onClick = {

                val phone = "+254722421532"

                val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

                context.startActivity(intent)

        },
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

        Button(onClick = {

                val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

                startActivityForResult(context as Activity,takePictureIntent,1,null)

        },
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

        Button(onClick = {

            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            context.startActivity(shareIntent)

        },
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

        Button(onClick = {
            val uri = "sms to:07456789".toUri()

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How is today's weather")

            context.startActivity(intent)

        },
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

        Button(onClick = {
            val simToolKitLaunchIntent =
                context.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { context.startActivity(it) }

        },
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

        Button(onClick = {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")
            context.startActivity(emailIntent)
        },
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