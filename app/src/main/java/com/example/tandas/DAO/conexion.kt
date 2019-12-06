package com.example.tandas.DAO
import org.jetbrains.exposed.dao.*
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction



fun conex() {
    //an example connection to H2 DB
    Database.connect("jdbc:mysql://37.59.55.185:3306/FlpApfSJR", driver = "com.mysql.jdbc.Driver",
        user = "FlpApfSJR", password = "1XJsawKjc")


}