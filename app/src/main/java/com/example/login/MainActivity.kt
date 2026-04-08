package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.login.ui.theme.LoginTheme
import kotlin.jvm.java

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        Login()
        }
    }
}

@Preview
@Composable
fun Login(){
    Column (modifier = Modifier.fillMaxSize()
        .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = "Inicio de Sesión",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,

            )

        Contenedor()
    }
}

@Preview
@Composable
fun Usuario() {
    var user by remember { mutableStateOf("") }

    OutlinedTextField(
        colors= OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White
            ),
        value = user,
        onValueChange = { user = it },
        placeholder = {Text("Ingrese Usuario")},
        label = {Text(text="Usuario",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = androidx.compose.ui.graphics.Color.Black )
                 },

        keyboardOptions = KeyboardOptions.Default,
        maxLines = 1
    )
}


@Preview
@Composable
fun Contraseña() {
    var pasword by remember { mutableStateOf("") }

    OutlinedTextField(
        colors= OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White
        ),
        value = pasword,
        onValueChange = { pasword = it },
        placeholder = {Text("Ingrese Contraseña")},
        label = {Text(text="Contraseña",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = androidx.compose.ui.graphics.Color.Black )
                },

        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done),
        maxLines = 1
    )
}


@Preview
@Composable
fun BotonLogin() {
    Button(onClick = {},
        colors = ButtonDefaults.buttonColors(
        containerColor = Color.Gray,
        contentColor = Color.White,
    )){
        Text(text = "INGRESAR",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)
    }
}


@Preview
@Composable
fun TextoRegistro(){
 val registro = LocalContext.current
    Text(
        text = "Registrate",
        color = Color.Blue,
        textDecoration = TextDecoration.Underline,
        modifier = Modifier.clickable {
            val intent = Intent(registro, Registro::class.java)
            registro.startActivity(intent)
        }
    )
}

@Preview
@Composable
fun Contenedor (){
    Column(modifier = Modifier
        .background(color = Color(0xFFFF2F2F2))
        .border(width = 2.dp, color = Color.Black)
        .padding( horizontal = 30.dp, vertical = 50.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Usuario()
        Contraseña()
        Text(text = "¿No estas registrado?",
            fontSize = 15.sp, fontWeight = FontWeight.Bold)
        /*TextoRegistro()*/
        BotonLogin()

    }



}