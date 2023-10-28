/*
fun main(){
    val n : Int = readLine()!!.toInt()
    var count : Int = 0
    for(i in 0 until n){
        val str = readLine()
        if(str == "X++" || str =="++X"){
            count++
        }else{
            count--
        }
    }
    println(count)
}
 */
fun main() {
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i * j == 6) {
                println("Breaking out of both loops when i=$i and j=$j")
                break@outer // This breaks out of the loop labeled as 'outer'
            }
            println("i=$i, j=$j")
        }
    }
}