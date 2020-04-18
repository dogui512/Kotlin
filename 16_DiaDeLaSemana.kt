/*
    Ejercicio #16
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Día de la semana
*/

fun main(args: Array<String>){
    var intNroDia: Byte = 0

    println("DIAS DE LA SEMANA")
    println("")
    print("Ingrese un número del 1 al 7: ")
    intNroDia = readLine()!!.toByte()

    when(intNroDia) {
        1.toByte() -> println("El NRO. $intNroDia CORRESPONDE AL DÍA LUNES")
        2.toByte() -> println("EL NRO. $intNroDia CORRESPONDE AL DÍA MARTES")
        3.toByte() -> println("EL NRO. $intNroDia CORRESPONDE AL DÍA MIÉRCOLES")
        4.toByte() -> println("EL NRO. $intNroDia CORRESPONDE AL DÍA JUEVES")
        5.toByte() -> println("EL NRO. $intNroDia CORRESPONDE AL DÍA VIERNES")
        6.toByte() -> println("EL NRO. $intNroDia CORRESPONDE AL DÍA SÁBADO")
        7.toByte() -> println("EL NRO. $intNroDia CORRESPONDE AL DÍA DOMINGO")
        else -> println("EL NÚMERO QUE INGRESO ESTA FUERA DE RANGO")
    }
}