package data

abstract class Animal {
    abstract val name:String
    abstract fun run(): Unit
}

class Cat: Animal() {
    override val name: String = "Cat"

    override fun run() {
        println("Cat is running")
    }
}

class Dog: Animal(){
    override val name: String = "Dog"

    override fun run() {
       println("dog is running")
    }

}