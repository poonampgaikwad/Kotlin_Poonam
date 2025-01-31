package day1

    fun main(){
        sum1(12,23)
        var abc = sum1(20,30,52)// return a function to a called funtion
        println(abc/10)
        multiply(10,8)
        var xyz = multiply(45,2,1)
        println(xyz/9*9)

    }

    fun sum1(a:Int, b:Int)
    {
        var sumofnumber1 = a+b
        println("sum of  $a and $b is $sumofnumber1")

    }
     fun sum1(a:Int, b:Int,c:Int):Int
     {
     return a + b + c// return a function to a called function
     }

     fun multiply(x: Int, y:Int)
     {
         var multiplyofnum = x*y
     }
     fun multiply(x:Int, y:Int,z:Int):Int{
         return x*y*z

     }









