package com.rathana.jpa.service

import com.rathana.jpa.entity.Category

interface CategoryService {
    fun getAll(): MutableList<Category>
    fun add(category: Category):Boolean
    fun delete(id: Int)
    fun edit(category: Category)


}