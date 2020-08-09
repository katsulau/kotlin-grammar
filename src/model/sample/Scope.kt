package model.sample

class Scope {

    /**
     * レシーバーが引数となる。thisはTを表すはず、、
     * block関数は、Tを引数にとり、Rを返す関数。
     * このメソッド自体は、block関数を実行するものである。
     *
     *
     * @param T
     * @param R
     * @param block
     * @return
     */
    public inline fun <T, R> T.let(block: (T) -> R): R = block(this)



    public inline fun <T, R> T.hoge(confirm: () -> R): R = confirm()
}