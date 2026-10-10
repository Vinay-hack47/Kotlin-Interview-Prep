//Input: "{[()]}"
//Output: true
//
//Input: "{[(])}"
//Output: false


//-> Use ArrayDeque in kotlin in place of Stack
//stack.addLast('a')   // push
//stack.removeLast()   // pop
//stack.last()         // peek
//stack.isEmpty()      // check empty

fun cheak(input: String) : Boolean{
    val dict = mapOf<Char , Char>('}' to '{' , ']' to '[' , ')' to '(' )
    val stack = ArrayDeque<Char>()

    if (input.length < 2) return false

    for(char in input){
        if(char in dict){
            if(stack.isEmpty()) return false

            val top = stack.removeLast()
            if(top != dict[char]){
                return false
            }
        }
        else{
            if (char== '(' || char =='{' || char == '['){
                stack.addLast(char)
            }
        }
    }
    return stack.isEmpty()
}

fun main(){
    val input = "{[(a)]}"
    println(cheak(input))
}

// Time complexity - O(n)
// Space complexity - O(n)