package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE

    val allGenders:Array<Gender> = Gender.values()

    for (i in allGenders){
        println(i)
    }

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man) // MALE
    println(woman) //FEMALE
    println(womanFromString) //FEMALE

    man.showDescription() //Male
    woman.showDescription() // Female
}
