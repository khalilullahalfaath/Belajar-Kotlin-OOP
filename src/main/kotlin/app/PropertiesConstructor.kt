package app

import data.User

fun main() {
    val user1 = User("Khalil", "rahasia")
    val user2 = User("Joko","rahasia123")
    user1.username = "ahmad"
    user2.password="qwerty"

    println(user1.username+" "+ user1.password)
    println(user2.username+" "+ user2.password)


}
