package com.rathana.jpa.repository

import com.rathana.jpa.entity.Category
import org.springframework.data.repository.Repository

@org.springframework.stereotype.Repository
interface CategoryRepository : Repository<Category,Long>{

    fun findAll(): MutableList<Category>
    fun save(category: Category) : Boolean

}