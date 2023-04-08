package com.example.myapplicationtest

data class data(val success:Boolean, val data:List<data_feelings>)
data class data_feelings(val id:Int, val title:String,val position:Int,val image:String)