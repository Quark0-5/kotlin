/*
fun main(){
    /*
    val a = readln().toInt()
    val b = a shl 2
    println(b)
    val a1 = readln().toInt()
    val b1 = a1 shr 2
    println(b1)
     */
    val x = readln().toInt()
    val p = x ushr 2
    println(p)
}
 */
import java.util.Scanner
fun main(){
    val scan = Scanner(System.`in`)
    val input = readln().toInt()
    var sum = if(input and 1 == 1){
        (input + 1) shr 1
    }else{
        input shr 1
    }
    sum *= if(input and 1 == 1){
        input
    }else{
        input + 1
    }
    for(i in 1 until input){
        val x = scan.nextInt()
        sum -= x
    }
    println(sum)
}