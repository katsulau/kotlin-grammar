package model.sample

class TokenCheck {

    /**
     *　<T>は型パラメータの宣言、使う分だけここに書く
     * 二つ目の引数は関数。関数によって返り値は異なる（ある時はUnitかもしれないし、
     * ある時はStringかもしれない）ため、ジェネリクスを使う
     *
     * https://qiita.com/wiroha/items/1768ed13c4ab2a322959
     * https://gateau.hatenablog.com/archive/category/Qiita
     * @param T
     * @param token
     * @param action
     * @return
     */
    fun <T> authorized(token: String, action: (userId: String) -> T): T {
        val userId = when (token) {
            "aaa" -> "userA"
            "bbb" -> "userB"
            else -> "other user"
        }

        return action.invoke(userId)
    }
}