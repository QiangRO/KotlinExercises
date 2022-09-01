package POO

class Docentes(
    nombre: String,
    apellido: String,
    experiencia: String,
    area: String,
    salario: Int,
    materias: List<String>
): Persona(nombre, apellido, experiencia, area, salario){
    var materias = listOf<String>()
    init {
        this.materias = materias
        this.bono = calcularBono()
        this.salario += this.bono
    }
    //Polimorfismo multiples formas de representar un metodo
    //super hace referencia al padre
    override fun mostrarInformacion(): String {
        //return super.mostrsrInformacion()
        return """
            El nombre completo es: $nombre $apellido
            Tiene $experiencia años de experiencia
            trabaja en el area de $area
            dicta las siguientes materias ${materias.joinToString()}
            y gana un salario de Bs. $salario
        """.trimIndent()
    }

    override fun calcularBono(): Int {
        return this.salario + (this.salario/2)
    }
}