package com.example.placeprep.screens

import android.graphics.Paint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.placeprep.Screen


@Composable
fun Others_Page(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(10.dp),){

        Column(modifier= Modifier
            .fillMaxWidth()
            .align(Alignment.Center)) {


                Text(text = "Coming Soon", fontSize = 25.sp, fontWeight = FontWeight.Bold ,color = Color.Black, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())

//

        }
    }

}

