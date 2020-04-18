/*
    Ejercicio #04
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Compra en restaurant
*/

fun main(args: Array<String>){
    var intCanB: Byte = 0
    var intCanH: Byte = 0
    var intCanP: Byte = 0
    val fltPrecioH: Float = 450.23f
    val fltPrecioB: Float = 80.50f
    val fltPrecioP: Float = 160.20f
    var fltApagar: Float = 0.0f

    print("Cantidad de Hamburguesas: ")
    intCanH = readLine()!!.toByte()

    print("Cantidad de Papas: ")
    intCanP = readLine()!!.toByte()

    print("Cantidad de Bebidas: ")
    intCanB = readLine()!!.toByte()

    fltApagar = (fltPrecioH * intCanH) + (fltPrecioP * intCanP) + (fltPrecioB * intCanB)

    println("Total a pagar: $fltApagar")

}