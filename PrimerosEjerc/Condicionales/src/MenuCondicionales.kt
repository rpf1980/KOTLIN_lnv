
//CONDICIONALES
fun calculaResta(n1:Int, n2:Int): Int
{
    var res:Int = 0

    if (n1 < n2)
    {
        res = n2 - n1
    } 
    else
    {
        if(n2 < n1)
        {
            res = n1 - n2
        }
        else
        {
            throw Exception("Error: No se puede realizar la resta porque los números son iguales")
        }
    }

    return res
}

fun bisiesto(anio:Int): Boolean
{
    var biOk:Boolean = false;

    if(anio %4 == 0 && (anio %100 != 0 || anio %400 == 0))
    {
        biOk = true;
    }

    return biOk;
}

fun convensorEurosPesetas(cantidad:Double, tipo:String): Double
{
    var res:Double = 0.0;

    tipo.toLowerCase();

    if(tipo == "Pesetas")
    {
        res = cantidad * 166.386
    }
    else
    {
        if(tipo == "Euros")
        {
            res = cantidad / 166.386
        }
        else
        {
            throw Exception("Tipo de moneda no especificada")
        }
    }

    return res;
}

//BUCLES
fun numeros10al20()
{
    for(i in 1..20)
    {
        println(i)
    }
}

fun impares1a10()
{
    for(i in 1..10)
    {
        if(i %2 != 0)
        {
            println(i)
        }
    }
}

fun primeros10pares()
{
    var contador:Int = 0
    var i:Int = 2;

    while(contador < 10)
    {
        if(i %2 == 0) //Aquí sería true ya que i inicia con valor par
        {
            println(i) //Como es true lo imprime
            contador++; //Aumenta el contador del while ( llega hasta 10 elementos )
        }
        i++; //Busca el siguiente par
    }
}

fun main(args: Array<String>)
{
    //Ejercicio 1:
    //Pedimos datos por consola
    /*print("Escribe primer número: ")
    var n1:Int = readLine()?.toInt() as Int
    print("Escribe segundo número: ")
    var n2:Int = readLine()?.toInt() as Int

    var res:Int = calculaResta(n1, n2);
    println(res)*/

    //Ejercicio 2:
    //Pedimos datos por consola
    /*var res:Boolean;
    print("Escribe año: ")
    var anio:Int = readLine()?.toInt() as Int

    res = bisiesto(anio)
    println(res)*/

    //Ejercicio 3:
    //Variables
    /*var cantidad:Double;
    var tipo:String;
    var res:Double;*/

    //Pedimos tipo de moneda a convertir
    /*println("Elige tipo de moneda Euro o Peseta y cantidad a convertir")
    println("__________________________________")
    print("TIPO: ")
    tipo = readLine() as String
    println()
    print("CANTIDAD: ")
    cantidad = readLine()?.toDouble() as Double

    res = convensorEurosPesetas(cantidad, tipo)
    println(res)*/

    //------------------BUCLES---------------
    //Ejercicio 1:
    //numeros10al20()

    //Ejecicio 2:
    //impares1a10()

    //Ejercicio 3:
    primeros10pares()
}