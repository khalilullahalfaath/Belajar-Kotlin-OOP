package app

import data.Minus
import data.Operation
import data.Plus

fun operation(value: Int, value2: Int, operation:Operation): Int{
    return when(operation){
        is Plus-> value + value2
        is Minus -> value - value2
    }
}

fun main() {
    println(operation(10,10, Plus()))
    println(operation(10,10, Minus()))

}