package algorithm.minApple

fun main() {

    val apples = mutableListOf(4, 2, 5, 1, 3)

    // カウントで数を数えられるが、array[0]で始まるため-1している
    val count: Int = apples.count() - 1


    // りんご数ループ　例だと0 ~ 3
    for (i in 0..(count - 1) ) {

        // 最小値として最初に0を代入
        var min = i

        // 1~りんごの数の分だけ繰り返し
        for (number in (i + 1)..count) {
            // 例； apples[1]とapples[2]を比較。apples[2]が小さければ、minにnumberを代入
            if (apples[min] > apples[number]) {
                min = number
            }
        }

        if (i != min) {

            var work = apples[i]

            apples[i] = apples[min]

            apples[min] = work
        } else {
            println(apples.toString())
        }
    }
}