package com.rathana.jpa.service

import com.rathana.jpa.entity.Category

interface CategoryService {
    fun getAll(): MutableList<Category>
    fun add(category: Category):Category
    fun delete(category: Category)
    fun edit(category: Category)
    fun findById(id: Int) : Category
    fun  findByName(name: String): Category


}