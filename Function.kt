fun sub(a: Int, b:Int): Int = a - b
fun multiply(a: Int, b: Int):Int{
    println("This is multiply function")
    return sub(a, b);
}
fun add(a: Int, b: Int):Int{
    println("This is a add function")
    return multiply(a, b)
}
fun main(){
    val result = add(1, 2)
    println(result)
}