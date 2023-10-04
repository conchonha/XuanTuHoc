package com.example.mvvm_livedata_flow.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.mvvm_livedata_flow.R
import com.example.mvvm_livedata_flow.base.BaseFragment
import com.example.mvvm_livedata_flow.databinding.FragmentHomeBinding

class FragmentHome : BaseFragment<FragmentHomeBinding>() {
    override val layoutId = R.layout.fragment_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(requireContext(),"Gia Tri:= ${arguments?.getInt("SangTB")}",Toast.LENGTH_SHORT).show()
    }
}