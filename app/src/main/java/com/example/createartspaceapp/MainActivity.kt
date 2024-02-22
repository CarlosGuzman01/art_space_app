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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    var value by rememberSaveable {
    mutableStateOf(1)
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.verticalScroll(rememberScrollState())

    ) {
        when(value){
            1->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.mona_lisa_image),
                    modifier = modifier
                        .size(width = 350.dp, height = 450.dp)
                        .border(BorderStroke(40.dp, Color.White), RectangleShape)
                )
                
                ArtWorkAndArtist(
                    paintingTitle = stringResource(id = R.string.mona_lisa_title), 
                    paintingArtist = stringResource(id = R.string.mona_lisa_artist),
                    paintingYear = stringResource(id = R.string.mona_lisa_year)
                    
                )

                ButtonsApp(nextButton ={value = 2}, previousButton = {value = 10} )
            }
            
            2->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.the_last_supper_image),
                    modifier = modifier
                        .size(width = 350.dp, height = 250.dp)
                        .border(BorderStroke(40.dp, Color.White), RectangleShape)
                )
                
                ArtWorkAndArtist(
                    paintingTitle = stringResource(id = R.string.the_last_supper_title),
                    paintingArtist = stringResource(id = R.string.the_last_supper_artist),
                    paintingYear = stringResource(id = R.string.the_last_supper_year)
                
                )
                
                ButtonsApp(nextButton = { value = 3 }, previousButton = {value--})
            }

            3->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.the_starry_night_image),
                    modifier = modifier.border(BorderStroke(40.dp, Color.White), RectangleShape)
                )
                
                ArtWorkAndArtist(
                    paintingTitle = stringResource(id = R.string.the_starry_night_title),
                    paintingArtist = stringResource(id = R.string.the_starry_night_artist),
                    paintingYear = stringResource(id = R.string.the_starry_night_year)
                
                )
                ButtonsApp(nextButton = { value = 4 }, previousButton = {value--})
            }
            
            4->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.the_scream_image),
                    modifier = modifier.border(BorderStroke(40.dp, Color.White), RectangleShape)
                )
                
                ArtWorkAndArtist(
                    paintingTitle = stringResource(id = R.string.the_scream_title),
                    paintingArtist = stringResource(id = R.string.the_scream_artist),
                    paintingYear = stringResource(id = R.string.the_scream_year)
                
                )

                ButtonsApp(nextButton = { value = 5 }, previousButton = {value--})
            }
            
            5->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.guernica_image),
                    modifier = modifier
                        .size(width = 500.dp, height = 250.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)
                )
                
                ArtWorkAndArtist(
                    paintingTitle = stringResource(id = R.string.guernica_title),
                    paintingArtist = stringResource(id = R.string.guernica_artist),
                    paintingYear = stringResource(id = R.string.guernica_year)
                )
                
                ButtonsApp(nextButton = { value = 6 }, previousButton = {value--})
                
            }
            
            6->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.the_kiss_image),
                    modifier = modifier
                        .size(width = 500.dp, height = 500.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)

                )
                
                ArtWorkAndArtist(
                    paintingTitle = stringResource(id = R.string.the_kiss_title),
                    paintingArtist = stringResource(id = R.string.the_kiss_artist),
                    paintingYear = stringResource(id = R.string.the_kiss_year)
                )
                
                ButtonsApp(nextButton = {value = 7}, previousButton = {value--})
            }
            
            7->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.girl_with_a_pearl_earring_image),
                    modifier = modifier
                        .size(width = 500.dp, height = 500.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)
                )
                
                ArtWorkAndArtist(
                    paintingTitle = stringResource(id = R.string.girl_with_a_pearl_earning_title),
                    paintingArtist = stringResource(id = R.string.girl_with_a_pearl_earning_artist),
                    paintingYear = stringResource(id = R.string.girl_with_a_pearl_earning_year)
                )
                ButtonsApp(nextButton = { value = 8 }, previousButton = {value--})
            }
            
            8->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.the_birth_of_venus_image),
                    modifier = modifier
                        .size(width = 350.dp, height = 250.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)
                )
                
                ArtWorkAndArtist(
                    paintingTitle = stringResource(id = R.string.the_birth_of_venus_title),
                    paintingArtist = stringResource(id = R.string.the_birth_of_venus_artist),
                    paintingYear = stringResource(id = R.string.the_birth_of_venus_year)
                )
                ButtonsApp(nextButton = {value = 9}, previousButton = {value--})
            }
            
            9->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.las_meninas_image),
                    modifier = modifier
                        .size(width = 480.dp, height = 480.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)

                )
                
                ArtWorkAndArtist(
                    paintingTitle = stringResource(id = R.string.las_meninas_title),
                    paintingArtist = stringResource(id = R.string.las_meninas_artist),
                    paintingYear = stringResource(id = R.string.las_meninas_year)
                )
                ButtonsApp(nextButton = {value = 10}, previousButton = {value--})
            }
            
            10->{
                PieceOfArt(
                    painting = painterResource(id = R.drawable.creation_of_adam_image),
                    modifier = modifier
                        .size(width = 400.dp, height = 210.dp)
                        .border(BorderStroke(20.dp, Color.White), RectangleShape)
                )
                ArtWorkAndArtist(
                    paintingTitle = stringResource(id = R.string.creation_of_adam_title),
                    paintingArtist = stringResource(id = R.string.creation_of_adam_artist),
                    paintingYear = stringResource(id = R.string.creation_of_adam_year)
                )
                ButtonsApp(nextButton = {value = 1}, previousButton = {value--})
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
    
    Spacer(modifier = Modifier.height(100.dp))
}


@Composable
fun ArtWorkAndArtist(
    
    paintingTitle: String,
    paintingArtist: String,
    paintingYear: String,
    modifier: Modifier = Modifier
){
    
    
    val colorOfTheBox = Color(0xFFecebf4)


    Column(
       modifier = Modifier.background(colorOfTheBox)
    ) {
        
        Text(
            text = paintingTitle,
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraLight

        )
        Row {
            Text(
                text = paintingArtist,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "($paintingYear)"
            )
        }

    }
    
    Spacer(modifier = Modifier.height(30.dp))
    
    

}

@Composable
fun ButtonsApp(

    nextButton: () -> Unit,
    previousButton: () -> Unit,
    modifiers: Modifier = Modifier
){
    Row() {
        
        Button(
            onClick = previousButton,
            modifier = Modifier.size(width = 110.dp, height = 50.dp),
            shape = RoundedCornerShape(30.dp)

        ) {
            Text(text = stringResource(R.string.previous_button))

        }
        
        Spacer(modifier = Modifier.width(90.dp))

        Button(
            onClick =  nextButton,
            modifier = Modifier.size(width = 110.dp, height = 50.dp),
            shape = RoundedCornerShape(30.dp)

        ) {
            Text(text = stringResource(R.string.next_button))

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