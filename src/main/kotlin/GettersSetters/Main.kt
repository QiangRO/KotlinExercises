package GettersSetters

fun main(){
    //val usuario = Usuario("abc@gmail.com", "123456")
    val usuario = Usuarios()
    usuario.email = "ABCDEFG@gmail.com" // Setter --> parametro value = "abc@gmail.com"
    usuario.password = "abE4#678"

    println("El nombre del usuario es: ${usuario.email}" +
            " \r\n y el password: ${usuario.password}")          // Getter
}