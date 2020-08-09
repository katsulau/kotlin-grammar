package model.animal

class Maltese(
    private val name: String,
    private val type: String
): Dog(
    name = name,
    type = type,
    color = "white"
) {
    override fun speak() {
        println("マルチーズです〜話せるよ")
    }
}