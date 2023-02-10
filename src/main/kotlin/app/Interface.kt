package app

import data.Human

fun main() {
    val human = Human("Khalil")
    human.sayHello("Ahmad")
    human.sayGoodBye("Bambang")
    human.go()
    human.move()
}