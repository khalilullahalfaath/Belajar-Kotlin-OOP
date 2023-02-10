package app

import data.Person

fun main() {
    val khalil = Person()

    khalil.firstName = "Khalilullah"
    khalil.middleName = "Al"
    khalil.lastName = "Faath"

    khalil.sayHello("Ahmad")
    khalil.run()

    val fullName = khalil.getFullName()
    println(fullName)
}