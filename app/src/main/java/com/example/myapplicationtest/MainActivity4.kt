package com.example.myapplicationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity4 : AppCompatActivity() {
    lateinit var img: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        img = findViewById(R.id.image1)
        Glide.with(this).load("https://www.simplifiedcoding.net/demos/marvel/spiderman.jpg").into(img)
    }
}