package model.sample

class HigherOrderFunction {

    private fun succ(n: Int): Int = n + 1

    private fun twice(n: Int, action: (number: Int) -> Int): Int = action(action(n))

    fun executeFunction() {
        val got = twice(5, ::succ)
        println(got)
    }
}