/*
    Ejercicio #12
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Número intermedio
*/

fun main(args: Array<String>){
    var intNum1: Int = 0
    var intNum2: Int = 0
    var intNum3: Int = 0

    print("PRIMER NÚMERO: ")
    intNum1 = readLine()!!.toInt()

    print("SEGUNDO NÚMERO: ")
    intNum2 = readLine()!!.toInt()

    print("TERCER NÚMERO: ")
    intNum3 = readLine()!!.toInt()

    println("")
    print("EL INTERMEDIO ES: ")

    if(intNum1 > intNum2){
        if(intNum1 < intNum3){
            println(intNum1)
        }else{
            if(intNum2 > intNum3){
                println(intNum3)
            }else{
                println(intNum2)
            }
        }
    }else{
        if(intNum2 < intNum3){
            println(intNum2)
        }else{
            if(intNum1 < intNum3){
                println(intNum3)
            }else{
                println(intNum1)
            }
        }
    }
}