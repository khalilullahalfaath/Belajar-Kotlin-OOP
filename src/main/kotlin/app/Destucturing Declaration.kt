package app

import data.Game
import data.Game_2
import data.Login
import data.MinMax

fun minmax(value1: Int, value2: Int):MinMax{
    return when{
        value1 > value2 -> MinMax(value2,value1)
        else -> MinMax(value1,value2)
    }
}

fun login(login:Login, callback: (Login) -> Boolean):Boolean{
    return callback(login)
}

fun main() {
    // bukan data class
    val game = Game("Game Kotlin",500_000)
    val (name, price) = game
    println("$name harganya $price")
    // data class
    val game_2 = Game_2("Game Kotlin 2", 60000)
    val (name_2, price_2) = game_2
    println("$name_2 harganya $price_2")

    // tanpa restructuring
    val result = minmax(10, 5)
    val min_1 = result.min
    val max_1 = result.max
    println("min: $min_1 max: $max_1")

    // dengan restructuring
    val (min,max) = minmax(10,5)
    println("min: $min max: $max")
    // ada yang diabaikan bisa pakai _
    val(minimum,_) = minmax(2,1)
    println("Minimum: $minimum")

    val login = Login("khalil",1234)
//    login(login){login ->
//        login.username == "khalil" && login.password == 1234
//    }
    login(login){(username,password) ->
        username == "khalil" && password == 1234
    }
}