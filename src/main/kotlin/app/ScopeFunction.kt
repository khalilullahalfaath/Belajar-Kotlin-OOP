package app

import data.Student

fun main() {
    val student = Student("Khalil",22)
    // let function pake it
    student.let{
        println(it.name)
        println(it.age)
    }

    // bisa juga seperti ini
    val result = student.let{
        "student with name ${it.name} with age ${it.age} year"
    }
    println(result)

    // run pake this
    val result2 = student.run{
        "student with name ${this.name} with age ${this.age} year"
    }
    println(result2)

    // apply
    val result3: Student = student.apply {
        // diignore
        "student with name ${this.name} with age ${this.age} year"
    }
    println(result3) // balikan objectnya

    // also
    val result4 : Student = student.also {
        "student with name ${it.name} with age ${it.age} year"
    }
    println(result4) // balikan objectnya

    // with
    val result5: String = with(student){
        "student with name ${this.name} with age ${this.age} year"
    }
    println(result5)

}