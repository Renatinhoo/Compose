package com.example.compose
//importando as funções do compose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}

data class Message(val author: String, val body: String)    //adicionando mais informações ao elemento de composição da imagem

@Composable     //tornando a função composta
fun MessageCard(msg: com.example.compose.Message) {
    // adicionando preenchimento envolta da mensagem
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(  //modificando e codificando a imagem
            painter = painterResource(R.drawable.profile_picture),  //puxando a imagem
            contentDescription = "Contact profile picture",  // adicionando conteudo pra descrição da imagem
            modifier = Modifier  //iniciando o modifier para alterar a imagem

                    //alterando o tamanho da imagem pra 40 dp
                .size(40.dp)

                    //deixando a imagem definidia como um circulo
                .clip(CircleShape)
        )


        //icionando espaço horizontal entre a imagem e a coluna
        Spacer(modifier = Modifier.width(8.dp))
        //iniciando uma collum pra alterar os elementos verticalmente
        Column {
            Text(text = msg.author)
            // Add a vertical space between the author and message texts
            //adi
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body)
        }
    }
}
  