package com.example.mvvm_livedata_flow.domain.model.table

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "UserTable")
data class UserTable (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo(name = "userName")
    val userName: String,

    @ColumnInfo("password")
    val passWord: String
)