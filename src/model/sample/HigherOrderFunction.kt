package model.sample

/**
 * 引数として関数を受け取ったり、戻り値として関数を返すような関数のことを高階関数と言います。
 *
 */
class HigherOrderFunction {

    private fun succ(n: Int): Int = n + 1

    private fun twice(n: Int, action: (number: Int) -> Int): Int = action(action(n))

    fun executeFunction() {
        val got = twice(5, ::succ)
        println(got)

        // 定義したsucc関数ではなく、ラムダ 式でかくとこうなる
        val got2 = twice(5) { n :Int -> n + 1}
    }
}