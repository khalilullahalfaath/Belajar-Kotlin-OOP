package app

import data.City
import data.Country
import data.Location

fun main() {
    // error
    // val location = Location("Makassar")
    val city = City("Makassar")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}