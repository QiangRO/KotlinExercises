package POO.Interfaces
/* Implementar interfaz usando operador: */
class Vehiculo: Localizable, Security {
    // Localizable Interfaz
    override var latitud: Double = 0.0
    override var longitud: Double = 0.0
    override var redButton: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}
    private var velocity: Double = 0.0

    override fun calculatePositionGps(): String {
        latitud = (-20..-10).random().toDouble()
        longitud = (-80..-60).random().toDouble()
        return "{$latitud - $longitud}"
    }

    override fun showInformation(): String {
        return super.showInformation()
    }

    override fun enableMovement() {
        velocity = if(!redButton)(10..20).random().toDouble()
        else 0.0
        val aceleracion = 1.0
    }
}