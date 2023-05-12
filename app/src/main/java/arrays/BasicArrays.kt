package arrays

import kotlin.math.abs

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

        //Method 3
        print(array3.joinToString())

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

    fun findEvenNumbers(arr: IntArray): Int{
        var eventNumer = 0
        arr.forEach {
            var acc = 0 ; var cur = it
            while (cur != 0){
                cur /= 10
                acc++
            }
            if (acc%2 == 0) eventNumer++
        }
        return eventNumer
    }


    /**
     * Square of the sorted Array
     * @param [-4,-1,0,3,10]
     * @return [0,1,9,16,100]
     * Solution - 1
     */
    fun squareOfSortedArray(arr: IntArray): IntArray{
        for (i in arr.indices) arr[i] *= arr[i]
        return arr.sortedArray()
    }

    //Solution2 - The Faster way using Two Pointer
    fun squareOfSortedArray1(arr: IntArray): IntArray{
        var L = 0
        var R = arr.size - 1
        val nums = IntArray(arr.size)
        for (i in nums.indices.reversed()) {
            if (abs(arr[L]) >= abs(arr[R])) {
                nums[i] = arr[L] * arr[L]
                L++
            } else {
                nums[i] = arr[R] * arr[R]
                R--
            }
        }
        return nums
    }


}