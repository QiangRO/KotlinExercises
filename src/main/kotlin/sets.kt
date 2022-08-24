//Los sets son colecciones que solo permiten valores
//unicos y no permiten valores duplicados
fun main(){
    //Set inmutables
    val nombreSet = setOf("Alfredo", "Juan", "Pedro", "Alfredo")
    println(nombreSet)
    //Set mutables
    val numeroSet = mutableSetOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    println(numeroSet)

    val pares = numeroSet.filter{
        it % 2 == 0 }
    println(pares)

    val numerosPrimos = numeroSet.filter{
        var esPrimo = true
        for (i in 2..it/2){
            if (it % i == 0){
                esPrimo = false
                break
            }
        }
        esPrimo
    }
    println("Comprobando numeros primos")
    println("Los numeros primos dentro del set son: $numerosPrimos")


















}