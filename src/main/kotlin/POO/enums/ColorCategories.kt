package POO.enums
/* Se puede apoyar cada valor con algun o algunos atributos
* que sirvan para reforzar el criterio
* enum class puede contener constructores no vacios -> Primarios*/
enum class ColorCategories (
    val hexCode: String
){
    WHITE("#FFFFF"),
    BLACK("#000000"),
    RED("FF0000"),
    GREEN("37DE54"),
    YELLOW("#FFFF00"),
    BLUE("#0D5BE1")
}