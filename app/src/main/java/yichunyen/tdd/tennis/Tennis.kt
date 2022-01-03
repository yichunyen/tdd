package yichunyen.tdd.tennis

class Tennis(private val firstPlayerName: String) {
    private var firstPlayerScoreTimes: Int = 0
    private var secondPlayerScoreTimes: Int = 0
    private val scoreMap = HashMap<Int, String>().apply {
        put(0, "Love")
        put(1, "Fifteen")
        put(2, "Thirty")
        put(3, "Forty")
    }

    fun score(): String {
        if (isSameScore()) {
            return if (isDeuce()) {
                getDeuce()
            } else {
                "${scoreMap[firstPlayerScoreTimes]} All"
            }
        }

        if (firstPlayerScoreTimes > 3) {
            if (firstPlayerScoreTimes - secondPlayerScoreTimes == 1) {
                return firstPlayerName + " Adv"
            }
        }
        return "${scoreMap[firstPlayerScoreTimes]} ${scoreMap[secondPlayerScoreTimes]}"
    }

    private fun isSameScore(): Boolean {
        return firstPlayerScoreTimes == secondPlayerScoreTimes
    }

    private fun isDeuce(): Boolean {
        return firstPlayerScoreTimes >= 3
    }

    private fun getDeuce() : String {
        return "Deuce"
    }

    fun firstPlayerScore() {
        firstPlayerScoreTimes++
    }

    fun secondPlayerScore() {
        secondPlayerScoreTimes++
    }
}
