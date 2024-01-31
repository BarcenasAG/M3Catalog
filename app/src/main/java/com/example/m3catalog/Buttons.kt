package com.example.m3catalog

import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.SmallFloatingActionButton

@Preview
@Composable
fun MyButton(){
    Button(onClick = {  }) {
        Text(text = "Hola mundo")
    }
}

@Preview
@Composable
fun MyButton2(){
    Button(
        onClick = {  },
        enabled = false,
        colors = ButtonDefaults.buttonColors(
            disabledContainerColor = Color.Red,
            disabledContentColor = Color.Blue)

    ) {
        Text(text = "Hola mundo")
    }
}

@Preview
@Composable
fun MyFilledTonalButton(){
    FilledTonalButton(
        onClick = {  }, 
        colors = ButtonDefaults.filledTonalButtonColors(
            contentColor = Color.Blue,
            containerColor = colorResource( R.color.purple_200))
    ) {
        Text(text = "Hola mundo")
    }
}

@Preview
@Composable
fun MyElevateButton(){
    ElevatedButton(
        onClick = {  },
        elevation = ButtonDefaults.elevatedButtonElevation(10.dp)
    ) {
        Text(text = "Hola mundo")
    }
}

@Preview
@Composable
fun MyFAB(){
    FloatingActionButton(
        onClick = {  },
        containerColor = Color.Red,
        contentColor = Color.Blue
    ) {
        Icon(Icons.Filled.Favorite, "Floating Action Button")
    }
}

@Preview
@Composable
fun MySmallFAB(){
    SmallFloatingActionButton(
        onClick = {  },
        containerColor = Color.Red,
        contentColor = Color.Blue
    ) {
        Icon(Icons.Filled.Favorite, "Floating Action Button")
    }
}

@Preview
@Composable
fun MyLargeFAB(){
    LargeFloatingActionButton(
        onClick = {  },
        containerColor = Color.Red,
        contentColor = Color.Blue
    ) {
        Icon(Icons.Filled.Favorite, "Floating Action Button")
    }
}

@Preview
@Composable
fun MyExtendedFAB(){
    ExtendedFloatingActionButton(
        onClick = {  },
        containerColor = Color.Red,
        contentColor = Color.Black
    ) {
        Icon(
            Icons.Filled.Favorite, "Floating Action Button"
        )
        Text(
            text = "Extended Floating Action Button"
        )
    }
}
