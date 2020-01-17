package com.example.dvm_task03.Room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DataDao {

    @Insert
    fun insertAll(data:MutableList<DataClasss>)
    @Query("SELECT * FROM DataClasss")
    fun getAll(): MutableList<DataClasss>
    @Delete
    fun deleteAll(data:MutableList<DataClasss>)

}