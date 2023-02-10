package app

import data.Rectangle

fun main() {
    val rectangle = Rectangle()
    println(rectangle.corner)
    println(rectangle.parentCorner)

    rectangle.printName()
}