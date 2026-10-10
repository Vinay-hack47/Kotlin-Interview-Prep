
//// helper function
//fun reverse(start : Int, end: Int, arr: IntArray){
//
//    var s = start
//    var e = end
//    while (s < e){
//        var temp = arr[e]
//        arr[e] = arr[s]
//        arr[s] = temp
//
//        s += 1
//        e -= 1
//    }
//
//}
//
//
//fun main(){
//    var arr = intArrayOf(1,2,3,4,5)
//
//    reverse(0, arr.size - 1, arr )
//    println(arr.joinToString(", "))
//}
//
//



// Left rotate by 1 place


//fun leftRotateByOne(arr: IntArray) {
//    if (arr.isEmpty()) return
//
//    val first = arr[0] // 1 ko nikaal liya
//    for (i in 1 until arr.size) {
//        arr[i - 1] = arr[i] // Sabko left shift kiya
//    }
//    arr[arr.size - 1] = first // 1 ko last mein daal diya
//}
//
//fun main(){
//    var arr = intArrayOf(1,2,3,4,5)
//
//    leftRotateByOne( arr )
//    println(arr.joinToString(","))
//}




fun leftRotateBy_K(arr : IntArray, k: Int) : MutableList<Int>{

    var k = k % arr.size


//    var arr1 = intArrayOf()
//    var arr2 = intArrayOf()


    var arr1 = mutableListOf<Int>()
    var arr2 = mutableListOf<Int>()
    for (i in 0 until k){
//        arr1 = arr1 + arr[i]
        arr1.add(arr[i])                        // if using the mutable list of
    }


    for (i in k until arr.size){
//        arr2 = arr2 + arr[i]
        arr2.add(arr[i])
    }

//    return arr2 + arr1
//    arr2.addAll(arr1)
    return (arr2 + arr1) as MutableList<Int>
}

fun main(){
    val arr = intArrayOf(1,2,3,4,5)
    val result = leftRotateBy_K(arr , 2)
    println(result.joinToString(","))
}


























