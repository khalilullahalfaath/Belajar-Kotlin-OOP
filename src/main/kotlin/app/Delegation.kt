package app

import data.MyBase
import data.MyBaseDelegate
import data.MyBaseDelegation

fun main() {
    val base = MyBase()
    base.sayHello("Khalil")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Khalil")

    val basedelegeate2 = MyBaseDelegation(base)
    basedelegeate2.sayHello("Khalil")
}