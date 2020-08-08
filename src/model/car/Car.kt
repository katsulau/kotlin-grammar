package model.car

open class Car(
    private val name: String,
    private val color: String
) {

    fun run() {
        println(name + "が走ります")
    }
}