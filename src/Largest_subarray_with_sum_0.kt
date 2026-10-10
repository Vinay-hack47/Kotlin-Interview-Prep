// Largest subarray with 0 sum

fun lar_subArray(arr : IntArray) : MutableList<Int> {

    var result_arr = mutableListOf<Int>()

    var curr_sum = 0  // -2, 0, -8, -7, 0
    var curr_lenght = 0     // 1, 4

    var start_index = 0    // 1, 1
    var end_index = 0      // 2, 5

    for (i in 0 until arr.size){

        for (j in i until arr.size){

            curr_sum += arr[j]
            var length = j - i    // 1, 4
            if (curr_sum == 0 && length >curr_lenght ){
                curr_lenght = length
                start_index = i
                end_index = j
            }
        }

        curr_sum = 0
    }

    for (i in start_index..end_index){
        result_arr.add(arr[i])
    }

    return result_arr
}


fun main(){
    val arr = intArrayOf(15, -2, 2, -8, 1, 7)
    println(lar_subArray(arr))

}
//  0    1  2   3  4  5
// [15, -2, 2, -8, 1, 7]
//       i
//                    j








