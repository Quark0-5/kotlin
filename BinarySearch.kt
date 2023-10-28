import java.util.Scanner
class search(){
    fun binarySearch(data : IntArray, target :Int):Int{
        var left : Int = 0
        var right : Int = data.size
        while(left <= right){
            val mid = if((left and 1 == 1) and (right and 1 == 1)){
                ((left shr 1) + (right shr 1) + 1)
            }else{
                ((left shr 1) + (right shr 1))
            }
            if(data[mid] == target){
                return mid
            }else if(data[mid] < mid ){
                left = mid + 1
            }else{
                right = mid - 1
            }
        }
        return -1
    }
    fun linearSearch(data : IntArray, target: Int):Int{
        for(i in 0 until data.size){
            if(data[i] == target){
                return i
            }
        }
        return -1
    }
}
fun main(){
    val scan = Scanner(System.`in`)
    val n : Int = scan.nextInt()
    val data = IntArray(n)
    for(i in 0 until n ){
        data[i] = scan.nextInt()
    }
    val obj = search()
    val target : Int = scan.nextInt()
    println(if (obj.binarySearch(data, target) == -1){
        "Found"
    }else{
        "Not Found"
    })
}