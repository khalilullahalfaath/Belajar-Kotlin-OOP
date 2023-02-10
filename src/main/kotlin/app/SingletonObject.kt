package app

import data.Application
import data.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("Khalil"))

    /**
     * Semua singleton object kalau ada perubahan maka semua
     * yang akses akan berubah
     */
    Utilities.name = "Berubah"
    a()
    b()

    // object dalam class
    println(Application.Companion.toUpper("Khalil"))
    println(Application.toUpper("Khalil"))
}

fun a(){
    println(Utilities.name)
}

fun b(){
    println(Utilities.name)
}