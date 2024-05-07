package com.example.fullxml

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fullxml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    fun initRecyclerView(){
        val adapter = MyAdapter(getLista())
        binding.lista1.adapter = adapter
    }

    fun getLista(): List<DataItem> {

        return listOf<DataItem>(
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Far.pinterest.com%2Fpin%2F297026537905558982%2F%3Famp_client_id%3DCLIENT_ID%2528_%2529%26mweb_unauth_id%3D&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=2ahUKEwj89vmQz_qFAxWGIrkGHZaxB7UQjRx6BAgAEBY",
                title = "Teemo 1"),
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Far.pinterest.com%2Fpin%2F297026537905558982%2F%3Famp_client_id%3DCLIENT_ID%2528_%2529%26mweb_unauth_id%3D&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=2ahUKEwj89vmQz_qFAxWGIrkGHZaxB7UQjRx6BAgAEBY",
                title = "Teemo 2"),
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Far.pinterest.com%2Fpin%2F297026537905558982%2F%3Famp_client_id%3DCLIENT_ID%2528_%2529%26mweb_unauth_id%3D&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=2ahUKEwj89vmQz_qFAxWGIrkGHZaxB7UQjRx6BAgAEBY",
                title = "Teemo 3"),
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Far.pinterest.com%2Fpin%2F297026537905558982%2F%3Famp_client_id%3DCLIENT_ID%2528_%2529%26mweb_unauth_id%3D&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=2ahUKEwj89vmQz_qFAxWGIrkGHZaxB7UQjRx6BAgAEBY",
                title = "Teemo 4"),
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Far.pinterest.com%2Fpin%2F297026537905558982%2F%3Famp_client_id%3DCLIENT_ID%2528_%2529%26mweb_unauth_id%3D&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=2ahUKEwj89vmQz_qFAxWGIrkGHZaxB7UQjRx6BAgAEBY",
                title = "Teemo 5"),
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Far.pinterest.com%2Fpin%2F297026537905558982%2F%3Famp_client_id%3DCLIENT_ID%2528_%2529%26mweb_unauth_id%3D&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=2ahUKEwj89vmQz_qFAxWGIrkGHZaxB7UQjRx6BAgAEBY",
                title = "Teemo 6"),
            DataItem(url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Far.pinterest.com%2Fpin%2F297026537905558982%2F%3Famp_client_id%3DCLIENT_ID%2528_%2529%26mweb_unauth_id%3D&psig=AOvVaw1CcLlhjCCW6k56Ip-jtk6s&ust=1715139622854000&source=images&cd=vfe&opi=89978449&ved=2ahUKEwj89vmQz_qFAxWGIrkGHZaxB7UQjRx6BAgAEBY",
                title = "Teemo 7")
        )
    }

}