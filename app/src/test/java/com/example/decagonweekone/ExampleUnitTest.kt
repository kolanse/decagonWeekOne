package com.example.decagonweekone

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun mut(){
        assertEquals(true, checkPalindrome("Able was I ere I saw Elba") )
        assertEquals(false, checkPalindrome("Maad"))
        assertEquals(true, checkPalindrome("Hannah"))
        assertEquals(true, checkPalindrome("Mr. Owl ate my metal worm"))
        assertEquals(true, checkPalindrome("1221"))
    }

}