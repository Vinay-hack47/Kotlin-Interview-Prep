// Using the iteration method : T(N)
//fun findExtraChar(s: String, t: String){
//
//    for (char in t){
//        if (char !in s){
//            println("The extra char is: "+ char)
//        }
//    }
//}

fun findExtraChar(s: String, t: String){

    var result1 = 0

    for (char in s){
        result1 = result1 xor char.toInt()
    }

    for (char in t){
        result1 = result1 xor char.toInt()
    }

    println(result1.toChar())
}

fun main(){
    val s = "abcd"
    val t = "abcde"
    findExtraChar(s,t)
}