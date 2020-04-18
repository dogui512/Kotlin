/*
    Ejercicio #07
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Realizar la operación (a+b)*(a-b)
*/

fun main(args: Array<String>){
    var intA: Int = 0
    var intB: Int = 0
    var intR: Float = 0f

    print("NÚMERO 1: ")
    intA = readLine()!!.toInt()

    print("NÚMERO 2: ")
    intB = readLine()!!.toInt()

    intR = ((intA + intB) * (intA - intB)).toFloat()
    println("RESULTADO: $intR")
}