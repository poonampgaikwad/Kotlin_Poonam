package Day3

import java.util.*

fun main(){
     println("Enter number")
     var number = Scanner(System.`in`).nextInt()

    when(number){
         in 1..4 -> println("first quarter")
        in 5..9 -> println("second quarter")
        in 10..12 -> println("third quarter")
        else-> println("invalid input")




    }




}