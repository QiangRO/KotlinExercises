fun main(){
    //Kotlin SIEMPRE devuelve un objeto llamado unit
    mostrarMensaje("Grupo B")
    showmessage("Torre antigua")
    println("La suma es: ${calcularNumero(30,65)}")
    println("La resta es: ${restarNumero(100,60)}")
    println("----------------------------------------------------------------")
    println("----------Sobrecarga de Funciones----------")
    println("(Funcion 1)El precio total es: ${calcularPrecioFinal(90)}")
    println("(Funcion 2)El precio total es: ${calcularPrecioFinal(32.033)}")
    println("(Funcion 3)El precio total es: ${calcularPrecioFinal(100, 0.15)}")
    println("----------------------------------------------------------------")
    println("----------PROMOCIONES----------")
    procesarOferta("Chocolate")
    procesarOferta("Almendras")
    //Cuando solo queremos aprovechar la promocion que esta por defecto
    //Se puede definir parametros indicandon el nombre del parametro de manera explicita
    //Siempre que se haya definido el valor por defecto

    procesarOferta("CocaCola", "hasta verano")
    procesarOferta(duracion = "hasta fin de verano", promocion = "70% descuento", producto = "Pilfrut")
}

//FUNCINOES QUE NO RETORNAN VALOR
//Se debe indicar el tipo de dato de los parametros
//Para indicar el tipo de dato de retorno o que va a devolver la funcion
//luego de los parentesis defines los parametros

//Cuando la funcion no retorno nada, no es necesario escribir
//Unit porque ya se asume
fun mostrarMensaje(mensaje: String):Unit{
    val cadena = mensaje+", fin del mensaje"
    println(cadena)
}

fun showmessage (mensaje: String){
    println("$mensaje, fin del mensaje")
}

//FUNCIONES QUE RETORNAN VALOR
//Se tiene explicitar el tipo de dato que retorna la funcion
//Si el proceso de la funcione es sencilla, es decir, que es
// solo una linea de codigo se puede resumir de 2 formas:
//Forma 1
fun calcularNumero (numero1: Int, numero2: Int): Int{
    return numero1 + numero2
}

//Forma 2
fun restarNumero (numero1: Int, numero2: Int): Int = numero1 - numero2

//Sobrecarga de funciones
fun calcularPrecioFinal (precio: Int): Double{
    val total = precio +(precio * 0.15)
    return total
}

fun calcularPrecioFinal (precio: Double): Double = precio + (precio * 0.15)

fun calcularPrecioFinal (precio: Int, iva: Double): Double = precio + (precio * iva)

//Funcion para generar una promociond de productos
//Se puede definir parametros con valores por defecto en las funciones
//quiere decir que le asignas un valor que lo va a tomar cuando tu no
//esos parametros
fun procesarOferta (producto: String, promocion: String = "sin promocion", duracion: String = "hasta fin de otoño"){
    val resultado = "El producto $producto, tiene un $promocion, $duracion"
    println(resultado)
}
