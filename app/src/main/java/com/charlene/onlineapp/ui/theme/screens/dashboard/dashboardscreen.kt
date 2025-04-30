package com.charlene.onlineapp.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.charlene.onlineapp.R
import com.charlene.onlineapp.navigation.ROUTE_HOME
import com.charlene.onlineapp.navigation.ROUTE_REGISTER
import com.charlene.onlineapp.ui.theme.Mygreen
import com.charlene.onlineapp.ui.theme.Mynewcolor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Mynewcolor)
        .verticalScroll(rememberScrollState())) {

//        start box
        Box {
//         card
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(Mygreen)

            ){
                TopAppBar(
                    title = { Text("DashboardSection") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu,
                                contentDescription = "menu")
                        }
                    },
                )
                Text("A mall or shopping center is a large building that is full of many smaller shops and stores.It is different from earlie markets or bazaars",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
//            end of card

            Card(modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .align(alignment = Alignment.BottomCenter)
                .padding(start = 20.dp, end = 20.dp)
                .offset(y = 90.dp)) {
//                contents of card
                Image(
                    painter = painterResource(R.drawable.mall3),
                    contentDescription = "home",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
                Spacer(modifier =Modifier.width(10.dp) )
                Column {
                    Text("Rose Mall",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold)
                }
//                end of card

            }
        }
//        end of box
        Spacer(modifier =Modifier.height(100.dp) )

//        start of row
        Row (modifier = Modifier.padding(20.dp)) {
//            Card 1
            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable { navController.navigate(ROUTE_HOME) }
                ,
                elevation = CardDefaults.cardElevation()
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.icon2),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        "Home",
                        fontSize = 15.sp
                    )
                }
            }
//            end of card
            Spacer(modifier = Modifier.width(20.dp))

            //card2
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable { navController.navigate(ROUTE_REGISTER) },
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.mall3),
                        contentDescription = "home",
                        modifier=Modifier.size(100.dp)
                    )
                    Text("About",
                        fontSize = 15.sp)
                }

            }

//    end of card2

        }
//        end of row
        Spacer(modifier = Modifier.height(20.dp))
        Row (modifier = Modifier.padding(20.dp)){
//    card1
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable { },
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.mall3),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Contacts", fontSize = 15.sp)

                }
            }
//    end of card1
            Spacer(modifier = Modifier.width(20.dp))
//    card2
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable {  },
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.mall3),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Products", fontSize = 15.sp)
                }


            }

            //End of Card2



        }

        //End of Row
        Row (modifier = Modifier.padding(20.dp)){

            //Card2
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable {  },
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.myapp),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Products", fontSize = 15.sp)
                }


            }

            //End of Card2

            Spacer(modifier = Modifier.width(20.dp))
//Card2
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable {  },
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.mall1),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Products", fontSize = 15.sp)
                }


            }

            //End of Card2
        }


    }


}




@Preview
@Composable
private fun DashPrev() {
    DashboardScreen(rememberNavController())

}