import java.util.*;

class Vehiculo
{
    var marca:String
    var modelo:String
    var matricula:String

    constructor(marca:String,modelo:String,matricula:String)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    fun imprimir()
    {
        println("Marca: $marca \nModelo: $modelo \nMatricula: $matricula")
    }

    fun main(args: Array<String>)
    {
        val vehiculo01 = Vehiculo(marca,modelo,matricula)

        vehiculo01.marca = "Renault"
        vehiculo01.modelo = "Clio"
        vehiculo01.matricula = "2323UUW"

        vehiculo01.imprimir()

    }
}

