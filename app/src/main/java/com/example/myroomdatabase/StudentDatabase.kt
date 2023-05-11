package com.example.myroomdatabase

import androidx.room.Database


@Database(entities = [Student::class] , version = 1)
abstract class StudentDatabase {
    abstract fun studentDao() : StudentDAO
}