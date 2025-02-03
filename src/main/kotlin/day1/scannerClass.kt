package day1

import java.util.*


fun main() {
    println("Enter first number: ")
    val a = Scanner(System.`in`).nextInt()

    println("Enter second number")
    val b = Scanner(System.`in`).nextInt()
    val addition = add(a, b)
    println("Addition of $a and $b is $addition")


    println("Enter two numbers: ")
    val n1 = Scanner(System.`in`).nextInt()
    val n2 = Scanner(System.`in`).nextInt()
    val div = division(n1, n2)
    println("Division of $n1 and $n2 is $div")


}

fun add(a: Int, b: Int): Int {
    return a + b

}

fun division(x: Int, y: Int):Int {
    var num = x / y
    return x/y


}