package com.example.createartspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.createartspaceapp.ui.theme.CreateArtSpaceAppTheme





//using this website for this app:
//https://www.cnn.com/style/article/most-famous-paintings/index.html

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreateArtSpaceAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtApp()
                }
            }
        }
    }
}

@Composable
fun ArtApp( modifier: Modifier = Modifier) {

    var value by remember {
    mutableStateOf(1)
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        when(value){
            1->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.mona_lisa_image),
                    modifier = modifier.size(width = 350.dp, height = 450.dp)
                        .border(BorderStroke(40.dp, Color.White), RectangleShape)
                )
                
                ArtWorkAndArtist(
                    
                )

                ButtonsApp(buttonPres ={value = 2} )
            }
            
            2->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.the_last_supper_image),
                    modifier = modifier.size(width = 350.dp, height = 250.dp)
                        .border(BorderStroke(40.dp, Color.White), RectangleShape)
                )
                ButtonsApp(buttonPres = { value = 3 })
            }

            3->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.the_starry_night_image),
                    modifier = modifier.border(BorderStroke(40.dp, Color.White), RectangleShape)
                )
                ButtonsApp(buttonPres = { value = 4 })
            }
            
            4->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.the_scream_image),
                    modifier = modifier.border(BorderStroke(40.dp, Color.White), RectangleShape)
                )

                ButtonsApp(buttonPres = { value = 5 })
            }
            
            5->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.guernica_image),
                    modifier =  modifier.size(width = 500.dp, height = 250.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)
                )
                ButtonsApp(buttonPres = { value = 6 })
                
            }
            
            6->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.the_kiss_image),
                    modifier = modifier.size(width = 500.dp, height = 500.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)

                )
                ButtonsApp(buttonPres = {value = 7})
            }
            
            7->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.girl_with_a_pearl_earring_image),
                    modifier = modifier.size(width = 500.dp, height = 500.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)
                )
                ButtonsApp(buttonPres = { value = 8 })
            }
            
            8->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.the_birth_of_venus_image),
                    modifier = modifier.size(width = 350.dp, height = 250.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)
                )
                ButtonsApp(buttonPres = {value = 9})
            }
            
            9->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.las_meninas_image),
                    modifier = modifier.size(width = 480.dp, height = 480.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)

                )
                ButtonsApp(buttonPres = {value = 10})
            }
            
            10->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.creation_of_adam_image),
                    modifier = modifier.size(width = 400.dp, height = 210.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)
                )
                ButtonsApp(buttonPres = {value = 1})
            }
            
        }

    }
}


@Composable
fun PieceOfArt(

    painting: Painter,
    modifier: Modifier = Modifier

){
    Image(
        painter = painting,
        contentDescription = null,
        modifier = modifier
            .shadow(10.dp),
    )
}


@Composable
fun ArtWorkAndArtist(modifier: Modifier = Modifier){


    val colorOfTheBox = Color(0xFFecebf4)


    Column(
       modifier = Modifier.background(colorOfTheBox)
    ) {
        
        Text(text = "place holder text")

    }

}


@Composable
fun ButtonsApp(
    
    buttonPres: () -> Unit,
    modifiers: Modifier = Modifier
){
    Row {
        Button(onClick =  buttonPres ) {

        }

    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CreateArtSpaceAppTheme {
        ArtApp()
    }
}