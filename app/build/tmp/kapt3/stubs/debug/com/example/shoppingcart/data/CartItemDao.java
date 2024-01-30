package com.example.shoppingcart.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/shoppingcart/data/CartItemDao;", "", "deleteAllCartItems", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCartItem", "cartItem", "Lcom/example/shoppingcart/data/CartItem;", "(Lcom/example/shoppingcart/data/CartItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCartItems", "", "getCartItemById", "cartItemId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCartItem", "updateCartItem", "app_debug"})
@androidx.room.Dao
public abstract interface CartItemDao {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertCartItem(@org.jetbrains.annotations.NotNull
    com.example.shoppingcart.data.CartItem cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM CartItem")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllCartItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.shoppingcart.data.CartItem>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM CartItem WHERE id = :cartItemId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCartItemById(long cartItemId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.shoppingcart.data.CartItem> $completion);
    
    @androidx.room.Query(value = "DELETE FROM CartItem")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllCartItems(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateCartItem(@org.jetbrains.annotations.NotNull
    com.example.shoppingcart.data.CartItem cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteCartItem(@org.jetbrains.annotations.NotNull
    com.example.shoppingcart.data.CartItem cartItem, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}