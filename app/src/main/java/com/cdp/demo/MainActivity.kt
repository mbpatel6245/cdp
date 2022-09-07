package com.cdp.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.cdp.demo.ui.theme.MyApplicationTheme
import com.cdp.demo.ui.theme.Purple500
import com.mbp.cdp.CDP


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("CDP")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Image(
            painter = painterResource(id = R.drawable.yoga),
            contentDescription = R.drawable.yoga.toString(),
            modifier = Modifier
                .height(CDP.dimens._150cdp)
                .width(CDP.dimens._150cdp)
                .fillMaxWidth()
                .padding(CDP.dimens._2cdp)
        )
        Text(text = "Hello $name!", fontSize = 10.sp, color = Purple500)

        Button(
            onClick = {}, shape = RoundedCornerShape(CDP.dimens._20cdp), modifier = Modifier
                .height(CDP.dimens._40cdp)
                .width(CDP.dimens._150cdp)
        ) {
            Text(text = "Round corner shape")
        }
        Spacer(modifier = Modifier.height(CDP.dimens._15cdp))
        Button(
            onClick = {
                //your onclick code
            },
            border = BorderStroke(CDP.dimens._1cdp, Color.Red),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red), modifier = Modifier
                .height(CDP.dimens._50cdp)
                .width(CDP.dimens._100cdp)
        ) {
            Text(text = "Button with border", color = Color.DarkGray)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("CDP")
    }
}