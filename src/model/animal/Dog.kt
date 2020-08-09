package model.animal

open class Dog constructor(
     private val name: String,
     private val type: String,
     override val color: String
): Animal(
    name = name,
    type = type,
    color = color
) {
    companion object {
        fun of(name: String, type: String, color: String): Dog = Dog(
            name = name,
            type = type,
            color = color
        )
    }

    override fun eat() {
        println("犬です〜食べるぞ〜")
    }

    override fun speak() {
        println("ワンワン吠えます〜")
    }
}

