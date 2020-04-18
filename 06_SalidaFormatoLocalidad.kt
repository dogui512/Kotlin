/*
    Ejercicio #06
    Referencia: https://codesitio.com/recursos-utiles-para-tu-web-o-blog/cursos/curso-de-java-como-presentar-numeros-con-formato/
    Formatos de salida
*/

import java.text.NumberFormat
import java.util.Locale

object Numberformato {
    @JvmStatic fun main(args:Array<String>) {
        //Localidad: Inglaterra
        val locale = Locale("en", "UK")
        val objNF = NumberFormat.getInstance(locale)
        val cadena = objNF.format(999999.99)
        println("INGLATERRA")
        println("----------")
        println(cadena)
        //Localidad: España
        val locale2 = Locale("es", "ES")
        val objNF2 = NumberFormat.getInstance(locale2)
        val cadena2 = objNF2.format(999999.99)
        println()
        println("ESPAÑA")
        println("----------")
        println(cadena2)
    }
}