fun main(){
    val integer: Int = 1
    val string : String = "My Name is Rahul Kumar Ghosh"
    val double : Double = 3.1415
    val float : Float = 3.1f
    val boolean : Boolean = true
    val tripleString : String = """
        |My Name is Rahul Kumar Ghosh. 
        |My brother name is Ratul Kumar Ghosh.
        |How I understand a programming concept.
    """.trimMargin()
    println(integer)
    println(string)
    println(double)
    println(float)
    println(boolean)
    println(tripleString)
    //kotlin auto detected the combine variable
    val n = 1 + 1.3
    println(n)
}