package data

class Person{
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name:String){
        println("Hello $name, my name is $firstName")
    }

    // overloading
    // nama function sama, parameter berbeda
    fun sayHello(firstName:String, lastName: String){
        // shadowed
        println("Hello $firstName $lastName, my name is ${this.firstName}")
    }

    fun run(){
        println("I'm running")
    }

    fun getFullName():String{
        return "$firstName $middleName $lastName"
    }
}