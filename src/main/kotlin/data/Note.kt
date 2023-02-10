package data

class Note(title: String) {
    var title: String = title
        get() {
            println("Panggil getter")
            return field
        }
        set(value){
            println("Panggil setter")
            if (value.isNotBlank()){
                field = value
            }

        }

}