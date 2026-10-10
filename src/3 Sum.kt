import kotlin.collections.List

fun main(){
    val arr = intArrayOf(-1, 0, 1, 2, -1, -4)
    val res = find3Sum(arr)
    println(res)
}

fun find3Sum(arr : IntArray) : MutableList<List<Int>>{

    var n = arr.size
    arr.sort()
    var result = mutableListOf<List<Int>>()

    for (i in 0 until n){
        if (i > 0 && arr[i] == arr[i-1]) continue

        if (arr[i] > 0) break

        var lo = i + 1
        var hi = n - 1
        while (lo < hi){
            val sum = arr[i] + arr[lo] + arr[hi]

            if (sum == 0){
                result.add(listOf(arr[i], arr[lo], arr[hi]))
                lo++
                hi--

                // we will skip the duplicates
                while (lo < hi && arr[lo] == arr[lo-1]) lo++
                while (lo < hi && arr[hi] == arr[hi+1]) hi--
            }
            else if (sum < 0){
                lo++
            }else{
                hi--
            }
        }
    }

    return result
}