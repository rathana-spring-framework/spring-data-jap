/*
package com.rathana.jpa.configuration

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import javax.sql.DataSource

@Configuration
@ComponentScan("com.rathana.jpa.repository")
open class DataSourceConfiguration {

    private var dataSource: DataSource
    constructor(dataSource: DataSource){
        this.dataSource=dataSource
    }

    */
/*@Profile("mysql")
    @Bean("mysqlDataSource")
    open fun getDataSource(dataSource: DataSource) : DataSource=this.dataSource
    *//*


  */
/*  @Bean("h2DataSource")
    @Profile("h2")
    open fun  inMemoryDB(): DataSource {
        val databaseBuilder = EmbeddedDatabaseBuilder()
        databaseBuilder.addScript("db/schema.sql")
        databaseBuilder.addScript("db/data.sql")
        databaseBuilder.setType(EmbeddedDatabaseType.H2)
        return databaseBuilder.build()
    }*//*


    @Bean
    open fun datasourceTransactionManager() : DataSourceTransactionManager=
            DataSourceTransactionManager(dataSource)
}*/
