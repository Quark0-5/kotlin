/*
fun main(){
    val number : Int = 1_000_000
    println(number)
    val a : Int = readLine()!!.toInt()
    val b : Int = readLine()!!.toInt()
    println("$a + $b = ${a + b}")
    println("$a * $b = ${a * b}")
    println("$a - $b = ${a - b}")
    //println("$a / $b = ${if(b!=0 ) a/b else "b==0 it's not valid"}")
    println("${if(b!=0) "$a / $b = ${a/b}" else "b==0"}")
}
 */
/*
fun main(){
    val a : Int = readLine()!!.toInt()
    println(a%2)
    println(5 + 5*1)
}
 */
/*
fun bmiMetric(
    height : Double,
    weight : Double
): String {
    val bmi : Double = (weight)/(height * height)
    return if(bmi < 18.5) "Under Weight"
        else if(bmi < 25) "Normal Weight"
        else "Over Weight"
}
fun main(){
    val height : Double = readLine()!!.toDouble()
    val weight : Double = readLine()!!.toDouble()
    println(bmiMetric(height, weight))
}
 */
/*
fun main(){
    val i : Int = Int.MAX_VALUE
    println(i)
    println(i+i)
}
 */
/*
fun main(){
    val i : Long = Long.MAX_VALUE
    println(i)
    val j = 0L
    val k : Long = 0
    println("$j $k")
}
 */
/*
fun main(){
    val i : Int = Int.MAX_VALUE
    println(0L + i + i)
    println(44546634353*1L)
    println(1_000_000 * 1_000_000L)
    println(Long.MAX_VALUE)
}
 */
/*
fun main(){
    val open : Int = readLine()!!.toInt()
    val closed : Int = readLine()!!.toInt()
    val status : Boolean =
        if(open >= 9 && closed <= 20){
            true
        }else{
            false
        }
    println(if(status) "True" else "false")
}
 */
/*
fun main(){
    val a : Int = 2
    val booleanValue: Boolean = a.toBoolean()
    println(booleanValue)
}
 */
/*
fun main(){
    /*
    smart home controller
    variable temperature , presence of people, security status, and time of day
     */
    print("Enter the temperature: ")
    val temperature : Float = readLine()!!.toFloat()
    print("Enter the Presence of people: ")
    val presenceOfPeople : Boolean = readLine()!!.toBoolean()
    print("Security Status: ")
    val securityStatus : Boolean = readLine()!!.toBoolean()
    print("Time of a day yes/No : ")
    val timeOfDay : Boolean = readLine()!!.toBoolean()
    smartHomeStatus(temperature, presenceOfPeople, securityStatus, timeOfDay)
}
fun smartHomeStatus(
    temperature : Float,
    pesenceOfPeople : Boolean,
    securityStatus : Boolean,
    timeOfday : Boolean,
): Unit {
    val isSafe : Boolean = (temperature < 70 || temperature > 0) && securityStatus && timeOfday && pesenceOfPeople
    println(
        if(isSafe){
            if (temperature > 25 && temperature < 40) "House is safe in normal temperature" else "House Status = safe"
        }else{
            "House Status = unsafe"
        }
    )
}
 */