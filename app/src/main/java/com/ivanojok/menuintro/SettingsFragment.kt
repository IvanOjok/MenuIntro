package com.ivanojok.menuintro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.ivanojok.menuintro.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    var _binding: FragmentSettingsBinding ?= null
    val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

//        val x = inflater.inflate(R.layout.fragment_settings, null)
//        val name = x.findViewById<EditText>(R.id.editTextText)
//        return x

//        val binding = FragmentSettingsBinding.inflate(layoutInflater)
//        val name = binding.editTextText
//        return binding.root

        _binding = FragmentSettingsBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}