import com.sun.jdi.Value

//Input: nums = [2, 7, 11, 15], target = 9
//Output: [0, 1]
//Explanation: nums[0] + nums[1] = 2 + 7 = 9


// T:O(n),  S:O(n)
//fun twoSum(nums : IntArray, target: Int) : IntArray{
//
//    val map = mutableMapOf<Int, Int>()
//    val result  : IntArray
//    for (i in 0 until nums.size){
//        var diff = target - nums[i]
//        if (map.containsKey(diff)){                                           // if (diff in map){
//            return intArrayOf(map[diff]!! , i)
//        }
//        else{
//            map[nums[i]] = i
//        }
//    }
//    return intArrayOf()
//}
//
//fun main(){
//    val nums = intArrayOf(2,7,11,15)
//    val target = 9
//    val result = twoSum(nums, target)
//    println(result.joinToString())
//}




// Optimized-   T: O(n),    S:(1)

//fun main(){
//    val arr = intArrayOf(2, 7, 11, 15)
//    val target = 9
//
//    val result = findTarget(arr, target)
//    println(result.joinToString(" "))
//}
//
//
//fun findTarget(arr:IntArray, target: Int) : IntArray{
//
//
//    var l = 0
//    var r = arr.size -1
//
//    while(l < r){
//        var sum = arr[l] + arr[r]
//
//        if(sum < target){
//            l++
//        }else if(sum > target){
//            r--
//        }else{
//            return intArrayOf(l+1, r+1)
//        }
//    }
//
//    return intArrayOf()
//
//}




// Write a function that takes integer "x" and returns the element of the Fibonacci sequence that is larger than "x"

//T: O(log x) , S: O(1)

fun main(){
    val x = readLine()!!.toInt()
//    val x = 50
    val n = 20
    println(fibonacci(n, x))
}



fun fibonacci(n : Int, x: Int): Int{

    if(n <= 1) return n

    var a = 0   //1 1 2 3 5
    var b = 1   //1 2 3 5 8

    for(i in 2..n){    //2 3 4
        val c = a + b   //1 2  3
        a = b
        b = c

        if(b > x){
            return b
        }
    }
    return -1
}

