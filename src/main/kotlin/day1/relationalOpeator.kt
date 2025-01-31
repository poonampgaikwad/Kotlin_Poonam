package day1

fun main(){
    val a= 12
    val b =20
    println("a >b is ${a>b}")
    println("a<b is ${a<b}")
    println("a<=b is ${a<=b}")
    println("a>=bis${a>=b}")
    println("a==b is ${a==b}")
    println("a!=b is ${a!=b}")

    var x = 45
    println("Increment:" + ++x)
    println("Decrement:"+ --x)


    if(a>b){
        println("a is greater than b")


    }
    else if(a<b){
        println("a is less than b")
    }
    else{
        println("invalid number")
    }



}