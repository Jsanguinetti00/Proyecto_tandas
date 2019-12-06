package com.example.tandas.BO

import org.jetbrains.exposed.sql.Table

object municipio:Table("municipios"){
    val id = integer("mu_id").autoIncrement().primaryKey()
    val nombremu = varchar("mu_nombre", length = 45)
    val fk_id_estado = integer("mu_estado").references(estado.id).primaryKey()//Foreing key
}