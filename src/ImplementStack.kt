class MinStack {

    private val stack = ArrayDeque<Int>()
    private val minStack = ArrayDeque<Int>()

    fun push(value: Int) {

        stack.addLast(value)

        if (minStack.isEmpty()) {
            minStack.addLast(value)
        } else {
            minStack.addLast(
                minOf(value, minStack.last())
            )
        }
    }

    fun pop() {
        if (stack.isEmpty()) return

        stack.removeLast()
        minStack.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}

fun main(){
    val obj = MinStack()

    obj.push(5)
    obj.push(8)
    obj.push(2)
    obj.push(1)

    println(obj.getMin())
    obj.pop()
    println(obj.getMin())
}