package com.example.dicodingdesignify.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.IntentCompat.getParcelableExtra
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dicodingdesignify.R
import com.example.dicodingdesignify.data.DataModels
import com.example.dicodingdesignify.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val karya = getParcelableExtra(
            intent,
            "context",
            DataModels::class.java
        ) as DataModels

        with(binding) {
            ivImages.setImageResource(karya.image)
            tvTitle.text = karya.title
            tvArtist.text = karya.artist
            tvYear.text = karya.year
            tvDescription.text = karya.description

            ivBack.setOnClickListener {
                finish()
            }
        }
    }
}