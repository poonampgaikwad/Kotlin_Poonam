package Day3

import java.util.*

fun main(){
    println("Enter day of the week")

    var day = Scanner(System.`in`).nextLine()

    when(day){
        "Monday","Tuesday","Wednesday","Thursday","Friday" -> println("Weekdays")
        "Saturday","Sunday" -> println("weekends")
        else-> println("invalid days")


    }






}