package model.Singleton

import `interface`.Greeter

object EnglishGreeter:Greeter {
    override fun greet() {
        println("Hello!")
    }
}