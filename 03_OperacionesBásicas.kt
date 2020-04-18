/*
    Ejercicio #03
    Tomado del libro: Ejercicios de Programación en Consola de C#
    Operaciones básicas
*/

fun main(args: Array<String>){
    var intNum1: Int = 0
    var intNum2: Int = 0
    var intResu: Int = 0

    print("Ingrese primer número: ")
    intNum1 = readLine()!!.toInt()

    print("Ingrese segundo número: ")
    intNum2 = readLine()!!.toInt()

    //Suma
    intResu = intNum1 + intNum2
    println("La suma es: $intResu")

    //Resta
    intResu = intNum1 - intNum2
    println("La resta es: $intResu")

    //Multiplicación
    intResu = intNum1 * intNum2
    println("La multiplicación es: $intResu")

    //Division
    intResu = intNum1 / intNum2
    println("La división es: $intResu")

    //Residuo
    intResu = intNum1 % intNum2
    println("El residuo es: $intResu")
}