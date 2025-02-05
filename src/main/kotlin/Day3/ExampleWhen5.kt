package Day3

import java.util.*

fun main(){
     println("Enter the num")
     val number = Scanner(System.`in`).nextInt()

     when{
          isOdd(number)-> println("number is odd")
          isEven(number)-> println("number is even")

     }
}

     fun isOdd(num:Int)=num%2 !=0
     fun isEven(num:Int)=num%2 == 0


