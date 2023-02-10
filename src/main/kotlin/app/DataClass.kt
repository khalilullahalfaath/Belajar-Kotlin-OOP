package app

import data.Product

fun main() {
    val product = Product("Indomie", 2500, "Food")
    println(product)
    val product2 = product.copy()
    // true
    println(product.equals(product2))
    // true
    println(product.hashCode() == product2.hashCode())

    val product3 = product.copy(name = "Supermie")
    println(product3)
    // Product(name=Supermie, price=2500, category=Food)
    // false
    println(product3.equals(product2))
    // false
    println(product3.hashCode() == product2.hashCode())
}