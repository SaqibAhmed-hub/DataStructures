package recursion

class RecursionClass {

    /**
     *  What is a recursion?
     *  a recursion is a function that call itself.
     */

    fun printNumber(n: Int) {
        println(n)
        if (n == RECURSION_NUMBER) return else printNumber(n + 1)
    }

    /**
     * complexity simple
     * Time Complexity: O(n)
     * to find the factorial of a number
     */
    fun factorialNumber(n: Int): Int {
        return if (n == 0) 1 else n * factorialNumber(n - 1)
    }

    /**
     * a companion object is final static variable and object
     *  similar to public static keyword in java
     *  i can access below variable without initaling the class.
     *  like, RecursionClass.RECURSION_NUMBER
     */
    companion object {
        const val RECURSION_NUMBER = 5

        fun dummyFunction(): Int {
            println("Hello dummy text.")
            return 50
        }

    }


}