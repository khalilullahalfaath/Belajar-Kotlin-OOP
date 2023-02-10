package app

import annotations.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties


fun validateRequest(request: Any){
    val clazz = request::class
    val properties = clazz.memberProperties

    // iterate satu persatu, lalu cek kalau ada annotation @notBlank
    for(property in properties){
        if(property.findAnnotation<NotBlank>() != null){
            val value = property.call(request)
            when(value){
                is String ->{
                    if(value == ""){
                        throw ValidationException("${property.name} is Blank")
                    }
                }
            }


        }
    }
}

fun main() {
    val request = CreateProductRequest("1","Indomie", 2000)
    validateRequest(request)
}

