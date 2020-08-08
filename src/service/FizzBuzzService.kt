package service

class FizzBuzzService {

    fun outputFizzBuzz(number: Int) {

        if (number % 15 == 0) {
            println("FizzBuzz")
            return
        }

        if (number % 3 == 0) {
            println("Fizz")
            return
        }

        if (number % 5 == 0) {
            println("Buzz")
            return
        }

        println(number)
    }

    fun outputFizzBuzzWithWhen() {
        for (i in 1..100) {
            val number = when {
                i % 15 == 0 -> "FizzBuzz"
                i % 3 == 0 -> "Fizz"
                i % 5 == 0 -> "Buzz"
                else -> i
            }
            println(number)
        }
    }
}