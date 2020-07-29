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
    fun check(){ //checks single words

        assertEquals(false, checkPalindrome("Maad"))
        assertEquals(true, checkPalindrome("Hannah"))



    }
    @Test
    fun checkSentencePalindrome(){ //checks number palindrome
        assertEquals(true, checkPalindrome("Able was I ere I saw Elba") )
    }

    @Test
    fun checkNumberPalindrome(){ //checks number palindrome
        assertEquals(true, checkPalindrome("1221"))
    }

    @Test
    fun checkSpecialCharacter(){ //checks palindrome that have characters other than alphanumeric
        assertEquals(true, checkPalindrome("Mr. Owl ate my metal worm"))
    }
    @Test
    fun checkMixedCharacter(){ //checks palindrome that have characters other than alphanumeric
        assertEquals(false, checkPalindrome("12qw1"))
    }

}