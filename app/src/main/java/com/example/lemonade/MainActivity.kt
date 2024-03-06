package com.example.lemonade

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                ) {
                    LemonApp()
                }
            }
        }
    }
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LemonApp() {

    var currentIndex by remember { mutableStateOf(1) }
    var squeezeTapCount by remember { mutableStateOf(2) }

    var stepText = when(currentIndex)
    {
        1->R.string.tap_lemon
        2->R.string.tapping
        3->R.string.drink
        4->R.string.empty_glass
        else->R.string.tap_lemon
    }
    var imageResource = when(currentIndex)
    {
        1->R.drawable.lemon_tree
        2->R.drawable.lemon_squeeze
        3->R.drawable.lemon_drink
        4->R.drawable.lemon_restart
        else -> R.drawable.lemon_tree
    }
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = {
                        Box (modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Yellow)
                            .padding(vertical = 8.dp),
                            contentAlignment = Alignment.Center
                            ){
                            Text(
                                text = "Lemonade",
                                fontWeight = FontWeight.Bold
                            )
                        }

                    })
            },
        ) {

        }
    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
        ){
        Image(painter = painterResource(id = imageResource),
            modifier = Modifier
                .wrapContentSize()
                .border(1.dp, Color.Cyan, shape = RoundedCornerShape(20.dp))
                .background(Color.Cyan, shape = RoundedCornerShape(20.dp))
                .clickable {
                    when (currentIndex) {
                        1 -> {
                            squeezeTapCount = (1..6).random()
                            currentIndex += 1
                        }
                        2 -> {
                            if (squeezeTapCount == 0) {
                                currentIndex += 1
                            } else {
                                squeezeTapCount--
                            }
                        }
                        3 -> {
                            currentIndex += 1
                        }
                        4 -> {
                            currentIndex = 1
                        }
                    }
                },
            contentDescription = null)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = stringResource(id = stepText))
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LemonadeTheme {
        LemonApp()
    }
}