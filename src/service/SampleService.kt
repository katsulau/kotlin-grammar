package service

class SampleService {

    fun checkBasicGrammar() {
        val message: String = "kotlin is fun!"

        val length = message.length

        val messageUpperCase = message.toUpperCase()

        val newMessage = """
            I am hugahuga!
            
            Nice to meet you!!
        """

        println(newMessage)
    }


    fun checkArrayAndList() {
        // Arrayは要素の値の変更や追加が可能
        // 基本型(プリミティブ型)の１つとしての配列
        var carArray: Array<String> =
            arrayOf("skyline", "swift", "beetle")

        // Listは読み取り専用のクラス
        val carList: List<String> = listOf<String>("skyline", "swift", "beetle")


        // 継承関係
        // Collection
        // List
        // MutableList
        // ArrayList

        carArray += "impreza"

        carArray.forEach { println(it) }

        var numberArray = arrayOf(1, 2, 3, 4)

        numberArray += 5


        val numberList: List<Int> = listOf(1, 2, 3)



        var exampleList: List<String> = listOf("skyline", "swift", "beetle")

        // この形で足せなくもないが、この場合、新しいListオブジェクトが作られる。(参照値が変わる)
        exampleList += "impreza"

        val mutableExampleList: MutableList<String> = mutableListOf("skyline", "swift", "beetle")

        mutableExampleList += "impreza"

        val mapExample = mapOf("1" to "aaa", "2" to "bbb")

        val setExample = setOf("a", "b", "a")

        println("check done")

    }
}