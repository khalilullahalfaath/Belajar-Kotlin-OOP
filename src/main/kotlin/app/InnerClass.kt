package app

import data.Boss

fun main() {
    val boss = Boss("Khalil")
    val employee = boss.Employee("Budi")
    employee.hi()
}