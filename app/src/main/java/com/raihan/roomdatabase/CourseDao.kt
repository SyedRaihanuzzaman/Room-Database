package com.raihan.roomdatabase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao

interface CourseDao {

    @Query("SELECT * FROM Course")
   suspend fun getAll():List<Course>

   @Insert
   suspend fun insertAll(Courses:List<Course>)

   @Delete
   suspend fun delete(course: Course)
}