package com.example.mvvm_livedata_flow.data_source.repository

import com.example.mvvm_livedata_flow.data_source.local.dao.UserDao
import com.example.mvvm_livedata_flow.domain.model.table.UserTable
import com.example.mvvm_livedata_flow.domain.repositories.IAuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class AuthRepositoryIPLM(private val userDao: UserDao) : IAuthRepository {
    override fun login(userTable: UserTable): Flow<Long> = flow{
        emit(userDao.insert(userTable))
    }
}