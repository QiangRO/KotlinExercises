package PracticaAeropuerto

interface Pasajero {
    abstract var Cedula: String
    abstract var NombreCompleto:String
    abstract var Email: String
    abstract var Telefono: String
    abstract var FechaNacimiento: String

    open fun mostrarPasajero(): String{
        return """
            Cedula: $Cedula,
            NombreCompleto: $NombreCompleto,
            Email $Email,
            Telefono $Telefono,
            FechaNacimiento $FechaNacimiento
        """.trimIndent()
    }
}