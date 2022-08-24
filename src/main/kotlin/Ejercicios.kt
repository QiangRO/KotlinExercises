fun main (){
    operacion("abcdefghijkjmn")
}

fun operacion(mensaje: String) {
    val resultado = ""
    val asteriscos = "****"
    val multiplo: Int = 7
    if (mensaje.length % multiplo == 0) {
        for (letra in mensaje){
            print("*")
        }
    } else {
        print("$asteriscos$mensaje")
    }
}
