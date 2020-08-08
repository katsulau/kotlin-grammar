package service

import model.person.Person

class PersonService {

    fun createPerson() {
        val person1 = Person.of(name = "Taro", height = 170)

        val person2 = Person.of(name = "Taro", height = 170)

        val person3 = person1.updateHeight(180)

        person1.eat()

        println("finish")
    }
}