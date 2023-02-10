package data

data class Fruit(val total: Int) {
    operator fun plus(fruit: Fruit):Fruit{
        return Fruit(this.total + fruit.total)
    }

    operator fun minus(fruit:Fruit):Fruit{
        return Fruit(this.total - fruit.total)
    }
}