package com.example.mvvm_livedata_flow.di

import com.example.mvvm_livedata_flow.data_source.local.dao.NoteDao
import com.example.mvvm_livedata_flow.data_source.local.dao.UserDao
import com.example.mvvm_livedata_flow.data_source.repository.AuthRepositoryIPLM
import com.example.mvvm_livedata_flow.data_source.repository.NoteRepositoryIPLM
import com.example.mvvm_livedata_flow.domain.repositories.IAuthRepository
import com.example.mvvm_livedata_flow.domain.repositories.INoteRepository
import com.example.mvvm_livedata_flow.domain.use_case.AuthUseCase
import com.example.mvvm_livedata_flow.domain.use_case.NoteUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun providerAuthRepository(userDao: UserDao) : IAuthRepository{
        return AuthRepositoryIPLM(userDao)
    }

    @Provides
    @Singleton
    fun providerAuthUseCase(iAuthRepository: IAuthRepository): AuthUseCase{
        return AuthUseCase(iAuthRepository)
    }


    @Provides
    @Singleton
    fun providerNoteRepository(noteDao: NoteDao) : INoteRepository{
        return NoteRepositoryIPLM(noteDao)
    }

    @Provides
    @Singleton
    fun providerNoteUseCase(noteRepository: INoteRepository): NoteUseCase{
        return NoteUseCase(noteRepository)
    }
}