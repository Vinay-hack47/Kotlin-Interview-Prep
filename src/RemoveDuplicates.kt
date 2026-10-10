// We have given an sorted array and we have to remove the duplicates without using any extra space and return the
// count of the unique elements.

fun removeDuplicates(arr : IntArray) : Int{
    var i = 0

    for (j in 0 until arr.size){
        if (arr[i] == arr[j]){
            continue
        }
        else{
            var temp = arr[i+1]
            arr[i+1] = arr[j]
            arr[j] = temp

            i += 1

        }
    }

    return i + 1
}

fun main(){
    val arr = intArrayOf(1,1,2,2,2,3,3)
    var result = removeDuplicates(arr)
    println(result)
}