package com.example.lico


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import android.widget.ListView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.lico.databinding.FragmentHomepageBinding
import com.example.lico.databinding.FragmentResourceBinding

class Resource:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentResourceBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_resource , container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

    }
}