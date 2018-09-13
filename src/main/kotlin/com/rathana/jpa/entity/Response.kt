package com.rathana.jpa.entity

data class Response<T> (
        var message: String ,
        var code:Int,
        var status : Boolean,
        var data : T?
)