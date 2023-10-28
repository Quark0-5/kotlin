/*
fun main(){
    /*
    println("""
        1.°C->°F
        2.K->°F
        3.°F->°C
        4.K->°C
        5.°C->K
        6.°F->K
        """.trimIndent())
     */
    print("Enter Expression: ")
    val firstTemperature = readLine()
    val convertedTemperature = firstTemperature?.split(" ")
    if(convertedTemperature != null ){
        val x = convertedTemperature[0].toDouble()
        fun cel(c: Double):Double{
            return ((c*(9.0/5.0)) + 32.0)
        }
        val output = when(convertedTemperature[1]){
            "°C->°F" -> cel(x)
            "K->°F" -> cel(x - 273.15)
            "°F->°C" -> ((x - 32.0)*5.0/9.0)
            "K->°C" -> (x - 273.15)
            "°C->K" -> (x + 273.15)
            "°F->K" -> (((x - 32.0) * (5.0/9.0))) + 273.15
            else -> "Invalid"
        }
        println(output)
    }else{
        println("Invalid")
    }
}
 */
 /*
fun main(){
    val name = readLine()
    val newName = name?.split(" ")
    if(newName != null ){
        for(i in 0 until newName.size){
            val x = newName[i].toDouble()
            println(x)
        }
    }else{
        println(" invalid")
    }
}
  */
