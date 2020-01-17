package com.example.dvm_task03

import android.content.Context
import com.example.dvm_task03.Retrofit.DataClass2
import com.example.dvm_task03.Room.DataClasss

interface Contract {

    interface Presenter{
        fun fetchData(context: Context): MutableList<DataClasss>

    }

    interface Repository{
        fun fetchData(context: Context):MutableList<DataClasss>
        fun saveInDB(context: Context,results:MutableList<DataClasss>)
    }
}