package com.raihan.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class Course(
    @PrimaryKey
    val courseID:Int,
    @ColumnInfo(name = "courseName")
    val name:String,
    @ColumnInfo(name = "courseEmail")
    val email:String,
    @ColumnInfo(name = "coursePrice")
    val price:String
)
