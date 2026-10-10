fun valid(str : String) : Boolean {

    val dict = mutableMapOf<Char, Char>(')' to '(' , '}' to '{', ']' to '[')

    val stk = ArrayDeque<Char>()

    for (char in str){
        if (char in dict){
            val top = stk.removeLast()

            if (dict[char] != top ){
                return false
            }
        }else{
            stk.addLast(char)
        }
    }

    return stk.isEmpty()
}

fun main(){
    val str : String = "([{}])"
    val result : Boolean= valid(str)
    println(result)
}





// Taking input fron the user

//fun main(){
//    val n = readln().toInt()
//    val (a,b) = readln().split(" 5").map { it.toInt() }
//    println(b)
//    println(n)
//}