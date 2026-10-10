fun main(){
    val arr = intArrayOf(3, 0, 1)

    val result = findMissing(arr)
    println(result)
}



// T: O(n)  S: O(1)
fun findMissing(arr : IntArray): Int{
    val n  = arr.size

    var result = 0

    for (i in 0..n){

        result = result xor i
    }

    for (i in arr){
        result = result xor i
    }

    return result
}
