import kotlin.math.abs
import java.util.Scanner
fun main(){
    val scan = Scanner(System.`in`)
    val mat = Array(5) { IntArray(5) }
    for(i in 0 until 5){
        for(j in 0 until 5){
            mat[i][j] = scan.nextInt()
        }
    }
    label@ for(i in 0 until 5){
        for(j in 0 until 5){
            if(mat[i][j] == 1) {
                println("${abs(2 - i) + abs(2 - j)}")
                break@label
            }
        }
    }
}