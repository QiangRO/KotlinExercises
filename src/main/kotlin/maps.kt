import java.beans.IntrospectionException

fun main(){
    //mapas inmutables
    val productosMap = mapOf<String, Float>(
        "Gaseosa" to 4.99f,
        "Galleta" to 5.62f,
        "Paneton" to 78.23f,
        "Leche" to 23.34f
    )
    val estudiantesMap = mutableMapOf(
        Pair(1234, "Jose"),
        Pair(4123, "Juanes"),
        Pair(4213, "Laura")
    )

    estudiantesMap.forEach{
        val llave = it.key
        val valor = it.value
        println("La llave es $llave y su valor $valor")
    }
    val aprobados = estudiantesMap.filter {
        it.value.lowercase().contains("l")
    }
    println(aprobados)
}