package service

import model.sample.TokenCheck

class UserService {

    companion object {

        private fun outputCharacter(character: String): Unit = println(character + "です")

        fun findUserId(token: String) {
            val tokenCheck = TokenCheck()

            tokenCheck.authorized(token = token, action = ::outputCharacter)

            tokenCheck.authorized(token = token, action = fun(userId: String){println(userId + "でっせ!")} )

            tokenCheck.authorized(token = token, action = { outputCharacter("humhum")})

            // Kotlinでは、関数の最後のパラメータが関数である場合、そのパラメータは括弧の外に指定することができるという慣習があります
            // この形により、スコープ関数を実現することができる
            // https://dogwood008.github.io/kotlin-web-site-ja/docs/reference/lambdas.html
            tokenCheck.authorized(token = token) { userId ->
                println(userId)
            }
        }
    }
}