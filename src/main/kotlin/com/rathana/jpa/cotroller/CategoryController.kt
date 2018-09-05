package com.rathana.jpa.cotroller

import com.rathana.jpa.entity.Category
import com.rathana.jpa.service.CategoryService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1")
class CategoryController {
    var cateService: CategoryService
    public constructor(cateService: CategoryService){
        this.cateService=cateService
    }

    @PostMapping("/create")
    fun addCategory(@RequestBody category: Category):
            ResponseEntity<MutableMap<String,Any>>{
         val map:MutableMap<String, Any> = mutableMapOf()

        try {
            if(this.cateService.add(category)){
                map.put("message","create category successfully")
                map.put("code",200)
                map.put("status",true)
                map.put("data",category)

            }else{
                map.put("message","have an error")
                map.put("code",500)
                map.put("status",false)
                map.put("data",{})
            }

        }catch (ex : Exception){
            ex.printStackTrace()
        }

        return ResponseEntity<MutableMap<String,Any>>(map,HttpStatus.OK)
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

        return ResponseEntity<MutableMap<String,Any>>(map,HttpStatus.OK)
    }
}