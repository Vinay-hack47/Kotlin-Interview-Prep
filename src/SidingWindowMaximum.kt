import kotlin.math.max

fun main(){
    val arr = intArrayOf(1,3,-1,-3,5,3,6,7)
    val result = windowMax(arr)
    println(result.joinToString())
}

fun windowMax(arr : IntArray) : MutableList<Int>{
    val n = arr.size

    var result = mutableListOf<Int>()

    var i = 0

    while(i < n -2){

        var j = i + 2

        var max_num = arr[i]

        for(k in i..j){
            // max_num = max(max_num, arr[k])
            if(arr[k] > max_num){
                max_num = arr[k]
            }
        }

        result.add(max_num)
        i++
    }

    return result
}

