package com.example.shoppingcart.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/shoppingcart/data/ShoppingDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cartDao", "Lcom/example/shoppingcart/data/CartDao;", "cartItemDao", "Lcom/example/shoppingcart/data/CartItemDao;", "productDao", "Lcom/example/shoppingcart/data/ProductDao;", "app_debug"})
@androidx.room.Database(entities = {com.example.shoppingcart.data.Product.class, com.example.shoppingcart.data.CartItem.class, com.example.shoppingcart.data.Cart.class}, version = 1, exportSchema = false)
public abstract class ShoppingDatabase extends androidx.room.RoomDatabase {
    
    public ShoppingDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.shoppingcart.data.ProductDao productDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.shoppingcart.data.CartItemDao cartItemDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.shoppingcart.data.CartDao cartDao();
}