package com.example.dvm_task03
import android.content.Context
import android.widget.Toast
import com.example.dvm_task03.Retrofit.ApiClient
import com.example.dvm_task03.Retrofit.DataClass2
import com.example.dvm_task03.Room.DataClasss
import com.example.dvm_task03.Room.DataDatabase
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository{


     fun fetchData(context:Context):MutableList<DataClasss> {
        val call: Call<DataClass2> = ApiClient.get().getData()
        call.enqueue(object :Callback<DataClass2> {
            override fun onResponse(
                call: Call<DataClass2>,
                response: Response<DataClass2>
            ) {

                val data=response.body()!!
                saveInDB(context, data.results)


            }

            override fun onFailure(call: Call<DataClass2>, t: Throwable) {
                Toast.makeText(context,
                    R.string.Activity_Failed,
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
        return DataDatabase.create(context).getDao().getAll()
    }





     fun saveInDB(context: Context,results: MutableList<DataClasss>) {
        DataDatabase.create(context).getDao().deleteAll(results)
        DataDatabase.create(context).getDao().insertAll(results)
    }
}