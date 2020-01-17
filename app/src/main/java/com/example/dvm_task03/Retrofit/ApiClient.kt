package com.example.dvm_task03.Retrofit

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object
ApiClient {
    var baseurl:String= "https://api.nasa.gov/"

    fun get():ApiInterface {
        val gson = GsonBuilder()
            .setLenient()
            .create()

        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
        val retrofit = Retrofit.Builder().baseUrl(baseurl).client(client).addConverterFactory(
            GsonConverterFactory.create(gson)
        ).build()
        return retrofit.create(ApiInterface::class.java)
    }

    }