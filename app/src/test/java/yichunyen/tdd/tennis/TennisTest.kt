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

    private fun givenFirstPlayerScore(times: Int) {
        for (index in 0 until times) {
            tennis.firstPlayerScore()
        }
    }

    private fun shouldBeScore(excepted: String) {
        Assert.assertEquals(excepted, tennis.score())
    }

}