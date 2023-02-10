package app

import data.Television

fun main() {
    val tv = Television()
    // error
    // println(tv.brand)
    tv.initTelevision("Samsung")
    println(tv.brand)
}