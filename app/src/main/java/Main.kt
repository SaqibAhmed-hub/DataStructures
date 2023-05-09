/**
 * Kotlin programming in android studio
 */

fun main(args: Array<String>) {


    val number: Long = 5236
    println("Sum => ${sumFromOne(number)}")

    //How to define a array.
    val arr = intArrayOf(3,1,2,10,1)
    val resultedArray = calcSumOfArray(arr)
    for (i in resultedArray){
        print("$i ")
    }

}

fun calcSumOfArray(arr: IntArray): IntArray {
  for (i in 1 until arr.size){
        arr[i] = arr[i-1] + arr[i]
  }
    return arr
}


fun sumFromOne(n: Long): Long{
    return (1..n).reduce { sum, element -> sum + element }
}








