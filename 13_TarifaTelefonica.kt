/*
    Ejercicio #13
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Tarifa telefónica
*/

fun main(args: Array<String>){
    var intCanKV: Int = 0
    var fltTot: Float = 0.0f
    var fltCosKV: Float = 0.0f

    print("CANTIDAD DE KILOVATIOS: ")
    intCanKV = readLine()!!.toInt()

    if(intCanKV <= 1000) fltCosKV = 0.14f
    if((intCanKV > 1000) && (intCanKV <= 1800)) fltCosKV = 0.12f
    if(intCanKV > 1800) fltCosKV = 0.8f

    fltTot = intCanKV * fltCosKV

    println("TOTAL A PAGAR: $fltTot")
}