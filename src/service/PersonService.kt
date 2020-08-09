package service

import model.Singleton.EnglishGreeter
import model.greeter.JapaneseGreeter
import model.person.Person

class PersonService {

    fun createPerson() {
        val person1 = Person.of(name = "Taro", height = 170)

        val person2 = Person.of(name = "Taro", height = 170)

        val person3 = person1.updateHeight(180)

        person1.eat()

        println("finish")
    }


    fun greet() {

        val englishGreeter: EnglishGreeter = EnglishGreeter

        englishGreeter.greet()

        // englishGreeterと参照値同じになる!
        val englishGreeter2: EnglishGreeter = EnglishGreeter

        englishGreeter2.greet()

        EnglishGreeter.greet()

        val japaneseGreeter = JapaneseGreeter()

        japaneseGreeter.greet()
    }
}