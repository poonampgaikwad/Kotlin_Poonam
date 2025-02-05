package Day3

fun main(){

    val a:Any =10.0

    when(a){
        is Int -> println("integer")
        is Float -> println("float")
        is Double -> println("Double")
        is String -> println("String")



    }


}