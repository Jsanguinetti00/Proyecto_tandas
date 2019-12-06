package com.example.tandas.BO

import org.jetbrains.exposed.sql.Table

object canpago:Table("canal_pago")
{
    val id = integer("ca_id").autoIncrement().primaryKey()
    val tipocan = integer("ca_tipo") //agregar fk de tipo canal pago
    val cajita = integer("ca_mutualista").references(cajitas.id).primaryKey() //agregar fk de mutualista



}