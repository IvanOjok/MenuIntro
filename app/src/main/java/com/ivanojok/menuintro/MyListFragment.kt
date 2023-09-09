package com.ivanojok.menuintro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView


class MyListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_my_list, container, false)

        val data = arguments?.getString("name")
        val nameView = view.findViewById<TextView>(R.id.name_view)
        nameView.text = data

        val listView = view.findViewById<ListView>(R.id.dymanic)
        val list = List<String>(20) {"Ivan Ojok loves Eating"}
        val adapter = ArrayAdapter(requireContext(), androidx.appcompat.R.layout.select_dialog_item_material, list)
        listView.adapter = adapter


        return view
    }

}