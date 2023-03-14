

//Violation of the Open Closed Principle

enum class RobotAction{
    CHEF,PAINTER,GARDNER
}

class RobotService1{

    fun doAction(robotACTION : RobotAction){
        when(robotACTION){
            RobotAction.CHEF -> { /* Do Something */ }
            RobotAction.GARDNER -> { /* Do Something */ }
            RobotAction.PAINTER -> { /* Do Something */  }
        }
    }
}



/*
* Solution to the Open Closed Principle
* */

interface RobotActionInterface{
    fun doAction()
}

class RobotService2{

    fun doRealAction(action: RobotActionInterface){
        action.doAction()
    }

}

class RobotChef: RobotActionInterface{
    override fun doAction() {

    }
}
class RobotGardner: RobotActionInterface{
    override fun doAction() {

    }
}
