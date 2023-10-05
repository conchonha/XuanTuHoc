package com.example.mvvm_livedata_flow.domain.use_case

import com.example.mvvm_livedata_flow.domain.model.table.UserTable
import com.example.mvvm_livedata_flow.domain.repositories.IAuthRepository
import kotlinx.coroutines.flow.Flow

class AuthUseCase(private val iAuthRepository: IAuthRepository) {
    fun login(userName: String, pass: String): Flow<Long> {
        return iAuthRepository.login(UserTable(userName = userName, passWord = pass))
    }
}