//Problem
//
//Given stock prices for consecutive days:
//
//[100, 80, 60, 70, 60, 75, 85]
//
//Find the span of each day's stock price.
//
//Span Definition
//
//Span = Number of consecutive days (including today) for which the stock price was less than or equal to today's price


//Why Interviewers Love This Question
//
//Because it's secretly:
//
//Previous Greater Element




fun main(){
    val arr = intArrayOf(100,80,60,75,85)
    val result = stockMarket(arr)
    println(result.joinToString())

}

fun stockMarket(arr: IntArray) : MutableList<Int> {
    val n = arr.size

    var result = mutableListOf<Int>()

    for(i in 0 until n){

        var span = 1

        var j = i - 1

        while(j >= 0 && arr[j] < arr[i]){
            span++
            j--
        }

        result.add(i, span)
    }

    return result
}