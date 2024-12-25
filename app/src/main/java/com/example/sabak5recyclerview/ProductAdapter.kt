package com.example.sabak5recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sabak5recyclerview.databinding.AdapterRcProductBinding

class ProductAdapter(): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
private var list = arrayListOf<Product>()

    fun sobmitList(productList: List<Product>){
        list.addAll(productList)
    }

    class ViewHolder(private val binding: AdapterRcProductBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(item:Product){
            binding.textTitle.text = item.title
            binding.textPrice.text = item.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =  AdapterRcProductBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }
}