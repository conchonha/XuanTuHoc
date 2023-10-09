package com.example.mvvm_livedata_flow.domain.use_case

import com.example.mvvm_livedata_flow.domain.model.table.NoteTable
import com.example.mvvm_livedata_flow.domain.repositories.INoteRepository
import kotlinx.coroutines.flow.Flow

class NoteUseCase(private val noteRepository: INoteRepository) {
    fun addNote(title: String, content: String): Flow<Long> {
        return noteRepository.addNote(NoteTable(title = title, content = content))
    }

    fun getAllNote(): Flow<List<NoteTable>> = noteRepository.getAllNote()
}