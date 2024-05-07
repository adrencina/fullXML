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
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwildrift.leagueoflegends.com%2Fes-mx%2Fchampions%2Fteemo%2F&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCIiEotrS-oUDFQAAAAAdAAAAABAD",
                title = "Teemo 1"),
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwildrift.leagueoflegends.com%2Fes-mx%2Fchampions%2Fteemo%2F&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCIiEotrS-oUDFQAAAAAdAAAAABAD",
                title = "Teemo 2"),
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwildrift.leagueoflegends.com%2Fes-mx%2Fchampions%2Fteemo%2F&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCIiEotrS-oUDFQAAAAAdAAAAABAD",
                title = "Teemo 3"),
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwildrift.leagueoflegends.com%2Fes-mx%2Fchampions%2Fteemo%2F&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCIiEotrS-oUDFQAAAAAdAAAAABAD",
                title = "Teemo 4"),
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwildrift.leagueoflegends.com%2Fes-mx%2Fchampions%2Fteemo%2F&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCIiEotrS-oUDFQAAAAAdAAAAABAD",
                title = "Teemo 5"),
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwildrift.leagueoflegends.com%2Fes-mx%2Fchampions%2Fteemo%2F&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCIiEotrS-oUDFQAAAAAdAAAAABAD",
                title = "Teemo 6"),
        )
    }

}