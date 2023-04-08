package com.example.myapplicationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

import retrofit2.Call
import retrofit2.Response

class MainActivity2 : AppCompatActivity() {

    lateinit var rv:RecyclerView
    lateinit var res:TextView
    lateinit var adapter: adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        rv = findViewById(R.id.res)
        val ret = MyRetrofit().getRetrofit()
        val api = ret.create(ApiRet::class.java)
        val retr: Call<MutableList<data_movie>> = api.getFeel()
        retr.enqueue(object:retrofit2.Callback<MutableList<data_movie>> {
            override fun onResponse(call: Call<MutableList<data_movie>>, response: Response<MutableList<data_movie>>) {
                if(response.isSuccessful) {
                    adapter = adapter(baseContext,response.body() as MutableList<data_movie>)
                    rv.adapter = adapter
                    Toast.makeText(applicationContext, response.code().toString(), Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<MutableList<data_movie>>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }
}