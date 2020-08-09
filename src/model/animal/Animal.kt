package model.animal

abstract class Animal(
    private val name: String,
    private val type: String,
    open val color: String
) {

    fun sleep() {
        println("寝ます〜")
    }

    abstract fun eat()

    abstract fun speak()

}