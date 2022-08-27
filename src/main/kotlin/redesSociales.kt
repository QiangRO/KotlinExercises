import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main(){
    var formato = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val fechaActual = LocalDate.parse("12-12-2022", formato)
    println(fechaActual)
    val publicacion = Post("Gatitos", "Juan Perez", "Lorem ipsun Lorem ipsun Lorem ipsun Lorem ipsun ", "$fechaActual",5)
    println(publicacion)
}

class Post( val tituloPost: String,
            val autorPost: String,
            val contenido: String,
            val fechaPublicacion: String,
            val cantidadLikes: Int)
{
    //numero randomico de likes
    fun cantidadLikes(): Int{
        return (0..5).random()
    }
}
