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
        return if(firstPlayerScoreTimes == secondPlayerScoreTimes) {
            "${scoreMap[firstPlayerScoreTimes]} All"
        } else {
            "${scoreMap[firstPlayerScoreTimes]} ${scoreMap[secondPlayerScoreTimes]}"
        }
    }

    fun firstPlayerScore() {
        firstPlayerScoreTimes++
    }

    fun secondPlayerScore() {
        secondPlayerScoreTimes++
    }
}
