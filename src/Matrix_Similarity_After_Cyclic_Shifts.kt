//fun Matrix(matrix : Array<IntArray>): Unit{
//
//
//
//}
//
//
//
//fun main(){
//    val matrix = arrayOf(
//        intArrayOf(1,2,3),
//        intArrayOf(4,5,6),
//        intArrayOf(7,8,9)
//    )
//
//    Matrix(matrix)
//
//    for (row in matrix){
//        for (col in row){
//            print("${col} ")
//        }
//        println()
//    }
//}
//



//fun Meeting(matrix : Array<IntArray>){
//
//
//        for (col in 1 until row.size){
//            val prev = row[col - 1]
//            val curr = row[col]
//
//            if (prev[1] > col[0]){
//                return false
//            }
//        }
//        return true
//    }
//}
//
//fun main(){
//    val matrix = arrayOf(
////        arrayOf(intArrayOf(5,10)),
////        arrayOf(intArrayOf(11,15)),
////        arrayOf(intArrayOf(16,20))
//
//        arrayOf(5,10),
//        arrayOf(11,15),
//        arrayOf(16,20)
//    )
//
//    Meeting(matrix)
//}



fun canAttendMeetings(matrix: Array<IntArray>): Boolean {
    // 1. Pehle matrix ko start time ke hisaab se sort karna chahiye (Best Practice)
    matrix.sortBy { it[0] }

    // 2. Loop 1 se start karein taaki previous meeting se compare kar sakein
    for (i in 1 until matrix.size) {
        val prevMeetingEnd = matrix[i - 1][1]
        val currentMeetingStart = matrix[i][0]

        // Agar pichli meeting current meeting se pehle khatam nahi hui
        if (prevMeetingEnd > currentMeetingStart) {
            return false // Overlap ho gaya!
        }
    }
    return true
}

fun main() {
    // Array of IntArray create karne ka sahi tarika:
    val matrix = arrayOf(
        intArrayOf(5, 10),
        intArrayOf(11, 15),
        intArrayOf(16, 20)
    )

    val result = canAttendMeetings(matrix)

    println(result)
}










