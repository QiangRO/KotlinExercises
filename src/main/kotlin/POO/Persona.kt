package POO

open class Persona(
    open val nombre: String,
    open val apellido: String,
    open val experiencia: String,
    open val area: String,
    open var salario: Int) {
    //Atributos
    open var  bono: Int = 0
    open var sancion: Int = 0

    //Metodos
    open fun mostrarInformacion(): String {
        //Existe un formato para formar strings de varias lineas
        //respeta los saltos de linea que tenga y lñas separaciones que
        //generan usan """"""
        //.ttrimIndent() -> ajustar las instanciones, espacios y saltos de linea
        return """
            El nombre completo es: $nombre $apellido
            Tiene $experiencia años de experiencia
            trabaja en el area de $area
            y gana un salario de Bs. $salario
        """.trimIndent()

    }
    //Calculatr un bono
    open fun calcularBono(): Int = this.salario + 150
    //Calcular sanciones
    open fun calcularSanciones(): Int = this.sancion - 1000
}