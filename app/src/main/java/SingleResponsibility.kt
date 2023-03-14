//Violation of the Single Responsibility

class Robot {

    fun chef() {
        println("I'm a Chef")
    }

    fun painter() {
        println("I'm a Painter")
    }

    fun driver() {
        print("I'm a Driver")
    }

}


/*
* Solution to the Single Responsibility
*
* */

class ChefRobot {
    fun chef() {
        println("I'm a Chef")
    }
}

class PainterRobot {
    fun paint() {
        println("I'm a Painter")
    }
}

class DriverRobot {
    fun drive() {
        print("I'm a Driver")
    }
}