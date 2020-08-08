import model.car.NormalCar
import model.sample.HigherOrderFunction
import service.FizzBuzzService
import service.PersonService
import service.SampleService
import service.UserService

fun main() {
    val personService = PersonService()

    personService.createPerson()

    val skyline = NormalCar(name = "skyline", color = "blue")

    skyline.canListenMusic()
    skyline.run()


    val sampleService = SampleService()

    sampleService.checkBasicGrammar()


    sampleService.checkArrayAndList()


    val fizzBuzzService = FizzBuzzService()

    fizzBuzzService.outputFizzBuzzWithWhen()


    val higherOrderFunction = HigherOrderFunction()

    higherOrderFunction.executeFunction()

    UserService.findUserId(token = "aaa")
    UserService.findUserId(token = "ccc")


}