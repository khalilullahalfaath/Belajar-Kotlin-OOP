package app

import data.Person

fun main() {
    val khalil = Person()

    khalil.firstName = "Khalilullah"

    khalil.sayHello("Ahmad")
    khalil.sayHello("Ahmad","Nugraha")
}