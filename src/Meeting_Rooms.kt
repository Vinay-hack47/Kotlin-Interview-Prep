// intervals = [[0,30],[5,10],[15,20]]

fun main(){

    val intervals = arrayOf(
        intArrayOf(0,4),
        intArrayOf(5,10),
        intArrayOf(15,20)
    )

    println(check_routine(intervals))
}

fun check_routine(intervals : Array<IntArray>): Boolean{

    intervals.sortBy(){it[0]}

    for(i in 1 until intervals.size){
        var prev_end = intervals[i-1][1]
        var next_start = intervals[i][0]

        if(prev_end > next_start){
            return false
        }
    }

    return true
}