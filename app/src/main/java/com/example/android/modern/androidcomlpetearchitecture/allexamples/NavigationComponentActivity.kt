package com.example.android.modern.androidcomlpetearchitecture.allexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.modern.androidcomlpetearchitecture.databinding.ActivityNavigationComponentBinding
import com.example.android.modern.androidcomlpetearchitecture.databinding.ActivityViewModelBinding

class NavigationComponentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNavigationComponentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationComponentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}