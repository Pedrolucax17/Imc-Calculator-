package br.com.fiap.calculatorimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.calculatorimc.ui.theme.CalculatorImcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorImcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    IMCScreen()
                }
            }
        }
    }
}

@Composable
fun IMCScreen(){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
       Column (
           modifier = Modifier.fillMaxSize()
       ){
           Column(
               horizontalAlignment = Alignment.CenterHorizontally,
               modifier = Modifier
                   .fillMaxWidth()
                   .height(200.dp)
                   .background(colorResource(id = R.color.header_color))
           ) {
               Spacer(modifier = Modifier.height(16.dp))
               Image(
                   painter = painterResource(id = R.drawable.imc),
                   contentDescription = "Imc Image",
                   modifier = Modifier
                       .size(60.dp)
                       .clip(shape = CircleShape),
                   contentScale = ContentScale.Crop
               )
               Spacer(modifier = Modifier.height(16.dp))
               Text(
                   text = "CALCULADORA IMC",
                   color = colorResource(id = R.color.white),
                   fontSize = 20.sp,
                   fontWeight = FontWeight.Bold
               )
           }

           Column(
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(horizontal = 32.dp)
           )
           {

           }
       }
    }
}
