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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        rv = findViewById(R.id.res)
        val ret = MyRetrofit().getRetrofit()
        val api = ret.create(ApiRet::class.java)
        val retr: Call<data> = api.getFeel()
        retr.enqueue(object:retrofit2.Callback<data> {
            override fun onResponse(call: Call<data>, response: Response<data>) {
                if(response.isSuccessful) {
                    rv.adapter = response.body()?.let { adapter(applicationContext,it.data)}
                }
            }

            override fun onFailure(call: Call<data>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }
}