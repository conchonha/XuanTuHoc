package com.example.mvvm_livedata_flow.data_source.local.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvm_livedata_flow.app.MyApplication
import com.example.mvvm_livedata_flow.data_source.local.dao.UserDao
import com.example.mvvm_livedata_flow.domain.model.table.UserTable

@Database(entities = [UserTable::class],exportSchema = false, version = 1)
abstract class RoomDatabaseXuan : RoomDatabase() {
    abstract fun userDao(): UserDao
}
