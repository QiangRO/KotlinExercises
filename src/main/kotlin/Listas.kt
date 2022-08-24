fun main(){
    val nombres = listOf("Jose","Juanito","Pedro")
    val numeros = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    numeros.add(11)
    numeros.add(0,0)
    numeros.removeAt(1) // elimina el elemento en la posicion 5
    numeros.remove(2) // elimina el elemento 1
    println(numeros)
    println("Programacion funcional")
    //Programacion funcional con las colecciones
    //total a pagar de la lista de precios
    val precios = mutableListOf(20.22,30.22,40.22,50.22,60.22,70.22,80.22,90.22,100.22,110.22)
    println("el total a pagar es: ${precios.sum()}")
    println("funcion average ${precios.average()}")
    println("funcion random ${precios.random()}")
    //invertir una lista
    val nombresInvertidos = nombres.reversed()
    println("invertir una lista $nombresInvertidos")
    //ordenar una lista
    val nombresOrdenados = nombres.sortedDescending().joinToString()
    println("ordenar una lista $nombresOrdenados")

    val numeros2 = listOf(2.5f,3.5f,4.5f,5.5f,6.5f,7.5f,8.5f,9.5f,10.5f,11.5f)
    val numeros3 = listOf(34,45,56,67,78,89,90,11,22,33)
    val numerosPares = numeros3.filter { it % 2 == 0 }

    println("numeros pares con filter $numerosPares")
    val edades = listOf(20,22,14,17,31,19,25,28,35,29)
    val mayoresEdad = edades.filter { it > 18 }
    println("mayores de edad con filter $mayoresEdad")
    val menoresEdad = edades.filter { edad -> edad < 18 }
    println("menores de edad con filter $menoresEdad")

    //Reduce -> reduce regresa un solo valor, producto de ir
    //aplicando una funcion a una lista de valores, de izquierda a derecha
    //reduceRight -> reduceRight regresa un solo valor, producto
    // de ir aplicando una funcion a una lista de valores de derecha a izquierda
    val sumaNumeros = numeros3.reduce { acumulado, elemento -> acumulado + elemento }
    println("suma de numeros con reduce $sumaNumeros")

    //Funcion map recorre tu coleccion y aplica una operacion
    //sobre cada elemento y devuelve una lista con los resultados
    val resultadoMap = precios.map { it * it }
    println("resultado map $resultadoMap")
    val subidaPrecios = precios.map {
        precios ->precios + (precios * 0.15)
    }
    println("subida de precios map $subidaPrecios")
}