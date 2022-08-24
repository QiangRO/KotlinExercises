fun main (){
    //POdemos crear arrays con arrayOf
    val precios = arrayOf(60,30,50,30)
    val ejemplos = arrayOf(6,"Juan", true, false, 4)
    val numeros = intArrayOf(6,3,5,3,90,64,80, 90)
    val impuestos = arrayOf(12.5, 53.6, 563.5)
    //Funciones anonimas y de orden superior
    val numeros2 = IntArray(8){i: Int -> i.inc()}

    //El ciclo For tiene varias formas de ejecutarse
    //Sin embargo ahora tenemos un nuevo tipo de dato "Rango"
    val range = (1..10)
    val valorAleatorio = range.random()
    //1ra Forma
    println("Primera forma de FOR")
    for (i in 0..numeros.size - 1){
        println(numeros[i])
    }

    //2da Forma:
    //Si tu proceso es de mas de una linea de codigo se usa llaves
    // si no, se descartan...
    println("Segunda forma de FOR")
    for (i in 0 until numeros.size)
        println(numeros[i])

    //3ra forma
    //Especificamente para recorrer Arrays
    //numeros --> rango llamado indices : 0,1,2,3,4,5,6,7,8,9
    println("Tercera forma de FOR")
    for (i in numeros.indices){
        println(numeros[i])
    }

    //4ta Forma
    println("Cuarta forma de FOR")
    for (numero in numeros)
        println(numero)

    //Uso de WHILE
    var iterador = 0
    println("Usando el WHILE")
    while (iterador < numeros.size){
        println(numeros[iterador])
        iterador ++
    }
}