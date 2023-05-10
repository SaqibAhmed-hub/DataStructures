package arrays

class BasicArrays {

    /**
     * To initialize the array in Kotlin 1D.
     */
    private val array1 = arrayOf(1,2,3,4,5) // Array<Int>
    private val array2 = listOf(3,5,8,9).toTypedArray() // IntArray()
    private val array3 = IntArray(10) {it -> it * 2 } //IntArray()


    /**
     * To print the array in kotlin
     */
    fun printArray(){
        //Method 1
        for (element in array1){
            print("$element ")
        }

        //Method 2
        array2.forEach { it-> print("$it ") }


    }


    /**
     * calculate the sum of the array
     * @param - [2,5,6,8]
     * @return - [2,7,13,21]
     */
    fun calcSumOfArray(arr: IntArray): IntArray {
        for (i in 1 until arr.size) {
            arr[i] += arr[i - 1]
        }
        return arr
    }

    /**
     * Sum of the array
     * @return  integer value of the array sum.
     */
    fun sumFromOne(arr: IntArray): Int {
        return arr.reduce { sum, element -> sum + element }
    }

    /**
     * find the Consequence in a binary array
     * @param - [1,0,1,1,0,1,1,1,0]
     * @return  3
     */
    fun findConsequenceOfArray(arr: IntArray): Int{
        var temp = 0
        var max = 0

        for (i in arr){
            if (i == 0){
                max = Math.max(max,temp)
                temp=0
            }else{
                temp++
            }
        }
        return Math.max(max,temp)
    }



}