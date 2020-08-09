package model.greeter

import `interface`.Greeter

class JapaneseGreeter: Greeter {

    override fun greet() {
        println("こんにちは")
    }
}