package data

interface Base {
    fun sayHello(name:String)
}

class MyBase: Base{
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

// delegation manual
class MyBaseDelegate(val base: Base):Base{
    override fun sayHello(name: String) {
        base.sayHello("Khalil")
    }
}

// otomatis dari kotlin
class MyBaseDelegation(val base: Base):Base by base