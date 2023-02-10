package app

import exception.ValidationException

fun validateAndSayHello(name: String?){
    if(name?.isBlank()!!){
        throw ValidationException("name is blank")
    }
    println("Hello $name")
}

fun main() {
    try{
        validateAndSayHello("Khalil")
        validateAndSayHello(null)
    }catch (error: ValidationException){
        println("Error bro, isi namanya")
    }catch(error: Throwable){
        println("Ada error bro")
    }finally {
        println("Selesai")
    }
}