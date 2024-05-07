package com.example.fullxml

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fullxml.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }


    fun initRecyclerView(){
        val adapter = MyAdapter(getLista())
        binding.lista1.adapter = adapter
    }

    fun getLista(): List<DataItem> {

        return listOf<DataItem>(
            DataItem(url = "https://i.etsystatic.com/48906423/r/il/731d41/5728792526/il_570xN.5728792526_obhi.jpg",
                title = "Teemo 1"),
            DataItem(url = "https://i.etsystatic.com/48906423/r/il/731d41/5728792526/il_570xN.5728792526_obhi.jpg",
                title = "Teemo 2"),
            DataItem(url = "https://i.etsystatic.com/48906423/r/il/731d41/5728792526/il_570xN.5728792526_obhi.jpg",
                title = "Teemo 3"),
            DataItem(url = "https://i.etsystatic.com/48906423/r/il/731d41/5728792526/il_570xN.5728792526_obhi.jpg",
                title = "Teemo 4"),
            DataItem(url = "https://i.etsystatic.com/48906423/r/il/731d41/5728792526/il_570xN.5728792526_obhi.jpg",
                title = "Teemo 5"),
            DataItem(url = "https://i.etsystatic.com/48906423/r/il/731d41/5728792526/il_570xN.5728792526_obhi.jpg",
                title = "Teemo 6"),

        )
    }

}