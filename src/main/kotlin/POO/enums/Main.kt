package POO.enums

import java.time.LocalDate
import java.time.Month

fun main(){
    var enemyState = EnemyState.IDDLE
    val collider = 50
    enemyState = if(collider < 100) EnemyState.ATTACK else
        EnemyState.PATROL
    val fecha = LocalDate.of(
        2021,
        Month.AUGUST,
        16
    )
    val color = ColorCategories.GREEN.hexCode
    println(color)
    /* val conexion */
    val connectionCode = ConnectionResponses.PERMISSION_DENIED.responseCode
    val mmm = ConnectionResponses.INTERNAL_ERROR.message
    val peticiones = ConnectionResponses.PERMISSION_DENIED.getCountIntents()
}