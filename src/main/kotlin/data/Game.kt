package data

class Game(val name: String, val price: Int) {
    operator fun component1(): String = name
    operator fun component2(): Int = price
}

data class Game_2(val name: String, val price: Int)

