package com.example.android.modern.androidcomlpetearchitecture.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.android.modern.androidcomlpetearchitecture.R
import com.example.android.modern.androidcomlpetearchitecture.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.switch1.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragment_main_to_fragment1)
        }

        binding.switch2.setOnClickListener {
            val action = MainFragmentDirections.actionFragmentMainToFragment2(arg1= 8555,arg2= "abcd")
            it.findNavController().navigate(action)
        }


        return binding.root

    }


}