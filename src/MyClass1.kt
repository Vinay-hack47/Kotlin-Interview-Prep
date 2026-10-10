class List{
    companion object{
        @JvmStatic
        fun main(arr : Array<String>){

            // List
            //--> Immutable list
            val aList = listOf("Vinay", 2, "Vishal",3, listOf("true", "false"))
            println(aList)

            //--> Mutable list
            val mList = mutableListOf("Krishna", "Radha", 4)
            mList.add("Radhe")
            mList.add(3,1)
            println(mList)


            // Set
            //--> Immutable Set
            val aSet = setOf("One", "Two", 2)
            println(aSet)

            //--> Mutable Set
            val mSet = mutableSetOf("One", 3)
            mSet.add(5)
            println(mSet)


            // Map
            //--> Immutable Map
            val aMap = mapOf(1 to "One", 2 to "Two", 3 to "Three", "four" to "Four", true to false)
            println(aMap)

            //--> Mutable Map
            val mMap = mutableMapOf("One" to "One", true to 1)
            mMap.put("Two" ,"Two")
            println(mMap)

            val mAMap = mapOf("One" to "One", true to 1)
            mMap.putAll(mAMap)
            println(mMap)


            //ArrayList
            val arrNames = ArrayList<String>()
            arrNames.add("A")
            arrNames.add("B")
            arrNames[0] = "O"

            println(arrNames)
        }
    }
}