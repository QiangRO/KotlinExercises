//Colecciones
//1. Listas
//2. Sets
//3. Mapas
//Usan mucho funciones de orden superior y pueden
//ser mutables y no mutables
fun main(){
    //Lista mutable
    val nombres = mutableListOf("Mario", "Juan", "Alejandro")
    val valores = listOf(10, 20, 30, 40, 50)
    val numeros = listOf(4, 2, 1, 3, 6, 5, 7, 9, 8)
    recorrerLista(valores)
    print(quitarDuplicados(numeros))
}
fun recorrerLista(lista: List<Int>){
    //forecha recibe funciones como parametro
    //lista = [1,2,3]
    //forEach -- 0 --> it = 1 -- indice 1--> it = 2
    lista.forEach{
        println(it  )
    }
}
fun quitarDuplicados (numeros: List<Int>){
    val resultado = numeros.distinct().sorted().joinToString()
}