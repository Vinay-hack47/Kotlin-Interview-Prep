fun longestConsecutive(nums: IntArray): Int {

    if (nums.isEmpty()) return 0

    val set = nums.toHashSet()

    var maxSeq = 0

    for (num in nums) {

        if (set.contains(num - 1)) continue

        var currNum = num
        var currMax = 1

        while (set.contains(currNum + 1)) {
            currNum++
            currMax++
        }

        maxSeq = maxOf(maxSeq, currMax)
    }

    return maxSeq
}


fun main(){
    val arr = intArrayOf(0,3,7,2,5,8,4,6,0,1)
    val result = longestConsecutive(arr)
    println(result)
}