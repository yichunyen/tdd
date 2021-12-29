package yichunyen.tdd.tennis

class Tennis {
    private var firstPlayerScoreTimes: Int = 0
    private var secondPlayerScoreTimes: Int = 0
    private val scoreMap = HashMap<Int, String>().apply {
        put(0, "Love")
        put(1, "Fifteen")
        put(2, "Thirty")
        put(3, "Forty")
    }

    fun score(): String {
        if (firstPlayerScoreTimes != secondPlayerScoreTimes) {
            return "${scoreMap[firstPlayerScoreTimes]} ${scoreMap[secondPlayerScoreTimes]}"
        }

        if(firstPlayerScoreTimes == secondPlayerScoreTimes) {
            return "${scoreMap[firstPlayerScoreTimes]} All"
        }

        return "Love All" // 0:0
    }

    fun firstPlayerScore() {
        firstPlayerScoreTimes++
    }

    fun secondPlayerScore() {
        secondPlayerScoreTimes++
    }
}
