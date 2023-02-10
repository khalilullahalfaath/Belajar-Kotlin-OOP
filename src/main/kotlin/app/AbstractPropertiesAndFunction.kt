package app

import data.Cat
import data.Dog

fun main() {
    val cat = Cat()
    val dog = Dog()
    println(cat.name)
    cat.run()
    println(dog.name)
    dog.run()
}