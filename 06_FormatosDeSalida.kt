/*
    Ejercicio #06
    Tomado del libro: Ejercicios de Programación en Consola de C#.
    - Formatos de salida
    Referencia:
        https://javiergarciaescobedo.es/programacion-en-java/29-trucos/113-formato-de-numeros-monedas-y-porcentajes2
        https://javiergarciaescobedo.es/programacion-en-java/29-trucos/266-formato-de-fecha
*/
import java.text.DecimalFormat  // Formato de nro.
import java.text.DateFormat     // Formato de fecha
import java.util.*

fun main(args: Array<String>){
    var dblBase: Double = 0.0
    var dblAltura: Double = 0.0
    var dblResul: Double = 0.0
    var objFormtDecimal: DecimalFormat
    var objFormatoFecha: DateFormat
    val objCalendario: Calendar

    print("Digite la base: ")
    dblBase = readLine()!!.toDouble()

    print("Digite la altura: ")
    dblAltura = readLine()!!.toDouble()

    dblResul = (dblBase * dblAltura) / 2

    // Imprimir en pantalla
    println("AREA DE TRIANGULO: $dblResul")    

    objFormtDecimal = DecimalFormat("#,###.00")
    println("AREA DE TRIANGULO: " + objFormtDecimal.format(dblResul))

    objFormtDecimal = DecimalFormat("#,###.##")
    println("AREA DE TRIANGULO: " + objFormtDecimal.format(dblResul))

    objFormtDecimal = DecimalFormat("¤#.##")
    println("AREA DE TRIANGULO: " + objFormtDecimal.format(dblResul))

    objFormtDecimal = DecimalFormat("$#,###.00")
    println("AREA DE TRIANGULO: " + objFormtDecimal.format(dblResul))

    objFormtDecimal = DecimalFormat("0000.000")
    println("AREA DE TRIANGULO: " + objFormtDecimal.format(dblResul))


    //Imprimir fecha en pantalla
    objCalendario = Calendar.getInstance()

    //Fecha en formato SHORT: 6/10/15
    objFormatoFecha = DateFormat.getDateInstance(DateFormat.SHORT)
    println("FORMATO FECHA CORTA: " + objFormatoFecha.format(objCalendario.getTime()))

    //Fecha en formato MEDIUM: 06-oct-2015
    objFormatoFecha = DateFormat.getDateInstance(DateFormat.MEDIUM)
    println("FORMATO FECHA MEDIANA: " + objFormatoFecha.format(objCalendario.getTime()))

    //Fecha en formato LONG: 6 de octubre de 2015
    objFormatoFecha = DateFormat.getDateInstance(DateFormat.LONG)
    println("FORMATO EN FECHA LARGA: " + objFormatoFecha.format(objCalendario.getTime()))

    //Fecha en formato FULL: sábado 6 de octubre de 2015
    objFormatoFecha = DateFormat.getDateInstance(DateFormat.FULL)
    println("FORMATO EN FECHA COMPLETA: " + objFormatoFecha.format(objCalendario.getTime()))


    //Imprimir hora en pantalla
    //Hora en formato SHORT: 21:47
    objFormatoFecha = DateFormat.getTimeInstance(DateFormat.SHORT)
    println("FORMATO DE HORA CORTA: " + objFormatoFecha.format(objCalendario.getTime()))

    //Hora en formato MEDIUM: 21:47:32
    objFormatoFecha = DateFormat.getTimeInstance(DateFormat.MEDIUM)
    println("FORMATO DE HORA MEDIANA: " + objFormatoFecha.format(objCalendario.getTime()))
}
