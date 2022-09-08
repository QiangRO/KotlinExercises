package POO.visibilidad

class Pokemon {
    /*private: solamente es accesible por los miembros
    * de la propia clase*/
    private var powerUp: Int = 0
    /*Protected es un nivel de acceso donde solo
    * los miembros y sus descendiente pueden utilizar
    * estos recursos */
    protected var damage: Int = 0
    /*Public: es el mas flexible y permite el acceso
    * desde cualquier parte del software*/
    var health: Int = 100
    /*Internal es otro tipo de acceso a nivel de modulos
    * significa acceso de terceros u otras librerias
    * Modulo = introduccion(nombreProyecto)*/
    internal fun generalAttack(): Int = (20..50).random()
    /*Te permite inicializar mas tarde, a riesgo del
    * propio programador*/
    //private lateinit var evolution: Int

}
private class Bonus{
    val life = 100
}