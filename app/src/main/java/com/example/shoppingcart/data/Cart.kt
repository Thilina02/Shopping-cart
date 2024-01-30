package com.example.shoppingcart.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "cart")
data class Cart(
    @PrimaryKey
    val id: Long,
    val totalItems: Int,
    val totalAmount: Double
)