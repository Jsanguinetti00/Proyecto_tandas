package com.example.tandas.BO

import org.jetbrains.exposed.sql.Table

object domicilios:Table ("domicilio"){
    val id = integer("do_id").autoIncrement().primaryKey()
    val Calle = integer("do_calle")
    val Numero = varchar("do_numero",length = 45)
    val Cruzamientons = varchar ("do_cruzamientos", length = 45)
    val codpos = integer("do_cp")
    val Colonia = varchar("do_colonia",length = 45)
    val fk_i_municipio = integer("do_municipio").references(municipio.id).primaryKey() //llave foranea

}