package pt.ulusofona.deisi.cm2122.g22008013_21905954

import java.io.Serializable


data class AvisoModel(
	val image: Int,
	val concelho: String,
	val distrito: String,
	val freguesia: String,
	val veiculos: Int,
	val observacoes: String,
	var data: String,
	var nome: String,
	val cartaoCidadao: Int,
) : Serializable
