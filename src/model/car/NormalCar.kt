package model.car

class NormalCar(name: String, color: String):Car(
    name = name,
    color = color
) {
    fun canListenMusic() {
        println("音楽が聞けます")
    }
}