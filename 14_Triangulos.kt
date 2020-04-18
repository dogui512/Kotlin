/*
    Ejercicio #14
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Triángulos
*/

fun main(args: Array<String>){
    var intLado1: Byte = 0
    var intLado2: Byte = 0
    var intLado3: Byte = 0

    print("INGRESE LADO 1: ")
    intLado1 = readLine()!!.toByte()

    print("INGRESE LADO 2: ")
    intLado2 = readLine()!!.toByte()

    print("INGRESE LADO 3: ")
    intLado3 = readLine()!!.toByte()

    if((intLado1 == intLado2) && (intLado2 == intLado3) ){
        println("TRIÁNGULO EQUILÁTERO. TODOS IGUALES")
    }else if((intLado1 != intLado2) && (intLado1 != intLado3) && (intLado2 != intLado3)){
        println("TRIÁNGULO ESCALENO. NINGUNO IGUAL")
    }else{
        println("TRIANGULO ISÓSCELES. DOS LADOS IGUALES")
    }
}