package com.ivanojok.menuintro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val x = inflater.inflate(R.layout.fragment_home, container, false)
        x.findViewById<Button>(R.id.button2).setOnClickListener {
            //findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
            //findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToMyListFragment())

            val name = x.findViewById<EditText>(R.id.name).text.toString()
            val password = x.findViewById<EditText>(R.id.password).text.toString()
            val b = Bundle()
            b.putString("name", name)
            b.putString("password", password)
            findNavController().navigate(R.id.action_homeFragment_to_myListFragment, b)

        }
        return x
    }


}