package com.rathana.jpa.entity

import java.sql.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name ="category")
data class Category (
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        var id : Long,
        var name : String,
        var description : String)
{
    override fun toString(): String {
        return "Category(id=$id, name='$name', description='$description')"
    }
}