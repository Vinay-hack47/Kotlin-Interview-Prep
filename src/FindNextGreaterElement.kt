fun main() {

    val arr = intArrayOf(4, 5, 2, 10, 8)
    val result = nextGreaterElement(arr)
    println(result.joinToString())

}

fun nextGreaterElement(arr: IntArray): IntArray{

    var result = IntArray(arr.size)
    var stack = ArrayDeque<Int>()

    for (i in 0 until arr.size) {
        while (stack.isNotEmpty() && arr[i] > arr[stack.last()]) {

            val index = stack.removeLast()
            result[index] = arr[i]
        }

        stack.addLast(i)
    }

    while (stack.isNotEmpty()){
        val index = stack.removeLast()
        result[index] = -1
    }

    return result
}

// Time Complexity: O(N). Every element is pushed and popped from the stack at most once.
// Space Complexity: O(N). Storage is required for the result array and the stack.