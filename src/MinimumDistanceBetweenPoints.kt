import kotlin.math.min
import kotlin.math.sqrt

fun minimumDistance(points: Array<IntArray>): Double {

    var minDistance = Double.MAX_VALUE

    for (i in points.indices) {

        for (j in i + 1 until points.size) {

            val x1 = points[i][0]
            val y1 = points[i][1]

            val x2 = points[j][0]
            val y2 = points[j][1]

            val dx = x2 - x1
            val dy = y2 - y1

            val distance =
                sqrt((dx * dx + dy * dy).toDouble())

            minDistance = min(minDistance, distance)
        }
    }

    return minDistance
}

fun main() {

    val points = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(4, 6),
        intArrayOf(3, 5),
        intArrayOf(10, 12)
    )

    println(minimumDistance(points))
}