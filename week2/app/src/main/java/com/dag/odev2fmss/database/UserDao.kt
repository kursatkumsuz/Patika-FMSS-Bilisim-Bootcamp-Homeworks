package com.dag.odev2fmss.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    /**
     * Inserts a new data to database
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: UserEntity)

    /**
     * Queries name and password data
     * @return LiveData containing [UserEntity]
     */
    @Query("SELECT * FROM user WHERE name =:userName AND password =:password")
    fun getUser(userName: String, password: String): LiveData<UserEntity>
}