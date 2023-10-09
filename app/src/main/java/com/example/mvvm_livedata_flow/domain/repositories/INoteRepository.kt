package com.example.mvvm_livedata_flow.domain.repositories

import com.example.mvvm_livedata_flow.domain.model.table.NoteTable
import kotlinx.coroutines.flow.Flow

interface INoteRepository {
    fun addNote(noteTable: NoteTable) : Flow<Long>

    fun getAllNote(): Flow<List<NoteTable>>
}