package com.example.shoppingcart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CartAdapter(
    private val context: Context,
    private val itemTotal: String,
    private val deliveryService: String,
    private val tax: String,
    private val total: String
) : RecyclerView.Adapter<CartAdapter.ViewHolder>() {

    // Define a ViewHolder to hold the views
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemTotalTextView: TextView = view.findViewById(R.id.ItemTotalNb)
        val deliveryServiceTextView: TextView = view.findViewById(R.id.DeliveryNb)
        val taxTextView: TextView = view.findViewById(R.id.TaxNb)
        val totalTextView: TextView = view.findViewById(R.id.TotalNb)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Bind the data to the views
        holder.itemTotalTextView.text = itemTotal
        holder.deliveryServiceTextView.text = deliveryService
        holder.taxTextView.text = tax
        holder.totalTextView.text = total
    }

    override fun getItemCount(): Int {
        // This adapter only displays one set of values, so return 1
        return 1
    }
}
