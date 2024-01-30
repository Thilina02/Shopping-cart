package com.example.shoppingcart.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Delete

@Dao
interface CartItemDao {
    @Insert
    suspend fun insertCartItem(cartItem: CartItem)

    @Query("SELECT * FROM CartItem")
    suspend fun getAllCartItems(): List<CartItem>

    @Query("SELECT * FROM CartItem WHERE id = :cartItemId")
    suspend fun getCartItemById(cartItemId: Long): CartItem

    @Query("DELETE FROM CartItem")
    suspend fun deleteAllCartItems()

    @Update
    suspend fun updateCartItem(cartItem: CartItem)

    @Delete
    suspend fun deleteCartItem(cartItem: CartItem)
}
