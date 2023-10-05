package com.example.mvvm_livedata_flow.domain.repositories

import com.example.mvvm_livedata_flow.domain.model.table.UserTable
import kotlinx.coroutines.flow.Flow

interface IAuthRepository {
    fun login(userTable: UserTable): Flow<Long>
}