package com.example.myapplicationtest

data class quotes(val success:Boolean, val data:List<data_quotes>)
data class data_quotes(val id:Int, val title:String,val image:String,val descriptor:String)