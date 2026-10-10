fun anagram(s: String , t : String): Boolean{

    if (s.length != t.length) return false

    val dict1 = mutableMapOf<Char, Int>()
    val dict2 = mutableMapOf<Char, Int>()

    for (i in s){
        dict1[i] = dict1.getOrDefault(i,0) +1
    }

    for (i in t){
        dict2[i] = dict2.getOrDefault(i, 0) + 1
    }

    return dict1 == dict2
}


// T: O(n)
// S: O(n)


fun main(){
    val s = "silent"
    val t = "listen"

    val result = anagram(s,t)
    print(result)
}


// We can also solve it in T: O(n), S: O(1)

// Pesudo code
// 1.   Create the array charCounts of size 26 with default value 0 using the IntArray(26)
// 2.   Run a for loop on s and t simultaneously:-
//        charCounts[s[i] - 'a'] + 1         First increase that char by 1
//        charCounts[t[i] - 'a'] + 1         Then decrease that char by 1

// 3.   Run a for loop again on the charCounts
//        for(count in charCount){
//            if (count != 0){
//                return false
//            }
//        }

//4.    Return true