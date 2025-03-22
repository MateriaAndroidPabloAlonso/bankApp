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
import androidx.compose.material.icons.filled.ShoppingCart
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
import com.example.bankapp.models.Shop
import com.example.bankapp.models.shops
import com.example.bankapp.ui.theme.BankAppTheme

@Composable
fun TransactionRow(transaction: Shop, index: Int) {
    val boxColor = if (index % 2 == 0) Color.Black else Color.Blue
    Row (
        modifier = Modifier.fillMaxWidth()
    ){
        Box(
            modifier = Modifier.size(60.dp).background(boxColor, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = null,
                modifier = Modifier.size(40.dp),
                tint = Color.White
            )
        }

        Column (
            modifier = Modifier.padding(start = 10.dp).weight(1f)
        ) {
            Text(
                text = transaction.name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = transaction.category,
                color = Color.Gray,
                fontSize = 14.sp
            )
        }
        Column (
            modifier = Modifier.padding(end = 10.dp)
        ) {
            Text(
                text = "-$${transaction.montoGastado}",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = transaction.hora,
                color = Color.Gray,
                fontSize = 14.sp
            )
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun TransactionPreview() {
    BankAppTheme {
        TransactionRow(transaction = shops[0], 1)
    }
}