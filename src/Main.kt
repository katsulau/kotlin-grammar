import model.car.NormalCar
import model.sample.HigherOrderFunction
import service.*

fun main(
) {
    val personService =  PersonService()
    val sampleService = SampleService()
    val fizzBuzzService = FizzBuzzService()
    val animalService = AnimalService()

    personService.createPerson()

    val skyline = NormalCar(name = "skyline", color = "blue")

    skyline.canListenMusic()
    skyline.run()

    sampleService.checkBasicGrammar()

    sampleService.checkArrayAndList()

    fizzBuzzService.outputFizzBuzzWithWhen()

    val higherOrderFunction = HigherOrderFunction()

    higherOrderFunction.executeFunction()

    UserService.findUserId(token = "aaa")
    UserService.findUserId(token = "ccc")

    animalService.createDog()

    personService.greet()
}