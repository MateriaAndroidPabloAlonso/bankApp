package com.example.bankapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankapp.ui.theme.BankAppTheme
import com.example.bankapp.ui.theme.CardPurple

@Composable
fun Header() {
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment =Alignment.CenterVertically
    ){
        Box (
            modifier = Modifier
                .size(60.dp)
                .background(CardPurple, shape = CircleShape),
            contentAlignment = Alignment.Center
        ){

            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null,
                modifier =Modifier.size(50.dp)
            )
        }

        Column (
            modifier = Modifier.padding(start = 10.dp)
                .weight(1f)
        ) {
            Text(
                text = "Hola Pablo",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Bienvenido!",
                fontSize = 18.sp,
                color= Color.Gray
            )
        }

        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = null,
            modifier = Modifier.size(40.dp)
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun HeaderPreview() {
    BankAppTheme {
        Header()
    }
}