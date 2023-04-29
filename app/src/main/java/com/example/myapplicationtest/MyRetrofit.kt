package com.example.myapplicationtest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyRetrofit {

    fun getRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")  // https://www.simplifiedcoding.net/demos/         https://dummyjson.com/        http://mskko2021.mad.hakta.pro/api/
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}