package com.example.myapplicationtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.myapplicationtest.model.login
import retrofit2.Call
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    lateinit var email: EditText
    lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.email)
        password = findViewById(R.id.pass)


    }
    //fun login(view: View) {
    //    if(email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
    //        val log = MyRetrofit().getRetrofit()
    //        val getApi = log.create(ApiRet::class.java)
    //        var hashMap: HashMap<String,String> = HashMap<String,String>()
    //        hashMap.put("email", email.text.toString())
    //        hashMap.put("password", password.text.toString())
    //        val log_call:retrofit2.Call<login> = getApi.getAuth(hashMap)
    //        log_call.enqueue(object : retrofit2.Callback<login>{
    //            override fun onResponse(call: Call<login>, response: Response<login>) {
    //                if (response.isSuccessful){
    //                    val intent = Intent(this@MainActivity, MainActivity2::class.java)
    //                    startActivity(intent)
    //                }
    //            }
    //            override fun onFailure(call: Call<login>, t: Throwable) {
    //                Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_SHORT).show()
    //            }
//
    //        })
//
    //    }
    //}
}
