package data

open class Employee (val name:String){
    open fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name){
    // overriding function
    final override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }
}

class SuperManager(name: String):Manager(name){
    // Error
//    override fun sayHello(name: String) {
//        println("Hello $name, my name is Super Manager ${this.name}")
//    }
}


class VicePresident(name: String) : Employee(name){
    final override fun sayHello(name: String) {
        println("Hello $name, my name is Vice President ${this.name}")
    }
}