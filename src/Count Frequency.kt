//fun main(){
//    val items = listOf("a", "b", "a", "c", "b", "a")
//    val frequencyMap = mutableMapOf<String , Int>()
//
//    for (item in items){
//        frequencyMap[item] = frequencyMap.getOrDefault(item , 0) + 1
//    }
//
//    println(frequencyMap)
//}





//-> Count the freq of characters
//fun main(){
//    val texts = "kotlin"
//    val map = mutableMapOf<Char , Int>()
//
//    for (text in texts){
//        map[text] = map.getOrDefault(text, 0) + 1
//    }
//    println(map)
//}



//-> Count word freq
fun main(){
    val text = "Kotlin is great, and Kotlin is fun!"
    val map = mutableMapOf<String, Int>()

    for (str in text.split(" ")){
        map[str] = map.getOrDefault(str, 0) + 1
    }

    println(map)
}