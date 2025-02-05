package Day3

import java.util.*

fun main(){
    println("Enter the age :")
    var age = Scanner(System.`in`).nextInt()

    when(age){
        1 -> println("baby")
        2 -> println("Toddler")
        3 -> println("3T")
        15 -> println("Teenage")
        20 -> println("adult")
        60 -> println("senior citizen")
        else -> println("invalid input")





    }


}