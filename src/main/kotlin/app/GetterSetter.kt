package app

import data.Note

fun main() {
    val note = Note("Belajar Kotlin OOP")
    // getter
    println(note.title)
    //setter
    note.title = "Haloo"
    println(note.title)
}