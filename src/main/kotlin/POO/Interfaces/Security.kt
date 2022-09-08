package POO.Interfaces

/*Las interfaces pueden simular una herencia multiple
* varios programadores usan este truco para tener este
* comportamiento que no es permitido en varios lenguajes*/
interface Security {
    abstract var redButton: Boolean
    abstract fun enableMovement()
}