package com.example.dvm_task03.Room
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase

@Database(
    entities =[DataClasss::class],
    version=1,
    exportSchema = false)

abstract class DataDatabase : RoomDatabase() {

    abstract fun getDao(): DataDao

companion object{
    fun create(context: Context):DataDatabase {
        val db= databaseBuilder(context, DataDatabase::class.java,
            "app_database"
        ).allowMainThreadQueries().build()
        return db
    }
}

}
