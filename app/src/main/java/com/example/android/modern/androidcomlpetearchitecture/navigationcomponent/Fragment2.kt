package com.example.android.modern.androidcomlpetearchitecture.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.android.modern.androidcomlpetearchitecture.databinding.FragmentSecondBinding

class Fragment2 : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    private val safeArgs: Fragment2Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.tvArg1.text = safeArgs.arg1.toString()
        binding.tvArg2.text = safeArgs.arg2

        return binding.root
    }


}