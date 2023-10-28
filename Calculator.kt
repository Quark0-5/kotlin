//simple calculator
/*
fun main(){
    val firstNumber = readln().toDouble()
    val sign = readln()
    val secondNumber = readln().toDouble()
    val output = when(sign){
        "+" -> firstNumber + secondNumber
        "-" -> firstNumber - secondNumber
        "*" -> firstNumber * secondNumber
        "/" -> if(secondNumber != 0.0) firstNumber / secondNumber else "second number is 0"
        else -> "Non valid expression"
    }
    println(if(output is String) "$output" else "$firstNumber $sign $secondNumber = $output")
}
 */
//single line of expression split " "
/*
fun main(){
    val readString = readLine();
    val input = readString?.split(" ")
    if(input != null && input.size == 3){
        val firstNumber = input[0].toDouble()
        val sign = input[1]
        val secondNumber = input[2].toDouble()
        val output = when(sign){
            "+" -> firstNumber + secondNumber
            "-" -> firstNumber - secondNumber
            "*" -> firstNumber * secondNumber
            "/" -> if(secondNumber != 0.0) firstNumber / secondNumber else "second number is 0"
            else -> "Non valid expression"
        }
        println(if(output is String) "$output" else "$firstNumber $sign $secondNumber = $output")
    }else println("This Input is Invalid and the Input is $input")

}
 */