package com.example.bankapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
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
import com.example.bankapp.ui.theme.CardBeige
import com.example.bankapp.ui.theme.CardGreen
import com.example.bankapp.ui.theme.CardPurple

@Composable
fun Statistics() {
    Row (
        modifier = Modifier.fillMaxWidth()
    ){
        Box (
            modifier = Modifier.fillMaxWidth().weight(1f).height(310.dp)
                .background(CardGreen, RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.Center
        ){
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),

                    )
                Text(
                    text = "Actividad",
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "de la semana",
                    color = Color.Gray,
                    fontSize = 13.sp
                )
            }

        }
        Spacer(modifier = Modifier.size(10.dp))
        Column (
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier.fillMaxWidth().height(150.dp)
                    .background(CardBeige, RoundedCornerShape(20.dp)),
                contentAlignment = Alignment.Center
            ) {
                Column (
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Ventas",
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = "$280.99",
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.size(10.dp))
            Box(
                modifier = Modifier.fillMaxWidth().height(150.dp)
                    .background(CardPurple, RoundedCornerShape(20.dp)),
                contentAlignment = Alignment.Center
            ) {
                Column (
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Ganancias",
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = "$280.99",
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        } // Fin columna ventas y ganancias
    }
}

@Preview(
    showBackground = true
)
@Composable
fun StatisticsPreview() {
    BankAppTheme {
        Statistics()
    }
}