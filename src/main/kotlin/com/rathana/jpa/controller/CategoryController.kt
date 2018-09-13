package com.rathana.jpa.controller

import com.rathana.jpa.entity.Category
import com.rathana.jpa.service.CategoryService
import com.rathana.jpa.util.ResponseEntityHelper
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1")
class CategoryController {
    var cateService: CategoryService
    constructor(cateService: CategoryService){
        this.cateService=cateService
    }

    @PostMapping("/create")
    fun addCategory(@RequestBody category: Category):
            ResponseEntity<MutableMap<String,Any>>{
         val map:MutableMap<String, Any> = mutableMapOf()

        try {
            val category=cateService.add(category)
            if(category!=null){
                map.put("message","create category successfully")
                map.put("code",200)
                map.put("status",true)
                map.put("data",category)

            }else{
                map.put("message","have an error")
                map.put("code",500)
                map.put("status",false)
                map.put("data",category)
            }

        }catch (ex : Exception){
            ex.printStackTrace()
            map.put("message","have an error")
            map.put("code",500)
            map.put("status",false)
            map.put("data",category)
        }

        return ResponseEntity(map,HttpStatus.OK)
    }

    @GetMapping("/get-all")
    fun getCategories():
            ResponseEntity<MutableMap<String,Any>>{
        val map:MutableMap<String, Any> = mutableMapOf()

        try {
            val categories=this.cateService.getAll()
            if(categories!=null){
                map.put("message","get categories successfully")
                map.put("code",200)
                map.put("status",true)
                map.put("data",categories)

            }else{
                map.put("message","have an error")
                map.put("code",500)
                map.put("status",false)
                map.put("data",{})
            }

        }catch (ex : Exception){
            ex.printStackTrace()
        }

        return ResponseEntity(map,HttpStatus.OK)
    }

    @DeleteMapping("{id}/delete")
    fun delete(@PathVariable("id") id: Long): ResponseEntity<MutableMap<String,Any?>>{
        val responseEntityHelper= ResponseEntityHelper<Long>()
        val category=Category(id,null,null)
        cateService.delete(category)
        return responseEntityHelper.create(null,ResponseEntityHelper.DELETE)
    }
   /* fun findById(): ResponseEntity<MutableMap<String,Any?>>{

    }
    fun findByName(): ResponseEntity<MutableMap<String,Any?>>{

    }*/
}