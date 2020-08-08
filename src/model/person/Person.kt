package model.person

import model.Act

class Person private constructor(
    val name: String,
    val surname: String,
    val country: String,
    val height: Int
): Act {

    companion object {
        fun of(name: String, height: Int) = Person(
            name = name,
            surname = "Miya",
            country = "Japan",
            height = height
        )
    }

    fun updateHeight(updatedHeight: Int) = Person.of(
        name = this.name,
        height = updatedHeight
    )

    override fun eat() {
        println("eating")
    }

    override fun walk() {
        println("walking")
    }

    override fun sleep() {
        println("sleeping")
    }
}