package com.example.tandas.BO

import org.jetbrains.exposed.sql.Table

object CURP:Table("curp"){
    val id = integer("cu_id").autoIncrement().primaryKey()
    val ucurp = varchar("cu_curp", length = 45)
    val fk_id_usuario = integer("cu_usuario").references(Usuario.id).primaryKey()
}