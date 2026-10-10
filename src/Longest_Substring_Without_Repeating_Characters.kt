class Solution {

    fun lengthOfLongestSubstring(s: String): Int {

        var left = 0
        var maxLength = 0

        val set = mutableSetOf<Char>()

        for (right in s.indices) {

            while (s[right] in set) {

                set.remove(s[left])
                left++
            }

            val windowLength = (right - left) + 1

            maxLength = maxOf(maxLength, windowLength)

            set.add(s[right])
        }

        return maxLength
    }
}