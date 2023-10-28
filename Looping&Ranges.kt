/*
fun main(){
    val n : Int = readLine()!!.toInt()
    for(i in 1..n){
        println(i)
    }
}
 */
/*
fun main(){
    val numbers = listOf(1, 2, 3)
    for(i in numbers){
        print("$i ")
    }
}
 */
/*
fun main(){
    for(i in 1..4){
        print(if(i%4==0) "$i" else "$i ")
    }
}
 */
/*
fun main(){
    for(i in 1 until 5){
        print("$i ")
    }
}
 */
/*
fun main(){
    for(i in 5 downTo 1){
        print("$i ")
    }
}
 */
/*
fun main(){
    for(i in 1..5 step 2){
        print(if(i%4==0) "$i" else "$i ")
    }
}
 */
/*
fun main(){
    val names = listOf("rahul", "ratul", "raki")
    /*
    for(name: String in names){
        print("$name ")
    }
     */
    for(i in 0 until names.size){
        //val name : String = names[i]
        print(if((i+1)%(names.size)==0) "${names[i]}" else "${names[i]} ")
    }
}
 */
/*
fun main(){
    val range1 = 1..3
    val range2 = 1 until 3
    println(range1)
    println(range2)
    for(i in range2){
        print("Hi ")
    }
}
 */
/*
fun showRanges(r : IntProgression){
    for(i in r){
        print("$i ")
    }
    println()
}
fun main(){
    showRanges(1..3 step 3)
    showRanges(1 until 5 step 2)
    showRanges(1 downTo -5 step 2)
}
 */
/*
fun multiplicatioTable(number : Int ): Unit{
    for(i in 1..10){
        println("$i x $number = ${number * i} ")
    }
}
fun main(){
    print("Enter a number do you want multiplication table:")
    val n : Int = readLine()!!.toInt()
    multiplicatioTable(n)
}
 */
/*
fun main(){
    for(i in 'a' until 'z'){
        print("$i ")
    }
}
 */
/*
fun main(){
    val str : String = "abc"
    for(i in 0..str.lastIndex){
        print("${str[i] + 1} ")
    }
}
 */
/*
fun main(){
    for(i in "sbivm"){
        print(i-1)
    }
}
 */
/*
fun check(s: String, ch: Char): Boolean{
    for(c in s){
        if(c==ch) return true
    }
    return false
}
fun main(){
    println(if(check("rahul", 'r')) "found" else "Not found")
}
 */
/*
fun main(){
    repeat(5){
        print("hi ")
    }
}
 */
/*
import java.util.Scanner
fun binarySearch(data : IntArray, target : Int):Int{
    var left  = 0
    var right = data.size - 1
    while(left <= right){
        var mid = left + (right-left)/2
        if(data[mid] == target){
            return mid
        }else if(data[mid] < target){
            left = mid + 1
        }else{
            right = mid - 1
        }
    }
    return -1
}
fun linearSearch(data : IntArray, target : Int):Int{
    for(i in 0 until data.size){
        if(data[i] == target){
            return i
        }
    }
    return -1
}
fun main(){
    val scan = Scanner(System.`in`)
    val n : Int = readLine()!!.toInt()
    val data = IntArray(n)
    for(i in 0 until n){
        data[i] = scan.nextInt()
    }
    val target = readLine()!!.toInt()
    println(binarySearch(data, target))
    println(linearSearch(data, target))
}
 */
/*
import java.util.Scanner
fun sort(data: IntArray){
    for(i in 0 until (data.size-1)){
        for(j in 0 until (data.size - i -1)){
            if(data[j] > data[j+1]){
                val temp = data[j]
                data[j] = data[j + 1]
                data[j + 1] = temp
            }
        }
    }
}
fun main(){
    val scan = Scanner(System.`in`)
    val size = readLine()!!.toInt()
    val data = IntArray(size)
    for(i in 0 until size){
        data[i] = scan.nextInt()
    }
    sort(data)
    for( x in data){
        print("$x ")
    }
}
 */
/*
fun main(){
    val x = 35
    println(x in 1..100)
}
 */
