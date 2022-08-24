fun main(){

    val numero = readln().toInt()
    val par: Int
    val numero1 = readln().toInt()
    val numero2 = readln().toInt()
    val menor: Int
    if (numero%2 == 0){
        println("El numero $numero es par")
    }else {
        println("El numero $numero es impar")
    }

    if (numero % 2 == 0){

    }
    menor = if (numero1<numero2)numero1 else numero2
    println("El menor de los numero es: $menor")

    val nota = 8
    when (nota){
        0, 1, 2, 3, 4, 5 -> println("Usted ha reprobado")
        6, 7, 8, 9, 10 -> println("Usted aprobo")
        else -> println("Usted es un genio")
    }
    val resultado: Int
    val operacion = "suma"
    resultado = when (operacion){
        "suma" -> 5+6
        "resta" -> 5-6
        "multiplicacion" -> 5*6
        "division" -> 5/6
        else -> 5%10
    }
}