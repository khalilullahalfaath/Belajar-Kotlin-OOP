package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Khalil")

    println(premiumCustomer.type)
    println(premiumCustomer.name)
    println(premiumCustomer.balance)

    val executiveCustomer = ExecutiveCustomer("Khalil", 100000)
    println(executiveCustomer.type)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}