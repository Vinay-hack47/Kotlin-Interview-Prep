fun MoveZeros(arr : IntArray): IntArray{
    // will use two pointer approach

    var i = 0
    for (j in 0 until arr.size){
        if (arr[j] != 0){
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp

            i += 1
        }
    }
    return arr
}

fun main(){
    val arr = intArrayOf(2,4,0,5,0,0,2,0)
    val result = MoveZeros(arr)
    println(result.joinToString(","))
}