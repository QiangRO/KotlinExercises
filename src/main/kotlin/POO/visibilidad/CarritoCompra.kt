package POO.visibilidad
/*Singleton: es un patron de disenio de software
* sirve para limitar cierta clase a solo tener
* una unica instancia en todo el proyecto
* se utiliza en un ambito global*/
object CarritoCompra {
    var productos = mutableListOf<Producto>()

    fun getNombresProductos(): List<String>{
        val nombres = productos.map {
            it.nombre
        }
        return nombres
    }
}