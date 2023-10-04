package com.raihan.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = [Course::class], version = 1)

abstract class CourseDatabase:RoomDatabase() {
    abstract fun CourseDao():CourseDao
}