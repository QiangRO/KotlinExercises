fun main(){
    //Variables Val y Var
    //Inferencia NO explicita de datos
    val numero1 = 10
    var numero2 = 20

    //Inferencia explicita de datos
    val numero3: Int = 10
    var numero4: Int = 20
    var resultado: Int = 0
    resultado = numero3 + numero4
    println("El resultado es: "+resultado)
    
    val nota1 = 41.5f
    val nota2 = 47.234634
    val esEstudiante = true
    val apellido = "Perez"
    val nombre = "Juanito"
    println("Los tipos de datos son: Float $nota1, Double $nota2, String $nombre $apellido y Boleano $esEstudiante")
    println("El resultado de la suma es: ${numero1 + numero2 + numero3}" )
}