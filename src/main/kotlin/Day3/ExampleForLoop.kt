package Day3

fun main(){

    for(i in 1..10 step 2){
        println(i)
        if(i%2==0){
            println("$i is even")
        }

        else{
            println("$i is odd")
        }
    }

    for (i in 15 downTo 1 ){
        if(i>5){
            println("small number $i")
        }
        else{
            println("big number $i")
        }
    }

}