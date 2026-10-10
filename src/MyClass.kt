// Conditions in kotlin

class MyClass {
    companion object{
        @JvmStatic
        fun main(args : Array<String>){
           var num = 11

            var msg = ""

            msg = if (num > 100) "Number is greater than 100" else "Number is smaller than 100"
            println(msg)

            if (num > 100){

            } else if (num <70){

            } else if (num == 100){

            } else {

            }

            // we can use when in place of skip in kotlin
            when(num){
                1->{

                }

                100->{

                }
            }

            when{
                num > 100 ->{

                }
                num < 100 ->{
                    println("In when: Num is smaller")
                }

                num==100 ->{

                }
            }
        }
    }
}