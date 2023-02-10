package app

import data.Address

fun main() {
    val address1 = Address("Jalan A","jakarta")
    val address2 = Address("Jalan B","jakarta", "Indonesia")
    println(address1.street)
    println(address2.street)
}