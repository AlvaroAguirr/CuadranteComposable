package com.example.cuadrantecomposable

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableInferredTarget
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecomposable.ui.theme.CuadranteComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Cuadrante()
                }
            }
        }
    }
}


@Composable
fun Cuadrante(){
    Column (Modifier.fillMaxWidth()){
        Row (Modifier.weight(1f)){
            Cuar(
                title= stringResource(R.string.Text_com),
                description= stringResource(R.string.text_des),
                backgroundColor = Color(0xFFEADDFF),
                modifier= Modifier.weight(1f)
            )
            Cuar(
                title= stringResource(R.string.image_com),
                description= stringResource(R.string.image_des),
                backgroundColor =Color(0xFFD0BCFF) ,
                modifier= Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Cuar(
                    title= stringResource(R.string.row_com),
            description= stringResource(R.string.row_des),
            backgroundColor =Color(0xFFB69DF8),
            modifier= Modifier.weight(1f)
            )
            Cuar(
                title= stringResource(R.string.Text_com),
                description= stringResource(R.string.text_des),
                backgroundColor = Color(0xFFF6EDFF),
                modifier= Modifier.weight(1f)
            )

        }
    }
}
@Composable
fun Cuar(
    title: String,
    description:String,
    backgroundColor: Color,
    modifier:Modifier=Modifier
): Unit{
Column(verticalArrangement = Arrangement.Center,
    modifier= modifier.background(backgroundColor)
        .fillMaxSize().padding(15.dp)

      ) {
    Text(
        text = title,
        modifier = Modifier.padding(bottom = 16.dp),
        fontWeight=FontWeight.Bold,
        textAlign = TextAlign.Center
    )
    Text(
        text = description,
        textAlign = TextAlign.Justify
    )
}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposableTheme {
    Cuadrante()
    }
}