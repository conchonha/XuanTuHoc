package com.example.mvvm_livedata_flow.presentation

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_livedata_flow.domain.use_case.NoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    application: Application,
    private val noteUseCase: NoteUseCase
) : AndroidViewModel(application) {

    init {
        viewModelScope.launch {
            noteUseCase.getAllNote().collectLatest {
                Log.d("SangDepTrai", "noteUseCase.getAllNote() value=: ${it}")
            }
        }
    }

    fun addNote(title: String, content: String) = viewModelScope.launch(Dispatchers.IO) {
        noteUseCase.addNote(title, content).collectLatest {
            Log.d("SangDepTrai", "addNote: $it")
        }
    }

}