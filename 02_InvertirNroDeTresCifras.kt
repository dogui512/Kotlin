/*
    Ejercicio #02
    Tomado del libro: Ejercicios de Programación en Consola de C#
    Invertir número de tres cifras
*/

fun main(args: Array<String>){
    var intNum: Int = 0
    var intAux: Int = 0
    var intDec: Int = 0
    var intUni: Int = 0
    var intCen: Int = 0
    var strLinea: String = ""

    print("Ingrese número de tres cifras: ")
    intNum = readLine()!!.toInt()

    intCen = intNum / 100
    intNum = intNum % 100
    intDec = intNum / 10
    intUni = intNum % 10

    intAux = (intUni * 100) + (intDec * 10) + intCen

    println("Número invertido es: $intAux")
}