package br.com.fiap.calculatorimc

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
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
               Spacer(modifier = Modifier.height(20.dp))
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
               Card(
                   modifier = Modifier
                       .fillMaxWidth()
                       .offset(y = (-40).dp),
                   colors = CardDefaults.cardColors(containerColor = Color.White),
                   elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
               ) {
                   Column(
                       modifier = Modifier.padding(
                           horizontal = 32.dp,
                           vertical = 16.dp
                       )
                   ) {
                       Text(
                           text = "Seus Dados",
                           modifier = Modifier.fillMaxWidth(),
                           fontSize = 24.sp,
                           fontWeight = FontWeight.Bold,
                           color = colorResource(id = R.color.header_color),
                           textAlign = TextAlign.Center
                       )
                       Spacer(modifier = Modifier.height(32.dp))

                       Text(
                           text = "Seu peso",
                           modifier = Modifier.padding(bottom = 8.dp),
                           fontSize = 12.sp,
                           fontWeight = FontWeight.Normal,
                           color = colorResource(id = R.color.header_color)
                       )

                       OutlinedTextField(
                           value = "",
                           onValueChange = {},
                           modifier = Modifier.fillMaxWidth(),
                           placeholder = {
                               Text(text = "Digite seu Peso em Kg")
                           },
                           colors = OutlinedTextFieldDefaults.colors(
                               unfocusedBorderColor = colorResource(id = R.color.header_color),
                               focusedBorderColor = colorResource(id = R.color.header_color)
                           ),
                           shape = RoundedCornerShape(16.dp),
                           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                       )

                       Spacer(modifier = Modifier.height(16.dp))

                       Text(
                           text = "Sua altura",
                           modifier = Modifier.padding(bottom = 8.dp),
                           fontSize = 12.sp,
                           fontWeight = FontWeight.Normal,
                           color = colorResource(id = R.color.header_color)
                       )

                       OutlinedTextField(
                           value = "",
                           onValueChange = {},
                           modifier = Modifier.fillMaxWidth(),
                           placeholder = {
                               Text(
                                   text = "Sua Altura em cm"
                               )},
                           colors = OutlinedTextFieldDefaults.colors(
                               unfocusedBorderColor = colorResource(id = R.color.header_color),
                               focusedBorderColor = colorResource(id = R.color.header_color)
                           ),
                           shape = RoundedCornerShape(16.dp),
                           keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                       )
                       Spacer(modifier = Modifier.height(16.dp))

                       Button(
                           onClick = { /*TODO*/ },
                           modifier = Modifier
                               .fillMaxWidth()
                               .height(48.dp),
                           shape = RoundedCornerShape(16.dp),
                           colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.header_color))
                       ) {
                           Text(
                               text = "Calcular",
                               fontWeight = FontWeight.Bold,
                               color = Color.White,
                               fontSize = 14.sp
                           )
                       }
                   }
               }

           }
           Card (
               modifier = Modifier
                   .fillMaxWidth()
                   .height(200.dp)
                   .padding(horizontal = 32.dp, vertical = 24.dp),
               colors = CardDefaults.cardColors(containerColor = Color(0xff329F6B)),
               elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),

           ){
               Row(
                   verticalAlignment = Alignment.CenterVertically,
                   modifier = Modifier
                       .padding(horizontal = 32.dp)
                       .fillMaxSize()
               ) {
                   Column (){
                       Text(
                           text = "Resultado",
                           color = Color.White,
                           fontSize = 14.sp
                       )
                       Text(
                           text = "Peso Ideal",
                           fontWeight = FontWeight.Bold,
                           color = Color.White,
                           fontSize = 20.sp
                       )
                   }
                   Text(
                       text = "23.2",
                       modifier = Modifier.fillMaxWidth(),
                       fontWeight = FontWeight.Bold,
                       fontSize = 36.sp,
                       textAlign = TextAlign.End,
                       color = Color.White
                   )
               }
           }
       }
    }
}
