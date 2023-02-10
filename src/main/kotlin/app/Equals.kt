package app

import data.Company

fun main() {
    val Company1 = Company("Khalil")
    val Company2 = Company("Khalil")

    println(Company1.equals(Company2))
}