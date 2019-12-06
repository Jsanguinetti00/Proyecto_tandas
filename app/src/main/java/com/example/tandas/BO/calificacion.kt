package com.example.tandas.BO

import org.jetbrains.exposed.sql.Table

object calificaciones:Table("calificacion"){
    val id = integer("cal_id").autoIncrement().primaryKey()
    val calinum = integer("cal_num")
    val fk_id_usuario = integer("cal_usuario").references(Usuario.id).primaryKey()
    val coment = varchar("cal_comentario", length = 200)

}