package com.example.mvvm_livedata_flow.presentation

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_livedata_flow.data_source.repository.AuthRepositoryIPLM
import com.example.mvvm_livedata_flow.domain.use_case.AuthUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(
    application: Application,
    private val authUseCase: AuthUseCase
) : AndroidViewModel(application) {
    fun onEvent(event: Event) {
        when {
            event is Event.Login -> {
                viewModelScope.launch(Dispatchers.IO) {
                    authUseCase.login(userName = event.email, pass = event.pass).collectLatest {
                        Log.d("INSERT_ID_NAO", "onEvent: $it")
                    }
                }
            }
        }
    }
}

sealed class Event {
    data class Login(val email: String, val pass: String) : Event()
}