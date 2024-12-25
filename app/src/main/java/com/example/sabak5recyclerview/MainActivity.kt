package com.example.sabak5recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sabak5recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val list = listOf<Product>(
            Product("Пакет", 100),
            Product("Сіріңке", 50),
            Product("Қарындаш", 25),
            Product("Дәптер", 60),
            Product("Кесе", 1600),
            Product("Ермексаз", 850),
            Product("Қалам", 95),
            Product("Пакет", 100),
            Product("Сіріңке", 50),
            Product("Қарындаш", 25),
            Product("Дәптер", 60),
            Product("Кесе", 1600),
            Product("Ермексаз", 850),
            Product("Қалам", 95),
            Product("Пакет", 100),
            Product("Сіріңке", 50),
            Product("Қарындаш", 25),
            Product("Дәптер", 60),
            Product("Кесе", 1600),
            Product("Ермексаз", 850),
            Product("Қалам", 95),
            )


        val adapter = ProductAdapter()
        binding.listRecyclerView.adapter = adapter
        adapter.sobmitList(list)

    }
}