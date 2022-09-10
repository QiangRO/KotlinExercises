package PracticaAeropuerto

interface Asiento {
    abstract var NumeroAsiento: String
    abstract var Estado: String
    abstract var Precio: Double
    abstract var TipoAsiento: String

    open fun mostrarAsiento(): String{
        return """
            NumeroAsiento: $NumeroAsiento,
            Estado: $Estado,
            Precio $Precio,
            TipoAsiento $TipoAsiento
        """.trimIndent()
    }

}