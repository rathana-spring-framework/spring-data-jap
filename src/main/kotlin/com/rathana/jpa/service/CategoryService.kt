package com.rathana.jpa.service

import com.rathana.jpa.entity.Category

interface CategoryService {
    fun getAll(): MutableList<Category>
    fun add(category: Category):Category
    fun delete(id: Int)
    fun edit(category: Category)


}