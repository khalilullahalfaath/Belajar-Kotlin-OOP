package data

// primary constractor
class Car(paramBrand: String, paramName: String,paramYear: Int = 2020){

    // initializer block
    init{
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String):
        this(paramBrand,paramName,2020){
            //body constructor
            println("Secondary constructor 1")
        }

    // secondary constructor memanggil secondary constractor yang lain
    // lalu memanggil primary constructor
    constructor(paramBrand: String):this(paramBrand,""){
        println("Secondary constructor 2")
    }


    // secondary constractor
    // wajib memanggil secondary constractor

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear

}