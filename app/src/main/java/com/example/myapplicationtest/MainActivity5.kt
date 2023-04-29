package com.example.myapplicationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Response

class MainActivity5 : AppCompatActivity() {

    lateinit var poster_res: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        poster_res = findViewById(R.id.res3)
        val retrofit = MyRetrofit().getRetrofit()
        val api_ret = retrofit.create(ApiRet::class.java)
        val retr_call: Call<product> = api_ret.getProducts()
        retr_call.enqueue(object:retrofit2.Callback<product> {
            override fun onResponse(call: Call<product>, response: Response<product>) {
                if(response.isSuccessful) {
                    poster_res.adapter = response.body()?.let { adapter2(applicationContext, it.products)}
                }
            }

            override fun onFailure(call: Call<product>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }
}