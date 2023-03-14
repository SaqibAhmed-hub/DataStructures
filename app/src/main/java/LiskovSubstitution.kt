
//Violation of the Liskov Substitution Principle

open class Rectangle {
    private var height = 0
    private var width = 0

    open fun setHeight(height: Int) {
        this.height = height
    }

    open fun setWidth(width: Int) {
        this.width = width
    }

    fun area(): Int {
        return height * width
    }
}


class Square : Rectangle() {
    override fun setHeight(height: Int) {
        setSide(height)
    }

    override fun setWidth(width: Int) {
        setSide(width)
    }

    private fun setSide(side: Int) {
        super.setHeight(side)
        super.setWidth(side)
    }
}

fun main() {
    val rectangle = Rectangle()
    rectangle.setHeight(5)
    rectangle.setWidth(2)

    val rectangleCheck = rectangle.area() == 10 // true

    val square: Rectangle = Square()
    square.setHeight(5) // width is also set to 5
    square.setWidth(2) // height is also set to 2

    val squareCheck = square.area() == 10 // false - not substitutable
}



//Solution to the Liskov Principle.

abstract class Shape {
    abstract fun area(): Double
}

class Rectangle1(private val width: Double, private val height: Double) : Shape() {

    override fun area(): Double {
        return width * height
    }
}

class Square1(private val side: Double) : Shape() {

    override fun area(): Double {
        return side * side
    }
}

fun printArea(shape: Shape) {
    println("The area of the shape is ${shape.area()}")
}


