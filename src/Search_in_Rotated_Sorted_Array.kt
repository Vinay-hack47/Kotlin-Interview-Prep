fun main(){
    var arr = intArrayOf(4,5,6,7,0,1,2)
    val target = 0
    val result = search(arr, target)
    println(result)
}

fun search(arr : IntArray, target : Int) : Int{

    var l = 0
    var r = arr.size - 1

    while (l <= r){
        val mid = l + (r-l)/2

        if (target == arr[mid]){
            return mid
        }

        // left part is sorted
        if (arr[l] < arr[mid]){

            if (target >= arr[l] && target < arr[mid]){
                r = mid - 1
            }else{
                l = mid + 1
            }

        }
        else{
            // means right part is sorted
            if (target > arr[mid] && target < arr[r]){
                l = mid + 1
            }else{
                r = mid-1
            }
        }
    }

    return  -1

}