package com.example.bankapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankapp.components.Header
import com.example.bankapp.components.Statistics
import com.example.bankapp.ui.theme.BankAppTheme

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
    ) {
        Header()
        Spacer(modifier = Modifier.padding(20.dp))
        Statistics()
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