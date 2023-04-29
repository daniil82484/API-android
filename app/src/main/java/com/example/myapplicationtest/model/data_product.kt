package com.example.myapplicationtest

data class product(val products:List<data_product>, val total:Int, val skip:Int, val limit:Int)

data class data_product(
    //val id:Int,
    val title:String,
    //val description:String,
    //val price:Int,
    //val discountPercentage:Int,
    //val rating:Int,
    //val stock:Int,
    //val brand:String,
    //val category:String,
    val thumbnail:String,
    //val images:String
)