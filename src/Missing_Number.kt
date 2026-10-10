// Better approach

//fun find_missing(arr : IntArray) : Int{
//
//    val n  = arr[arr.size - 1]
//
//    val total_sum = n * (n + 1 ) / 2
//
//    var arr_sum = 0
//    for (i in arr.indices){
//        arr_sum += arr[i]
//    }
//
//    return total_sum - arr_sum
//
//}



// Optimal approach

fun find_missing_optimal(arr : IntArray) : Int {

    // we will use the xor here

    val n  = arr[arr.size - 1]

    var xor1 = 0
    for (i in 1..n){
        xor1 = xor1 xor i
    }

    var xor2 = 0
    for (i in arr.indices){
        xor2 = xor2 xor arr[i]
    }

    return xor1 xor xor2
}

fun main(){
    val arr = intArrayOf(1,2,4,5)
    val result = find_missing_optimal(arr)
    println(result)
}