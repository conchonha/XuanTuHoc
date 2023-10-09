package com.example.mvvm_livedata_flow.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.example.mvvm_livedata_flow.R
import com.example.mvvm_livedata_flow.base.BaseFragment
import com.example.mvvm_livedata_flow.databinding.FragmentAddBinding
import com.example.mvvm_livedata_flow.presentation.NoteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentAddNote : BaseFragment<FragmentAddBinding>() {
    private val viewModel: NoteViewModel by viewModels()
    override val layoutId = R.layout.fragment_add

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            btnAdd.setOnClickListener {
                viewModel.addNote(edtTitle.text.toString(), edtContent.text.toString())
            }
        }
    }
}