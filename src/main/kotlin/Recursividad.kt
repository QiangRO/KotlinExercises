fun main(){
    val precios = floatArrayOf(10.5f, 56.76f, 2.46f, 125.3f,45.7f)
    println("El total a pagar es ${calcularPrecios(precios)}")
    println("El total a pagar es ${calcularPreciosRevursivo(precios, precios.size-1)}")
}

fun calcularPrecios (precios: FloatArray): Float{
    var total = 0.0f // total cambia
    for (precio in precios){ // precio cambia
        total += precio
    }
    return total
}
//Recursivamente
//Elimina las variables mutables, trabaja bajo dos conceptops
//-Buscar un caso base que rompe la recursividad
//-Buscar el caso recursivo; donde la funcion se llama asi misma

fun calcularPreciosRevursivo (precios: FloatArray, maxIndex: Int):
        Float{
    //Caso base: que rompe lo recursivo
    if (maxIndex == 0) return precios[0]
    //Identificar el caso recursivo
    return precios[maxIndex] + calcularPreciosRevursivo(precios, maxIndex - 1)
}

