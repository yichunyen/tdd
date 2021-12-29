package yichunyen.tdd.tennis

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TennisTest {
    private lateinit var tennis: Tennis

    @Before
    fun setup() {
        tennis = Tennis()
    }

    @Test
    fun loveAllTest() {
        shouldBeScore("Love All")
    }

    @Test
    fun fifteenLoveTest() {
        givenFirstPlayerScore(1)
        shouldBeScore("Fifteen Love")
    }

    @Test
    fun thirtyLoveTest() {
        givenFirstPlayerScore(2)
        shouldBeScore("Thirty Love")
    }

    @Test
    fun fortyLoveTest() {
        givenFirstPlayerScore(3)
        shouldBeScore("Forty Love")
    }

    @Test
    fun loveFifteenTest() {
        givenSecondPlayerScore(1)
        shouldBeScore("Love Fifteen")
    }

    @Test
    fun loveThirtyTest() {
        givenSecondPlayerScore(2)
        shouldBeScore("Love Thirty")
    }

    @Test
    fun loveFortyTest() {
        givenSecondPlayerScore(3)
        shouldBeScore("Love Forty")
    }

    @Test
    fun fifteenAllTest() {
        givenEqualPlayerScore(1)
        shouldBeScore("Fifteen All")
    }

    @Test
    fun thirtyAllTest() {
        givenEqualPlayerScore(2)
        shouldBeScore("Thirty All")
    }

    private fun givenFirstPlayerScore(times: Int) {
        for (index in 0 until times) {
            tennis.firstPlayerScore()
        }
    }

    private fun givenSecondPlayerScore(times: Int) {
        for (index in 0 until times) {
            tennis.secondPlayerScore()
        }
    }

    private fun givenEqualPlayerScore(times: Int) {
        givenFirstPlayerScore(times)
        givenSecondPlayerScore(times)
    }

    private fun shouldBeScore(excepted: String) {
        Assert.assertEquals(excepted, tennis.score())
    }

}