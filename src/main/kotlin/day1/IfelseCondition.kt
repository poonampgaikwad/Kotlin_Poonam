package day1

import java.util.*

fun main() {


    println("Enter the time:")
    val time = Scanner(System.`in`).nextFloat()
    if (time >= 12.5 && time <= 13.5) {
        println("lunch time")

    } else if (time >= 19 && time <= 20) {
        println("dinner time")
    } else if (time >= 9 && time <= 22) {
        println("work time")
    } else {
        println("closed")
    }

}