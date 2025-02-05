package Day3

fun main(){

    var numbers = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    for(i in numbers){

        if(i%2!=0){
            println("odd number $i")
        }
        else if(i%2==0){
            println("even number  $i")
        }
    }

}