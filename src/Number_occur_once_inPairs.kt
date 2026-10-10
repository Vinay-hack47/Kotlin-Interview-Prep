fun findUniqueFromPair(arr : IntArray) : Int {
    var xor1 = 0

    for (i in arr){
        xor1 = xor1 xor i
    }

    return xor1
}


fun main(){
    val arr = intArrayOf(1,1,2,3,3,4,4,5,5)
    val result = findUniqueFromPair(arr)
    println(result)
}