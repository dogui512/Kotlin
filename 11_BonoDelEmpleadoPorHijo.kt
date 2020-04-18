/*
    Ejercicio #11
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Bono del empleado por hijo
*/

fun main(args: Array<String>){
    var fltSueldo: Float = 0.0f
    var fltArecibir: Float = 0.0f
    var intBono: Int = 0
    var intHijo: Byte = 0
    var strNomb: String = ""

    print("NOMBRE EMPLEADO: ")
    strNomb = readLine()!!.toString()

    print("SUELDO EMPLEADO: ")
    fltSueldo = readLine()!!.toFloat()

    print("NUMERO DE HIJOS: ")
    intHijo = readLine()!!.toByte()

    if(intHijo >= 3){
        intBono = intHijo * 10
    }else{
        intBono = intHijo * 20
    }

    fltArecibir = fltSueldo + intBono

    println("* $strNomb RECIBE: $fltArecibir")
}