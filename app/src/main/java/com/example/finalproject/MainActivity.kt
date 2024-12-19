package com.example.finalproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.finalproject.ui.theme.FinalProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinalProjectTheme {
                }
            }
        }
    }


var number = 2


@Composable
fun Numbers(modifier: Modifier) {
    Column (modifier = Modifier){



        Button(
            onClick = { minus() },
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)

        ) {
            Image(
                painter = painterResource(id = R.drawable.minus),
                contentDescription = null,
                modifier = Modifier
            )
            
        }


        Text(
            text = "Number $number",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Button(
            onClick = { plus() },
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)

        ) {
            Image(
                painter = painterResource(id = R.drawable.plus),
                contentDescription = null,
                modifier = Modifier
            )

        }

    }

}

fun minus(){
    number --
}

fun plus(){
    number ++
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FinalProjectTheme {
        Numbers(Modifier)
    }
}
