package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee: Employee = Employee("Khalil")
    employee.sayHello("Ahmad")

    employee = Manager("Khalil")
    employee.sayHello("Dihyah")

    employee = VicePresident("Khalil")
    employee.sayHello("Indra")
}