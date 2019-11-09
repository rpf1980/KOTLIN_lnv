import java.util.*

//Función que muestra por consola un array de enteros formateado de n tamaño
fun escribeArrayInt(arr:IntArray)
{
    print("[")
    for(i in arr.take(arr.size-1))
    {
        print("${i},")
    }
    print(arr[arr.size-1])
    print("]")
}

//Función que muestra por consola un array de doubles formateado de n tamaño
fun escribeArrayDouble(arr:DoubleArray)
{
    print("[")
    for (i in arr.take(arr.size -1))
    {
        print("${i}, ")
    }
    print(arr[arr.size-1])
    print("]")
}

//Función que muestra por consola un array de booleanos formateado de n tamaño
fun escribeArrayBool(arr:BooleanArray)
{
    print("[")
    for (i in arr.take(arr.size -1))
    {
        print("${i},")
    }
    print(arr[arr.size-1])
    print("]")
}

//Función que lee datos y los ingresa en un array de enteros de determinado tamaño
fun leeArrayInt(array: Array<Int?>)
{
    var read = Scanner(System.`in`)
    for(i in 0..4)
    {
        print("Número ${i}: ")
        array[i] = read.nextInt()
    }
}

fun main(argrs: Array<String>) {
    /*//Escribe array de enteros:
    val arr:IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10);
    escribeArrayInt(arr)*/

    //Escribe array de doubles:
    /*var arr:DoubleArray = doubleArrayOf(2.3, 4.4, 5.6)
    escribeArrayDouble(arr)*/

    //LeeArray de enteros:
    /*var nulo = arrayOfNulls<Int>(5)
    leeArrayInt(nulo)*/

    /*var arr:BooleanArray = booleanArrayOf(true, false, true)
    escribeArrayBool(arr)*/
}


