package Day3

fun main(){
     var names = arrayOf("Jan","Feb","March","April","May")

    for((index,value) in names.withIndex()) {
        println("$index,$value")
        if(index==2){
            println("My Birthday")
        }
        else if(value =="May"){
            println("friend's birthday")
        }
        println(names[0])

    }

}