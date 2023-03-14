

//Violation of the Dependency Inversion Principle

class KnifeCutter{
    fun cutting(){
        println(" i can cut things with knife")
    }
}

class RobotServices{
    fun cook(){
        val knifeCutter = KnifeCutter()
        knifeCutter.cutting()
    }
}


//Solution to the Dependency Inversion Principle

interface CutterTools{
    fun cutting()
}

class KnifeCutter1 : CutterTools{
    override fun cutting(){
        println(" i can cut things with knife")
    }
}

class RobotServices1{
    val cutterTools: CutterTools? = null //Dependency initilize
    fun cook(cutterTools: CutterTools){
        cutterTools.cutting()
    }
}
