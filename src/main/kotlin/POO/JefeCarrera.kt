package POO

//1) heredar de la clase persona
//2) deben pillar 2 atributos q tienen en particular solamente unjefe de carrera
//3) sobre escriban los metodos del pabre - mostrarInformacion ()
//4) para el jefe de carrera el bono se calcula :
//    sacando el 15% del salario total ganando y adicionando a ese 15%
//    un numero aleatrorio entre 1000 y 5000Bs
//5) buscar una manera de calcular el salario
//6)la sancion y el bono deben afectar directamente al salario ganado
class JefeCarrera(
    nombre: String,
    apellido: String,
    experiencia: Int,
    area: String,
    salario: Int,
): persona(nombre,apellido,experiencia,area,salario ) {
    //Atributos
    var carreara:String =""
    init {
        this.bono=calcularBono()
        this.salario= this.bono
    }



    //Metodos
    override fun mostrarInformacion(): String {
        return super.mostrarInformacion()
        println("Es jefe de la carrera de $carreara")

    }

    override fun calcularBono(): Int {
        return this.salario + (this.salario*15/100)+ rand()
    }

    fun rand(start: Int= 1000, end: Int=5000): Int {
        require(!(start > end || end - start + 1 > Int.MAX_VALUE)) { "Illegal Argument" }
        return Random(System.nanoTime()).nextInt(end - start + 1) + start
    }
}