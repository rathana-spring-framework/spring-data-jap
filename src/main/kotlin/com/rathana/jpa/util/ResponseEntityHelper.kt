package com.rathana.jpa.util

import com.rathana.jpa.entity.Response
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity


class ResponseEntityHelper<T> {
    companion object {
        val QUERY="QUERY"
        val INSERT="INSERT"
        val DELETE="DELETE"
        val UPDATE="UPDATE"
    }
    private lateinit var map : MutableMap<String ,Any?>
    fun create(t: T?=null , sqlType: String?) : ResponseEntity<MutableMap<String, Any?>>{
        map= mutableMapOf()
        var response: Response<T>?=null
        if(sqlType!=null && sqlType== DELETE){
                response=Response(
                        "delete successful",
                        200,
                        true,
                        null)
        }

        if(sqlType!=null && sqlType== INSERT){
            response=Response(
                    "insert successful",
                    200,
                    true,
                    t)
        }

        if(sqlType!=null && sqlType== QUERY){
            if(t!=null){
                response=Response(
                        "get data successful",
                        200,
                        true,
                        t)
            }else{
                response=Response(
                        "get data unsuccessfully",
                        101,
                        false,
                        t)
            }

        }

        map.put("message",response?.message)
        map.put("code",response?.code)
        map.put("status",response?.status)
        map.put("data",response?.data)

        return ResponseEntity(map,HttpStatus.OK)
    }
}