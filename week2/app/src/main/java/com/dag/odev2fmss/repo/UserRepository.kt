package com.dag.odev2fmss.repo

import androidx.lifecycle.LiveData
import com.dag.odev2fmss.database.UserDao
import com.dag.odev2fmss.database.UserEntity

class UserRepository(private val userDao: UserDao) {
    var readUser: LiveData<UserEntity>? = null

    /**
     * Adds a new user to database
     * @param user for insert into database
     */
    suspend fun addUser(user: UserEntity) {
        userDao.insertUser(user)
    }

    /**
     * Reads user information from database
     * @param name for getUser function
     * @param password for getUser function
     * @return a nullable LiveData, [readUser]
     */
    fun signIn(name: String, password: String): LiveData<UserEntity>? {
        readUser = userDao.getUser(name, password)
        return readUser
    }
}