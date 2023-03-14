
//Violation of Interface Segregation

interface RobotInterface {
    fun rotate()
    fun spin()
    fun sendSignal()
}

class RobotAntenna: RobotInterface{
    override fun rotate() { }

    override fun spin() { }

    override fun sendSignal() { }

}

class RobotWithOutAntenna : RobotInterface{
    override fun rotate() {}

    override fun spin() {}

    override fun sendSignal() {}

}


//Solution to the Interface Segregation

interface RotateRobotInterface{
    fun rotate()
    fun spin()
}
interface SignalRobotInterface{
    fun sendSignal()
}

class RobotAntenna1: SignalRobotInterface{
    override fun sendSignal() {}
}

class RobotWithOutAntenna1 : RotateRobotInterface{
    override fun rotate() {}

    override fun spin() {}
}

