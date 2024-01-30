package com.example.shoppingcart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Set the content view to your XML layout

        // Initialize your RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.todo)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Set up the adapter for the RecyclerView with sample data
        val itemTotal = "RS0"
        val deliveryService = "RS0"
        val tax = "RS0"
        val total = "RS0"

        val adapter = CartAdapter(this, itemTotal, deliveryService, tax, total)
        recyclerView.adapter = adapter
    }
}