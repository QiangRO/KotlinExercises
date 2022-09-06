package POO.herencia

open class Usuarios (){
    //GETTERS y SETTER MANUALES
    /*  es mejor trabajarlos cuando
    no se debe usar atributos en el constructor principal
    Aplicarlo cuando se requiere una logica adicional al momento
    de asignar o recibir valores.
    Get y Set utilizan dentro de sus procesos una especie de
    contenedor
    */
    /* ******LOGICA DE NEGOCIO*******
    EMAIL
    1) Email tiene un @ en su estructura
    2) El usuario introduce mayusculas debe volverse minuscula
    PASSWORD
    1) longitud de 8 caracteres
    2) un caracter numerico
    3) una mayuscula y minuscula
    4) un caracter especial*/
    //Atributos
    //TODO Contrasena empiece con una letra minuscula
    var esValido = true
    var mensajeError = ""
    var email: String = ""
        set(value) {
            field = if (value.contains("@")) value.lowercase() else{
                esValido = false
                mensajeError = "Tu email no cuenta con los requerimientos minimos"
                ""
            }
        }
    var password: String = ""
        set(value) {
            field = if(value.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@\$%^&*-]).{8}\$".toRegex())) value else {
                esValido = false
                mensajeError = "Tu conseña no cumple con las especificaciones minimas"
                ""
            }
        }
        get() {
            return "*".repeat(field.length)
        }
}