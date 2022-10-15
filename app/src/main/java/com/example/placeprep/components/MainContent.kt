package com.example.placeprep.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MainContent(){
    Box(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(10.dp),){
        Column(modifier= Modifier.fillMaxWidth()){
//            Text(text = "Main Content")
//            Text(text = "Main Content")
            Row(modifier = Modifier.fillMaxWidth()) {



                    Card(modifier = Modifier
                        .weight(2f)
                        .height(150.dp)
                        .padding(10.dp)
                        .align(Alignment.CenterVertically), elevation = 5.dp, shape = RoundedCornerShape(1.dp), backgroundColor = MaterialTheme.colors.primary,) {
                        Text(text = "CSE", modifier = Modifier.align(Alignment.CenterVertically), textAlign = TextAlign.Center)

                    }

                Card(modifier = Modifier
                    .weight(2f)
                    .height(150.dp)
                    .padding(10.dp)
                    .align(Alignment.CenterVertically), elevation = 5.dp,shape = RoundedCornerShape(1.dp), backgroundColor = MaterialTheme.colors.primary,) {
                    Text(text = "CSE AI", modifier = Modifier.align(Alignment.CenterVertically), textAlign = TextAlign.Center)

                }



            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Card(modifier = Modifier
                    .weight(2f)
                    .height(140.dp)
                    .padding(10.dp)
                    .align(Alignment.CenterVertically), elevation = 5.dp, shape = RoundedCornerShape(1.dp), backgroundColor = MaterialTheme.colors.primary,) {
                    Text(text = "CSBS", modifier = Modifier.align(Alignment.CenterVertically), textAlign = TextAlign.Center)

                }




            }

        }
    }
}