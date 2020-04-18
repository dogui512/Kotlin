/*
    Ejercicio #17
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Estado civil
*/

fun main(args: Array<String>){
    var chrCivil: Char = 'A'

    print("DIGITE C, S, V, D: ")
    chrCivil = readLine()?.get(0) ?: throw IllegalArgumentException()
    
    when(chrCivil){
        'C' -> println("CASADO")
        'S' -> println("SOLTERO")
        'V' -> println("VIUDO")
        'D' -> println("DIVORCIADO")
        else -> println("NO EXISTE")
    }
}