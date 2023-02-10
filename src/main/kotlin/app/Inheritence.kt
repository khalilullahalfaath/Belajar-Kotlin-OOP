package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Khalil")
    manager.sayHello("Ahmad")

    val vicePresident = VicePresident("Udin")
    vicePresident.sayHello("Rehan")
}