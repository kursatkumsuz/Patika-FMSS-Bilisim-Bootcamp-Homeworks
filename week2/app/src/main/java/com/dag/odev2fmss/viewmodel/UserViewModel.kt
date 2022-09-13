package com.dag.odev2fmss.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.dag.odev2fmss.database.UserDatabase
import com.dag.odev2fmss.database.UserEntity
import com.dag.odev2fmss.repo.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : AndroidViewModel(application) {

    private var readUser: LiveData<UserEntity>?
    private val repository: UserRepository

    init {
        val userDao = UserDatabase.invoke(application).userDao()
        repository = UserRepository(userDao)
        readUser = repository.readUser
    }

    /**
     * Adds a new user to database
     * @param user for addUser function
     */
    fun addUser(user: UserEntity) {
        viewModelScope.launch {
            repository.addUser(user)
        }
    }

    /**
     * Reads user information from database
     * @param name for getUser function
     * @param password for getUser function
     * @return a nullable LiveData, [readUser]
     */
    fun signIn(name: String, password: String): LiveData<UserEntity>? {
        readUser = repository.signIn(name, password)
        return readUser
    }
}