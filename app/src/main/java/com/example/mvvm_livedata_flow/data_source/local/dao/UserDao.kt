package com.example.mvvm_livedata_flow.data_source.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.mvvm_livedata_flow.data_source.local.BaseDao
import com.example.mvvm_livedata_flow.domain.model.table.UserTable
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao : BaseDao<UserTable> {
    @Query("select * from usertable")
    fun getAllUser(): Flow<List<UserTable>>
}