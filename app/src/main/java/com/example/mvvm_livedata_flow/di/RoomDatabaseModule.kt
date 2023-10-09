package com.example.mvvm_livedata_flow.di

import android.app.Application
import androidx.room.Room
import com.example.mvvm_livedata_flow.app.MyApplication
import com.example.mvvm_livedata_flow.data_source.local.dao.NoteDao
import com.example.mvvm_livedata_flow.data_source.local.dao.UserDao
import com.example.mvvm_livedata_flow.data_source.local.database.RoomDatabaseXuan
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Provider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomDatabaseModule {
    @Provides
    @Singleton
    fun providerDatabase(application: Application): RoomDatabaseXuan {
        val db: RoomDatabaseXuan = Room.databaseBuilder(
            application,
            RoomDatabaseXuan::class.java,
            "databaseTest"
        ).build()
        return db
    }

    @Provides
    @Singleton
    fun providerUserDao(db: Provider<RoomDatabaseXuan>): UserDao {
        return db.get().userDao()
    }

    @Singleton
    @Provides
    fun providerNoteDao(db: Provider<RoomDatabaseXuan>): NoteDao {
        return db.get().noteDao()
    }
}