package com.example.android.modern.androidcomlpetearchitecture.allexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.modern.androidcomlpetearchitecture.databinding.ActivityViewModelBinding
import com.example.android.modern.androidcomlpetearchitecture.viewmodel.ViewModelLiveData

class ViewModelActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewModelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModelLiveData : ViewModelLiveData = ViewModelProvider(this).get(ViewModelLiveData::class.java)

        viewModelLiveData.someLiveData.observe(this, Observer { value ->
            binding.tvNew.text = value
        })

    }
}