package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.login.ui.theme.LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview
@Composable
fun saludo() {
    Text(text = "Hola")
}

@Preview
@Composable
fun Usuario() {

}

@Preview
@Composable
fun Contraseña() {

}

@Preview
@Composable
fun BotonLogin() {
    Button(onClick = {},
        colors = ButtonDefaults.buttonColors(
        containerColor = androidx.compose.ui.graphics.Color.Gray,
        contentColor = androidx.compose.ui.graphics.Color.White,
    )){
        Text(text = "INICIAR SESIÓN", fontSize = 20.sp,
            fontWeight = FontWeight.Bold)
    }
}

@Preview
@Composable
fun Login (){
    Column(){

    }

}