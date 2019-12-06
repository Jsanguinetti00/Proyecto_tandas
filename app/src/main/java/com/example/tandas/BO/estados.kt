package com.example.tandas.BO

import org.jetbrains.exposed.sql.Table

object estado:Table("estados"){
    val id=integer("es_id").autoIncrement().primaryKey()
    val nombrees = varchar ("es_nombre",length = 45)
}