package com.dag.odev2fmss.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntity(
    @ColumnInfo(name = "mail")
    val userMail: String,
    @ColumnInfo(name = "name")
    val userName: String,
    @ColumnInfo(name = "password")
    val userPassword: String,
    @PrimaryKey(autoGenerate = true)
    val primaryKey: Int? = null
)
