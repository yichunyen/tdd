package yichunyen.tdd.tennis

class Tennis {
    private var firstPlayerScoreNumber: Int = 0

    fun score(): String {
        if (firstPlayerScoreNumber == 1) {
            return "Fifteen Love"
        }

        if (firstPlayerScoreNumber == 2) {
            return "Thirty Love"
        }

        if (firstPlayerScoreNumber == 3) {
            return "Forty Love"
        }
        return "Love All"
    }

    fun firstPlayerScore() {
        firstPlayerScoreNumber++
    }
}
