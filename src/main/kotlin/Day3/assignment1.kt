package Day3

/*
1. Write a short program that prints each number from 1 to 100 on a new line.
For each multiple of 3, print "Fizz" instead of the number.

For each multiple of 5, print "Buzz" instead of the number.

For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.*/

fun main(){
    for(i in 1..100){


        if( i%3==0 && i%5==0) {
            println("FizzBuzz $i")
        }
        else if(i%5==0){
            println("Buzz $i")
        }
        else if(i%3==0){
            println("Fizz $i")

        }
        }

    }


