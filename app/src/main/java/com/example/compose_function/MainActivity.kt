package com.example.compose_function
//importando as funções do compose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_function.ui.theme.AulaTesteTheme  //importando

//₢riando classe principal
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)  //Criando um metodo para o texto
        setContent {                   //definindo onde vou chamar as funções do layout

        }
    }
}

@Composable          //tornando a função composta
fun MessageCard(name: String) {          //definindo a função que vai receber o texto
    Text(text = "Olá $name!")
}

@Preview(showBackground = true)      //usando a função preview para poder visualizar as funções criadas sem reiniciar o app
@Composable
fun DefaultPreview() {
    AulaTesteTheme {
        MessageCard("Android")
    }
}