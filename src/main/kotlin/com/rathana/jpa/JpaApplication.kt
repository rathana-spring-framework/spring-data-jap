package com.rathana.jpa

import com.rathana.jpa.repository.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
open class JpaApplication

fun main(args: Array<String>) {
    runApplication<JpaApplication>(*args)
}
