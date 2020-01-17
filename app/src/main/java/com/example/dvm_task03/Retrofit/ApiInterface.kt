package com.example.dvm_task03.Retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("planetary/earth/assets")
    fun getData(@Query("lon")Ion:Float=100.75f,@Query("lat")lat:Float=1.5f,@Query("begin")begin:String="2014-02-01",@Query("api_key")api_key:String="DEMO_KEY"):Call<DataClass2>
}