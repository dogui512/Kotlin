/*
    Ejercicio #09
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Mayor de tres números
*/

fun main(args: Array<String>){
    var intNro1: Byte = 0
    var intNro2: Byte = 0
    var intNro3: Byte = 0
    var intMayo: Byte = 0
    var intMeno: Byte = 0

    print("NÚMERO 1: ")
    intNro1 = readLine()!!.toByte()

    print("NÚMERO 2: ")
    intNro2 = readLine()!!.toByte()

    print("NÚMERO 3: ")
    intNro3 = readLine()!!.toByte()

    intMayo = intNro1
    intMeno = intNro2

    if(intNro1 > intMayo) intMayo = intNro2
    if(intNro3 > intMayo) intMayo = intNro3
    if(intNro2 > intMeno) intMeno = intNro2
    if(intNro3 < intMeno) intMeno = intNro3

    println("MAYOR ES: $intMayo")
    println("MENOR ES: $intMeno")
}