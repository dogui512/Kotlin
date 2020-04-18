/*
    Ejercicio #08
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Mayor de dos números
*/

fun main(args: Array<String>){
    var intNro1: Int = 0
    var intNro2: Int = 0
    var strResu: String = ""

    print("NÚMERO 1: ")
    intNro1 = readLine()!!.toInt()

    print("NÚMERO 2: ")
    intNro2 = readLine()!!.toInt()

    if(intNro1 > intNro2){
        println("$intNro1 ES MAYOR QUE $intNro2")
    } else if(intNro1 == intNro2){
        println("$intNro1 ES IGUAL A $intNro2")
    }else{
        println("$intNro2 ES MAYOR QUE $intNro1")
    }
    println()
    println("OTRA OPCIÓN")

    if(intNro1 > intNro2){
        strResu = "ES MAYOR QUE"
    }else if(intNro1 == intNro2){
        strResu = "ES IGUAL A"
    }else{
        strResu = "ES MENOR QUE"
    }

    println("$intNro1 $strResu $intNro2")
}