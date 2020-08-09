package model.sample

class TokenCheck {

    fun <T> authorized(token: String, action: (userId: String) -> T): T {
        val userId = when (token) {
            "aaa" -> "userA"
            "bbb" -> "userB"
            else -> "other user"
        }

        return action.invoke(userId)
    }
}