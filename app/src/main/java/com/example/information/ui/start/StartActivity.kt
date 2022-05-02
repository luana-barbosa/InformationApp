package com.example.information.ui.start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.information.databinding.InformationStartActivityBinding

class StartActivity : AppCompatActivity() {
    lateinit var binding: InformationStartActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = InformationStartActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
