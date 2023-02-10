package app

import data.HandPhone
import data.Laptop

fun printObject(any: Any){
    // operator is
    when (any) {
        is Laptop -> {
            // setelah is maka otomatis berubah menjadi class Laptop
            println("laptop with name ${any.name}")
        }
        is HandPhone -> {
            println("HandPhone with name ${any.name}")
        }
        else -> {
            println(any)
        }
    }
}

fun printString(any: Any){
    val value = any as String
    println(value)
}

fun printStringWithAsNullable(any: Any){
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject("Khalil")
    printObject(2)
    printObject(Laptop("Asus"))
    printObject(HandPhone("Samsung"))

    printString("Khalil")
    // ERROR
    // printString(1)


    printStringWithAsNullable("Khalil")
    printStringWithAsNullable(1)

}