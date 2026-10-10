// Left the array left by one position.

fun rotate(array: IntArray) : IntArray{

    for (i in 1 until array.size){
        var temp = array[i-1]
        array[i-1] = array[i]
        array[i] = temp
    }

    return array
}

fun main(){
    val array = intArrayOf(1,2,3,4,5)
    val result =  rotate(array)
    println(result.joinToString())
}