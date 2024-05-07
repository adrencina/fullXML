package com.example.fullxml

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fullxml.databinding.ItemLista1Binding
import com.squareup.picasso.Picasso

class MyAdapter(private val miLista: List<DataItem>) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista1, parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return miLista.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.render(miLista[position])
    }
}


class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val binding = ItemLista1Binding.bind(view)
    fun render(data: DataItem){
        binding.title1.text = data.title
        Picasso.get().load(data.url).into(binding.imagen1)
    }
}