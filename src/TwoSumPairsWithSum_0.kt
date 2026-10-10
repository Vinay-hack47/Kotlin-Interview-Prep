fun main(){
    val arr = intArrayOf(-1,0,2,1,4)
    val result = findIndex(arr)
    print(result.joinToString())
}

fun findIndex(arr : IntArray): MutableList<Int>{
    val n = arr.size

    var l = 0
    var r = n-1

    arr.sort()

    var result = mutableListOf<Int>()

    while (l<r){

        val sum = arr[l] + arr[r]
        if (sum == 0){
            result.add(l)
            result.add(r)
            break
        }else if (sum < 0){
            l++
        }else{
            r--
        }
    }

    return result
}