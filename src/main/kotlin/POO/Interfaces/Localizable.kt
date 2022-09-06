package POO.Interfaces
/* Conjunto de metodos
* Son aplicables a nivel de cualquier clase
* es como una especie de multiherencia
* Representan las reglas del juego --> Contratos
* Todos los metodos de las interfaces son
* obligatorias de aplicar
* 1) Las interfaces permiten atributos que pueden ser abstractos
* 2) Permiten desarrollar la logica de la funcion dentro de su
    estructura
* En lo posible hay que tratar de aplicar conceptos abstractos a la hora
* de definir comportamientos solo cuando este no varie
*
* HERENCIA: Misma naturaleza direcata de padre e hijo
* INTERFAZ: Comportamientos es lo que mas andas ajustando y cambiando en tu proyecto
* son parecidos o bajo el mismo criterio implementable en cualquiera clase del Software*/

interface Localizable {
    abstract var latitud: Double
    abstract var longitud: Double

    //Comportamientos
    abstract fun calculatePositionGps(): String

    open fun showInformation(): String {
        return """
            Tu latitud es: $latitud
            Tu longitud es: $longitud
            Estas en Bolivia
        """.trimIndent()
    }
}