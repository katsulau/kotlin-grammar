package service

import model.animal.Animal
import model.animal.Dog
import model.animal.Maltese

class AnimalService {

    fun createDog() {
        val dog = Dog(color = "many colors", name = "犬", type = "哺乳類")
        dog.eat()
        dog.speak()
        dog.sleep()


        val maltese: Animal = Maltese(name = "bo", type = "小型犬")

        maltese.sleep()
        maltese.eat()
        maltese.speak()
    }
}