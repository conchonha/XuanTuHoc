package com.example.mvvm_livedata_flow.domain.model.table

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.Calendar

@Entity("NoteTable")
data class NoteTable(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo("noteTitle")
    val title: String = "",

    @ColumnInfo("noteContent")
    val content: String = "",

    @ColumnInfo("createDate")
    val createDate: String = SimpleDateFormat("dd-mm-yyyy").format(Calendar.getInstance().time)
)