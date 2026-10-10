fun max_consective_one(arr : IntArray) : Int {
    var global_counter = 0
    var temp_counter = 0

    for (i in arr){
        if (i == 1){
            temp_counter += 1
        } else{
            if (temp_counter > global_counter){
                global_counter = temp_counter
            }
            temp_counter = 0
        }
    }

    return global_counter
}



fun main(){
    val arr = intArrayOf(1,1,0,1,1,1,0,1,1)
    val result = max_consective_one(arr)
    println(result)
}