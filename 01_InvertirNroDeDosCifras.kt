/*
    Ejercicio #01
    Tomado del libro: Ejercicios de Programación en Consola de C#
    Invertir número de dos cifras
*/

fun main(args: Array<String>){
    var intNum: Int = 0
    var intAux: Int = 0
    var intDec: Int = 0
    var intUni: Int = 0

    print("Ingrese un Nro: ")
    intNum = readLine()!!.toInt()
    intDec = intNum / 10
    intUni = intNum % 10
    intAux = (intUni * 10) + intDec

    println("El número invertido es: $intAux")
}