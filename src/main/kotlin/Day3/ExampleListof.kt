package Day3

fun main(){

    var n = listOf("n1","n2","n3",1,2,3,4,)
    for(x in n.indices)// will print how many indices in th list
    println(x)

    for(x in n)
        println(x)// print values from the list

    for((x,y) in n.withIndex())
        println("$x,$y")// print index and value from the list





}


