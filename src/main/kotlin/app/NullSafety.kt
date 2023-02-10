package app

data class Friend(val name: String)

fun sayHello(friend:Friend?){
//    if (friend != null){
//        println("Hello ${friend.name}")
//    }
//    println("Hello ${friend?.name}") // output "Hello null"
    // elvis operator
//    val name = friend?.name ?: "Friend"
//    println("Hello $name")

    val name = friend!!.name
    println("hello $name")
}

fun main() {
    sayHello(Friend("Khalil"))
    sayHello(null)
}