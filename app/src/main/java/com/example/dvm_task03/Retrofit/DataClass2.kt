package com.example.dvm_task03.Retrofit


import com.example.dvm_task03.Room.DataClasss
import com.google.gson.annotations.Expose

data class DataClass2(
    @Expose
    var count:Int,
    @Expose
    var results:MutableList<DataClasss>
)

