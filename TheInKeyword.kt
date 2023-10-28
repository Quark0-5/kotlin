/*
fun main(){
    val x = 35
    println(x in 1..100)
}
 */
/*
fun main(){
    val x : Int = readLine()!!.toInt()
    val range = 1 until 10
    if (x in range){
        println("In the $range")
    }else{
        println("Not in the $range")
    }
    for(i in range){
        print("$i ")
    }

}
 */
/*
fun main(){
    val str : String = "rahul"
    println('r' in "rahul")
    println('x' in str)
}
 */
/*
fun isDigit(ch : Char) = ch in '0'..'9'
fun isChar(ch : Char) = ch !in 'A' .. 'Z'
fun main(){
    println(isDigit('0'))
    println(isChar('a'))
}
 */
/*
fun isFloatRanges(n : Double):Unit{
    val range = 1.0..10.0
    println("$n in $range? ${if(n in range) "In the Range" else "Not in the range"}");
}
fun main(){
    val x : Double = readLine()!!.toDouble()
    isFloatRanges(x)
}
 */
/*
fun main(){
    val x : String? = readLine()
    val string : String? = readLine()
    /*
    if(x != null && string != null && x in string){
        println("Found $x in $string")
    }else{
        println("Not found $x in $string")
    }
     */
    println(if(x != null && string != null && x in string) "Found $x in $string" else "Not found $x in $string")
}
 */
/*
fun main(){
    println(if("ab" in "ab".."az") "Found!" else "Not found!!")
}
 */
fun isRange(n : Int):Boolean{
    return (n in 1 .. 10)
}
fun isChar(ch : Char):Boolean{
    return ((ch in 'a'..'z') || (ch in 'A'..'Z'))
}
fun isdigit(x : Char):Boolean{
    return (x in '0'..'9')
}
fun subString(c : String, name : String):Boolean = c in name
fun main(){
    println(isdigit('0')) //+ isRange(1) + isChar('A') + subString("ra", "rahul"))

}