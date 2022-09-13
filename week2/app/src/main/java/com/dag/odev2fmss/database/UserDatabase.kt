package com.dag.odev2fmss.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserEntity::class], version = 1)
abstract class UserDatabase : RoomDatabase() {

    /**
     * Accesses DAO
     * @return [UserDao]
     */
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var instance: UserDatabase? = null
        private val lock = Any()

        /**
         * Checks [instance] is exist or not
         * @param [context] for createDB function
         */
        operator fun invoke(context: Context) = instance ?: synchronized(lock) {
            instance ?: createDB(context).also {
                instance = it
            }
        }

        /**
         * Creates database
         * @param context for building database
         */
        private fun createDB(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            UserDatabase::class.java,
            "task_database"
        ).build()
    }
}