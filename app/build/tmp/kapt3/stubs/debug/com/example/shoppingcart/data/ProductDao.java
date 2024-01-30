package com.example.shoppingcart.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/shoppingcart/data/ProductDao;", "", "deleteAllProducts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllProducts", "", "Lcom/example/shoppingcart/data/Product;", "getProductById", "productId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertProduct", "product", "(Lcom/example/shoppingcart/data/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface ProductDao {
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertProduct(@org.jetbrains.annotations.NotNull
    com.example.shoppingcart.data.Product product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM products")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.shoppingcart.data.Product>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM products WHERE id = :productId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProductById(long productId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.shoppingcart.data.Product> $completion);
    
    @androidx.room.Query(value = "DELETE FROM products")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}