class MyQueue {

    private val input = ArrayDeque<Int>()
    private val output = ArrayDeque<Int>()

    fun enqueue(value: Int) {
        input.addLast(value)
    }

    fun dequeue(): Int {

        shiftIfNeeded()

        if (output.isEmpty()) {
            throw NoSuchElementException("Queue is empty")
        }

        return output.removeLast()
    }

    fun peek(): Int {

        shiftIfNeeded()

        if (output.isEmpty()) {
            throw NoSuchElementException("Queue is empty")
        }

        return output.last()
    }

    fun isEmpty(): Boolean {
        return input.isEmpty() && output.isEmpty()
    }

    private fun shiftIfNeeded() {

        if (output.isNotEmpty()) return

        while (input.isNotEmpty()) {
            output.addLast(input.removeLast())
        }
    }
}