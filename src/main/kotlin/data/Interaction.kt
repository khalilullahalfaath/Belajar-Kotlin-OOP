package data

interface Interaction {
    // tidak boleh untuk menginisialisasi atribut
    val name: String
    // boleh menginisalisasi function
    fun sayHello(name: String): Unit
    fun sayGoodBye(name: String){
        println("Good bye $name from ${this.name}")
    }
}

interface Go:Interaction{
    fun go():Unit{
        println("GO!")
    }
}

interface Run: Go{
    fun run():Unit{
        println("RUN!")
    }
}

interface moveA{
    fun move() = println("Move A")
}

interface moveB{
    fun move() = println("Move B")
}

class Human(override val name: String):Run, moveA,moveB{
    override fun sayHello(name: String) {
        println("Hello $name this is ${this.name}")
    }
    override fun move(){
        super<moveA>.move()
        super<moveB>.move()
        println("Move human")
    }
}