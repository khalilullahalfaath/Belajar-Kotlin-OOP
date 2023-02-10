package app

import data.Application
typealias App = Application
typealias App2 = data2.Application


typealias StringSupplier = ()->String

/*
SEBELUM
fun sayHello(supplier: ()-> String){
    println("Hello ${supplier()}")
}
 */

// SESUDAH
fun sayHello(supplier: StringSupplier){
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val app2 = App2("Kotlin App v2")

    sayHello { "Khalil" }
}