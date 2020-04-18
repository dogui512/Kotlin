/*
    Ejercicio #05
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Funciones Basicas Libreria Matemática
*/

import kotlin.math.roundToInt

fun main(args: Array<String>){
    var intNum1: Int = 0
    var lngResul: Long = 0
    val dblPotencia: Double = 3.00

    print("Digite un Número: ")
    intNum1 = readLine()!!.toInt()

    lngResul = Math.abs(intNum1.toLong())
    println("Valor Absoluto: $lngResul")

    println("Potencia: " + (Math.pow(intNum1.toDouble(), dblPotencia)))

    println("Raíz Cuadrada: " + Math.sqrt(intNum1.toDouble()))

    println("Seno: " + Math.sin(intNum1.toDouble()))

    println("Coseno: " + Math.cos(intNum1.toDouble()))

    println("Número Max: " + Math.max(intNum1, 50))

    println("Número Min: " + Math.min(intNum1, 50))

    println("Parte Entera: " + 18.78.toInt())

    println("Redondeo: " + 18.78.roundToInt())
}