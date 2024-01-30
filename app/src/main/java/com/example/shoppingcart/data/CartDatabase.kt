package com.example.shoppingcart.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Product::class, CartItem::class, Cart::class], version = 1, exportSchema = false)
abstract class ShoppingDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
    abstract fun cartItemDao(): CartItemDao
    abstract fun cartDao(): CartDao
}
