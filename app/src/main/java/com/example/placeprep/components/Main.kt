package com.example.placeprep.components



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.placeprep.R
import com.example.placeprep.Screen

//@Preview(showBackground = true)
@Composable
fun Main(navController: NavController){
    Box(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(10.dp),){
        Image(painter = painterResource(R.drawable.thesis_amico), contentDescription = "Main_Image" , alignment = Alignment.Center)
        Column(modifier= Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)
                .background(color = MaterialTheme.colors.secondaryVariant),) {
                Text(text = "Select Subjects", fontSize = 25.sp, fontWeight = FontWeight.Bold ,color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)) {
                Button(onClick = { navController.navigate(route = Screen.LanguageFundamental.route) }, modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 3.dp)
                    .height(100.dp),elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, focusedElevation = 20.dp), colors = ButtonDefaults.buttonColors(MaterialTheme.colors.secondary)) {
                    Text(text = "Language Fundamentals", textAlign = TextAlign.Center)
                }
                Button(onClick = { navController.navigate(route = Screen.ProblemSolving.route) }, modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 3.dp)
                    .height(100.dp),elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, focusedElevation = 20.dp),colors = ButtonDefaults.buttonColors(MaterialTheme.colors.error)) {
                    Text(text = "Problem Solving", textAlign = TextAlign.Center)
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)) {
                Button(onClick = { navController.navigate(route = Screen.ProjectPage.route) }, modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 3.dp)
                    .height(100.dp),elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, focusedElevation = 20.dp),) {
                    Text(text = "Projects", textAlign = TextAlign.Center)
                }
                Button(onClick = { navController.navigate(route = Screen.CoreSubjects.route) }, modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 3.dp)
                    .height(100.dp),elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, focusedElevation = 20.dp),colors = ButtonDefaults.buttonColors(MaterialTheme.colors.secondary)) {
                    Text(text = "Core Subjects", textAlign = TextAlign.Center)
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)) {
                Button(onClick = { navController.navigate(route = Screen.Other.route) }, modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 3.dp)
                    .height(100.dp),elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, focusedElevation = 20.dp),colors = ButtonDefaults.buttonColors(MaterialTheme.colors.error)) {
                    Text(text = "Others", textAlign = TextAlign.Center)
                }

            }
        }
    }
}