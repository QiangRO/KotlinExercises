package POO.enums
/* Las enum clss pueden tener tanto atributos como metodos en
* su cuerpo igual que cualquier clase comun
* los atributos y metodos que quisieras poner en el cuerpo de
* la clase deben ir al final despues de la lista de categorias
* y excepcionalmente luego del ultimo valor de tu lista, colocal;
* para indicar que luego de ello habra mas contenido*/
enum class ConnectionResponses (
    val message: String
        ){
    SUCCES("La conexion ha sido exitosa!!!") {
        override var responseCode: Int = 200

        override fun showServerLog(): String {
            return """
                Lorem Ipsum is simply dummy text of the printing
                and typesetting industry. Lorem Ipsum has been the
                industry's standard dummy text ever since the 1500s
            """.trimIndent()
        }
        override fun getCountIntents(): Int =(1..5).random()
    },
    PERMISSION_DENIED("Tu usuario no tiene permisos para acceder a este recurso"){
    override var responseCode: Int = 200

    override fun showServerLog(): String {
        return """
                Lorem Ipsum is simply dummy text of the printing
                and typesetting industry. Lorem Ipsum has been the
                industry's standard dummy text ever since the 1500s
            """.trimIndent()
    }
    override fun getCountIntents(): Int =(1..5).random()
},
    INTERNAL_ERROR("El servidor tuvo un problema, intenta mas tarde"){
    override var responseCode: Int = 500

    override fun showServerLog(): String {
        return """
                Lorem Ipsum is simply dummy text of the printing
                and typesetting industry. Lorem Ipsum has been the
                industry's standard dummy text ever since the 1500s
            """.trimIndent()
    }
    override fun getCountIntents(): Int =(1..5).random()
};

    abstract var responseCode: Int
    val pingConnection: Int = 110

    abstract fun showServerLog (): String
    abstract fun getCountIntents(): Int
    fun showServerConnection(): String{
        return "https://www.heroku.com"
    }
}