package app

import data.Action

fun fireAction(action:Action){
    action.action()
}

class SampleAction:Action{
    override fun action() {
        println("This is sample action")
    }
}

fun main() {
    fireAction(SampleAction())
    // anonymous class
    fireAction(object :Action{
        override fun action() {
            println("Action one")
        }
    })
}