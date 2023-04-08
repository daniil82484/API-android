package com.example.myapplicationtest

data class data(val success:Boolean, val data:List<data_movie>)
data class data_movie(val id:Int, val title:String, val position:Int, val image:String)