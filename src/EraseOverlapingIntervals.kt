fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
    if (intervals.isEmpty()) return 0

    // 1. Sort by END TIME (The Greedy Manager Approach)
    intervals.sortBy { it[1] }

    var removals = 0
    var currentEndTime = intervals[0][1]

    // 2. Iterate starting from the second interval
    for (i in 1 until intervals.size) {
        val nextStart = intervals[i][0]
        val nextEnd = intervals[i][1]

        // 3. If the next meeting starts before the current one ends, it's a conflict!
        if (nextStart < currentEndTime) {
            removals++ // We drop this overlapping interval
        } else {
            // No conflict. Room is free. Update our current end time.
            currentEndTime = nextEnd
        }
    }

    return removals
}