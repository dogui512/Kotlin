/*
    Ejercicio #15
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Crear un programa que pida al usuario su nombre, y le
      diga "Hola" si se llama "David", o bien le diga "No te
      conozco" si teclea otro nombre.
*/

fun main(args: Array<String>){
    var strNombre: String = ""

    print("INGRESE SU NOMBRE: ")
    strNombre = readLine()!!.toString()

    if(strNombre == "David"){
        println("¡Hola $strNombre!")
    }else{
        println("¡NO TE CONOZCO!")
    }
}