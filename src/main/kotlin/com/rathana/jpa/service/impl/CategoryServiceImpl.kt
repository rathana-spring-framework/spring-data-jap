package com.rathana.jpa.service.impl

import com.rathana.jpa.entity.Category
import com.rathana.jpa.repository.CategoryRepository
import com.rathana.jpa.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryServiceImpl : CategoryService {

    var cateRepo: CategoryRepository
    public constructor(cateRepo: CategoryRepository){
        this.cateRepo= cateRepo
    }

    override fun getAll(): MutableList<Category> =this.cateRepo.findAll()


    override fun add(category: Category) : Category {
        return this.cateRepo.save(category)
    }

    override fun delete(id: Int) {

    }

    override fun edit(category: Category) {

    }
}