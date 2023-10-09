package com.example.mvvm_livedata_flow.data_source.repository

import androidx.lifecycle.LiveData
import com.example.mvvm_livedata_flow.data_source.local.dao.NoteDao
import com.example.mvvm_livedata_flow.domain.model.table.NoteTable
import com.example.mvvm_livedata_flow.domain.repositories.INoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class NoteRepositoryIPLM(private val noteDao: NoteDao) : INoteRepository {
    override fun addNote(noteTable: NoteTable): Flow<Long> {
        return flow {
            emit(noteDao.insert(noteTable))
        }
    }

    override fun getAllNote(): Flow<List<NoteTable>> {
        return noteDao.getAllNote()
    }
}