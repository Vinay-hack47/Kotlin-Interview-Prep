// Pair and Triple in Kotlin

class MyClass2 {
    companion object{

        @JvmStatic
        fun main(args : Array<String>){

            //Pair
            var (a,b) = Pair(3,5)
            println("$a $b")

            val pair1 = Pair("Vinay", 4)
            println(pair1.first)

            val pair2 = Pair("Vishal" , Pair("Himanshu", Pair(3,6)))
            println(pair2.second.second.first)     //3


            //Triple
            var (x,y,z) = Triple(1,2,3)

            var number = Triple(1,2,3)

            var triple1 = Triple(1,2, Triple("A", Triple("Vinay", "Vishal", "Himanshu"), "C"))
            println(triple1.third.second.third)
        }
    }
}