package com.example.tubes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tubes.databinding.ActivityHealthArticleBinding

class HealthArticleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHealthArticleBinding
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHealthArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            layoutManager = LinearLayoutManager (this)
            recyclerView.layoutManager = layoutManager

            adapter = RecyclerViewAdapter()
            recyclerView.adapter = adapter }

    }
}