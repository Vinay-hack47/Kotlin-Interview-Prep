fun GroupAnagram(arr : Array<String>) : HashMap<String, MutableList<String>> {

    val dict = HashMap<String, MutableList<String>>()

    for (word in arr) {
        val key = word.toCharArray().sortedArray().joinToString("")

        // If key is not present then create an empty list and if exist then add in it.
        if (!dict.containsKey(key)){
                dict[key] = mutableListOf()
        }
        dict[key]?.add(word)
    }
    return dict
}

fun main(){
    val arr = arrayOf("rat" , "cat", "eat" , "ate", "tar")
    val result = GroupAnagram(arr)
    println(result)
}
