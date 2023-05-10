/**
 * Kotlin programming in android studio
 */

fun main(args: Array<String>) {



    val arr1 = arrayOf(0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1)
    var temp = 0
    var max = 0

    for (i in arr1){
     if (i == 0){
         max = Math.max(max,temp)
         temp=0
     }else{
         temp++
     }
    }

    for (i in arr1){
        print("$i ")
    }
    println("Answer => ${Math.max(max,temp)}")
}












