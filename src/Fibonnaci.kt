
// Fibonacci series with memoization :-   T: O(2^n),  S: O(n)


//fun fibbonaci(n: Int, memo: IntArray): Int{
//    // Base conditions
//    if( n <= 1){
//        return n
//    }
//
//    if(memo[n] != -1){
//        return memo[n]
//    }
//
//    memo[n] = fibbonaci(n-1, memo) + fibbonaci(n-2, memo)
//
//
//    return memo[n]
//}
//



//T: O(n)  , S: O(1)

//fun fibonacciTabulation(n: Int): Int {
//    if (n <= 1) return n
//
//    // 1. Create a table (array) to store answers bottom-up
//    val dp = IntArray(n + 1)
//
//    // 2. Base cases initialization
//    dp[0] = 0
//    dp[1] = 1
//
//    // 3. Fill the table iteratively using a loop
//    for (i in 2..n) {
//        dp[i] = dp[i - 1] + dp[i - 2]
//    }
//
//    return dp[6]
//}



//  T: O(n) ,  S:O(1)
fun fibonacciIterative(n: Int) : Int{

    if (n <= 1) return n

    var a = 0
    var b = 1

    for (i in 2..n){
        val c = a + b
        a = b
        b = c
    }

    return b

}

// i:       2   3   4   5   6
// a:   0   1   1   2   3   5
// b:   1   1   2   3   5   8






fun main(){
    val n = 10

    var memo = IntArray(n+1) {-1}

//    val result = fibbonaci(n, memo)
//    val result = fibonacciTabulation(n)
    val result = fibonacciIterative(n)
    println(result)
}
