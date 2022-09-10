package PracticaAeropuerto

interface Vuelo{
    abstract var CodigoVuelo:Int
    abstract var Origen:String
    abstract var Destino:String
    abstract var Duracion:String
    abstract var FechaVuelo:String
    abstract var Disponibilidad:String
    abstract var AsientosTotales :Int
    abstract var AsientosOcupados :Int
    abstract var TipoAeronave:String
    abstract var Aerolinea:String
    /*fun asientosDisponibles ():String{
        var asientosDisponibles: Int = 0
        AsientosOcupados
    }*/
    open fun mostrarInformacion(): String{
        return """
            Codigo vuelo: $CodigoVuelo,
            Tipo aeronave: $TipoAeronave,
            Aerolinea $Aerolinea,
            Origen: $Origen,
            Destino: $Destino,
            Duracion $Duracion,
            FechaVuelo: $FechaVuelo,
            Disponibilidad: $Disponibilidad,
            AsientosTotales $AsientosTotales,
            AsientosOcupados $AsientosOcupados
        """.trimIndent()
    }
}