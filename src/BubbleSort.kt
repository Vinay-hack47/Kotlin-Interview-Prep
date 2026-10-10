// Arrange the elements in the ascending order by using Bubble Sort

fun BubbleSortAscending(arr: IntArray): IntArray {
    val n = arr.size

    // If no swap is done means that arr is sorted already further

    for (i in 0 until n - 1) {
        var swapDone = false                          // Mann ke chalte hai ki koi swap nahi hua

        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swapDone = true                        // Swap hua make it true
            }
        }

        if (!swapDone) break                            // If no swap then return

    }
    return arr
}

fun BubbleSortDecending(arr: IntArray): IntArray {
    val n = arr.size

    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] < arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }

    return arr
}

fun main() {
    val arr = intArrayOf(4, 1, 5, 2, 3)
    val result1 = BubbleSortAscending(arr)
    println(result1.joinToString(","))


//    val result2 = BubbleSortDecending(arr)
//    println(result2.joinToString(","))
}