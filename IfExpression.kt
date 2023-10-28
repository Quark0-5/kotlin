/*
fun main(){
    if(1 > 2){
        println("Hello World")
    }else{
        println("Hi")
    }
    val x : Boolean = 1 <= 2
    if(x){
        println("1 is greater than or equal to 2")
    }
}
 */
/*
import java.util.Scanner
fun check(a: Int): String =
    if(a >= 0)
        "$a is Greater than or equal to 0"
    else
        "$a is lesser than 0"


fun main(){
    val scan = Scanner(System.`in`)
    val integer = scan.nextInt()
    if(integer>0){
        println("$integer is positive number!")
    }else if( integer == 0){
        println("$integer = 0")
    }else{
        println("$integer is negative number!")
    }
    val m  = check(integer)
    println(m)
    println(if(1 < 2) "1 < 2" else "1 > 2")
}
 */
/*
import java.util.Scanner
fun main(){
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    val result : String = if(a==0) "$a is zero" else "$a is greater than zero or lesser than zero"
    println(result)
    val bl = scan.nextBoolean()
    val num = if(!bl) "$bl is " else "$bl is not"
    println(num)
}
 */
/*
fun boolExpression(bl : Boolean): String{
    if (!bl)
        return "false"
    return "true"
}
fun main(){
    val check = boolExpression(true)
    println(check)
}
 */
/*
fun main(){
    val integer = readLine()!!.toBoolean()
    fun oddOrEven():String =
        if(integer%2==0)
            "even"
        else
            "odd"
    println(oddOrEven())
}
 */
fun main() {
    val a: Double = readLine()!!.toDouble()
    val s = readLine()
    val b: Double = readLine()!!.toDouble()
    val result = when (s){
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if(b != 0.0) a / b else "Anthing can't divided by zero"
        else -> "Non valid function"
    }
    println(result)
}