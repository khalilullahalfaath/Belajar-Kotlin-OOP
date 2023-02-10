package app

import data.Person

fun main() {
    val khalil = Person()
    // manipulasi atribut
    khalil.firstName = "Khalilullah"
    val ahmad = Person()
    ahmad.firstName = "Ahmad"
    val budi = Person()
    budi.firstName = "Budi"

    println(khalil)
    println(ahmad)
    println(budi)

}