package com.example.mvvm_livedata_flow.data_source.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

@Dao
interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(data: T): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vararg data: T): Array<Long>

    @Delete
    suspend fun deleteData(data: T): Int

    @Update
    suspend fun update(data: T): Int
}