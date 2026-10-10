fun findUnion(A: MutableList<Int>, B: MutableList<Int>): MutableList<Int> {

    val arr = mutableListOf<Int>() // Resultant union list

    var i = 0 // Pointer for list A
    var j = 0 // Pointer for list B

    val n1 = A.size
    val n2 = B.size

    // Dono lists ko ek saath traverse karna (Sorted order maintain karte hue)
    while (i < n1 && j < n2) {

        if (A[i] < B[j]) {
            // Agar list A ka element chota hai
            // Check: Kya result list khali hai? YA Aakhri element current element se alag hai?
            if (arr.size == 0 || arr[arr.size - 1] != A[i]) {
                arr.add(A[i])
            }
            i++ // Sirf A ka pointer aage badhao
        } else {
            // Agar list B ka element chota ya barabar (equal) hai
            if (arr.size == 0 || arr[arr.size - 1] != B[j]) {
                arr.add(B[j])
            }
            j++ // Sirf B ka pointer aage badhao
        }
    }

    // Agar list A mein abhi bhi elements bache hain (Extra elements of A)
    while (i < n1) {
        if (arr.size == 0 || arr[arr.size - 1] != A[i]) {
            arr.add(A[i])
        }
        i++
    }

    // Agar list B mein abhi bhi elements bache hain (Extra elements of B)
    while (j < n2) {
        if (arr.size == 0 || arr[arr.size - 1] != B[j]) {
            arr.add(B[j])
        }
        j++
    }

    return arr
}

fun main() {
    val A = mutableListOf<Int>(1, 1, 2, 3, 4, 5)
    val B = mutableListOf<Int>(2, 3, 4, 4, 5, 6)

    val result = findUnion(A, B)
    println(result) // Output: [1, 2, 3, 4, 5, 6]
}