package com.example.dvm_task03.Presenter

import android.content.Context
import com.example.dvm_task03.Contract
import com.example.dvm_task03.Repository
import com.example.dvm_task03.Retrofit.DataClass2
import com.example.dvm_task03.Room.DataClasss
import com.example.dvm_task03.View.MainActivity

class Presenter(val homeRepo:Repository ): Contract.Presenter{

   override fun fetchData(context: Context):MutableList<DataClasss> {
       var myList=homeRepo.fetchData(context)
       return myList


    }

    }