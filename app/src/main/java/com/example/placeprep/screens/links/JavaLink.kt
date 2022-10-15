package com.example.placeprep.screens.links

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.placeprep.Screen


@Composable
fun JavaLink(navController: NavController) {
    val ctx = LocalContext.current
    Box(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(10.dp),){

        Column(modifier= Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp).background(color = MaterialTheme.colors.secondaryVariant),) {
                Text(text = "Java", fontSize = 25.sp, fontWeight = FontWeight.Bold ,color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)) {
                Button(onClick = {
                    val urlIntent = Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://youtube.com/playlist?list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop")
                    )
                    ctx.startActivity(urlIntent)
                }, modifier = Modifier
                    .weight(2f)
                    .padding(horizontal = 3.dp)
                    .height(100.dp),elevation = ButtonDefaults.elevation(defaultElevation = 10.dp, pressedElevation = 15.dp, focusedElevation = 20.dp), colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colors.secondary)) {
                    Text(text = "Click to View", textAlign = TextAlign.Center)
                }

            }


        }
    }

}
