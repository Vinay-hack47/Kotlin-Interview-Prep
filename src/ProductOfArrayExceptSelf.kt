fun main(){
    val arr = intArrayOf(1,2,3,4)
//    [1,2,3,4]
    val result = product(arr)
    println(result.joinToString (" "))

}


fun product(arr : IntArray) : IntArray {

    var current_product = 1
    var result = IntArray(arr.size)

    for (i in 0 until arr.size){
        for (j in 0 until arr.size){
            if (i != j){
                current_product *= arr[j]
            }
        }

        result[i] = current_product
        current_product = 1
    }

    return result
}