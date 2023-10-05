package com.example.mvvm_livedata_flow.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.mvvm_livedata_flow.R
import com.example.mvvm_livedata_flow.base.BaseFragment
import com.example.mvvm_livedata_flow.databinding.FragmentLoginBinding
import com.example.mvvm_livedata_flow.presentation.Event
import com.example.mvvm_livedata_flow.presentation.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentLogin : BaseFragment<FragmentLoginBinding>() {
    override val layoutId = R.layout.fragment_login
    private val viewModel: LoginViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            viewModel.onEvent(Event.Login(binding.edtUserName.toString(),binding.edtPass.toString()))
        }
    }
}
