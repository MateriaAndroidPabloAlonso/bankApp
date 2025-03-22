package com.example.bankapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankapp.components.Header
import com.example.bankapp.components.Statistics
import com.example.bankapp.components.TransactionItem
import com.example.bankapp.models.shops
import com.example.bankapp.ui.theme.BackgroundColor
import com.example.bankapp.ui.theme.BankAppTheme
import com.example.bankapp.ui.theme.TextColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BankAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(innerPadding = innerPadding)
                }
            }
        }
    }
}

@Composable
fun HomeScreen(innerPadding : PaddingValues) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(20.dp)
            .background(BackgroundColor)
    ) {
        Header()
        Spacer(modifier = Modifier.padding(20.dp))
        Statistics()
        Spacer(modifier = Modifier.padding(5.dp))
        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = "Transacciones",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f),
                color = TextColor
            )
            Text(
                text = "See all",
                textAlign = TextAlign.End,
                color = TextColor

            )
        }
        LazyColumn (
            modifier = Modifier.padding(top = 10.dp)
        ) {
            itemsIndexed(shops) { index, shop ->
                TransactionItem(transaction = shop, index = index)
                Spacer(modifier = Modifier.padding(5.dp))
            }
        }
    } // Fin columna
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true
)
fun HomeScreenPreview() {
    BankAppTheme {
        HomeScreen(innerPadding = PaddingValues(20.dp))
    }
}