data class ListNode(var value: Int , var next : ListNode? = null)

class LinkedList{
    var head : ListNode? =null

    fun insertAtEnd(value : Int){
        val newNode = ListNode(value)
        if (head?.next == null){
            head = newNode
            return
        }

        var current = head

        while (current?.next != null){
            current = current.next
        }
        current?.next = newNode
    }

    fun printLinkedList(){

        if (head?.next == null){
            print("${head?.value} -> ")
            print("Null")
            return
        }
        var current = head
        while (current?.next != null){
            print("${current.value} -> ")
            current = current.next
        }
        println("Null")
    }
}

fun main(){
    val obj = LinkedList()
    obj.insertAtEnd(5)
    obj.insertAtEnd(8)
    obj.insertAtEnd(7)
    obj.printLinkedList()
}