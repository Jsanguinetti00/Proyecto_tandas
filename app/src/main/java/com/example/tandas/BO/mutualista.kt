package com.example.tandas.BO

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.datetime

object cajitas:Table("mutualista")
{
    val id =integer("mu_id").autoIncrement().primaryKey()
    val fechaini = datetime("mu_fechai")
    val montopago = double("mu_monto")
    val fechatermi = datetime("mu_fechaf")
    val diapag= varchar("mu_diap", length = 50)
    val fk_id_usuario = integer("mu_usuario").references(Usuario.id).primaryKey()
    val estatus = binary("mu_status",length = 1)
    val coment = text("mu_comentario",null)

}