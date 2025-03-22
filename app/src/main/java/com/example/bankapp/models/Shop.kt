package com.example.bankapp.models

data class Shop(
    val name: String,
    val category: String,
    val montoGastado: Double,
    val hora: String
)

val shops = listOf(
    Shop(name = "Nike Store", category = "Ropa & Zapatos", montoGastado = 27.67, hora = "2:23 PM"),
    Shop(name = "Pepsi", category = "Restaurant & Cafe", montoGastado = 34.92, hora = "10:00 AM")
)
