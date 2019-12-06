package com.example.tandas.BO

import org.jetbrains.exposed.sql.Table

object Usuario: Table("usuarios"){
    val id = integer("us_id").autoIncrement().primaryKey()
    val nombres = varchar("us_nombre", length = 100)
    val apellidopat = varchar("us_apellidop", length = 45)
    val apellidomat = varchar("us_apellidom", length = 45)
    val correo = varchar("us_email", length = 45)
    val pass = varchar("us_pw", length = 45)
    val fk_id_domicilio = integer("us_domicilio").references(domicilios.id).primaryKey()
}