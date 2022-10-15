package com.example.placeprep.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.placeprep.Screen


@Composable
fun Projects_Page(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(10.dp),){

        Column(modifier= Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)
                .background(color = MaterialTheme.colors.secondaryVariant),) {
                Text(text = "Projects", fontSize = 25.sp, fontWeight = FontWeight.Bold ,color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)) {
                Button(onClick = { navController.navigate(Screen.MachineLearningLink.route) }, modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 3.dp)
                    .height(100.dp),elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, focusedElevation = 20.dp), colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colors.secondary)) {
                    Text(text = "Machine Learning", textAlign = TextAlign.Center)
                }
                Button(onClick = { navController.navigate(Screen.AndroidLink.route) }, modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 3.dp)
                    .height(100.dp),elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, focusedElevation = 20.dp),colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colors.error)) {
                    Text(text = "Android", textAlign = TextAlign.Center)
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)) {
                Button(onClick = { navController.navigate(Screen.WebLink.route) }, modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 3.dp)
                    .height(100.dp),elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, focusedElevation = 20.dp),) {
                    Text(text = "Web", textAlign = TextAlign.Center)
                }
                Button(onClick = { navController.navigate(Screen.FlutterLink.route)}, modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 3.dp)
                    .height(100.dp),elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, focusedElevation = 20.dp),colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colors.secondary)) {
                    Text(text = "Flutter", textAlign = TextAlign.Center)
                }
            }

        }
    }

}

