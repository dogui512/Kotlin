/*
    Ejercicio #10
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Desglose de billetes
*/

fun main(args: Array<String>){

    var intC100: Int = 0
    var intCan: Int = 0
    var intC50: Int = 0
    var intC20: Int = 0
    var intC10: Int = 0
    var intC5: Int = 0

    print("DIGITE UNA CANTIDAD: ")
    intCan = readLine()!!.toInt()

    if(intCan >= 100){
        intC100 = (intCan / 100)
        intCan = intCan - (intC100 * 100)
    }
    if(intCan >= 50){
        intC50 = (intCan / 50)
        intCan = intCan - (intC50 * 50)
    }
    if(intCan >= 20){
        intC20 = (intCan / 20)
        intCan = intCan - (intC20 * 20)
    }
    if(intCan >= 10){
        intC10 = (intCan / 10)
        intCan = intCan - (intC10 * 10)
    }
    if(intCan >= 5){
        intC5 = (intCan / 5)
        intCan = intCan - (intC5 * 5)
    }

    println("BILLETES DE A 100: $intC100")
    println("BILLETES DE A 50: $intC50")
    println("BILLETES DE A 20: $intC20")
    println("BILLETES DE A 10: $intC10")
    println("BILLETES DE A 5: $intC5")
    println("BILLETES DE A 1: $intCan")
}