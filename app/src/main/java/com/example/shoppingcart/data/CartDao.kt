package com.example.shoppingcart.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CartDao {
    @Query("SELECT * FROM cart WHERE id = 1") // Assuming you have a single cart
    suspend fun getCart(): Cart

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateCart(cart: Cart)
}
