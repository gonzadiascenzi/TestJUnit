package com.example.fundamentosjunit

import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

class AssertionsTest{
    @Test
    fun getArrayTest(){
        val assertions = Assertions()
        val array = arrayOf(21,116)//valor esperado
        assertArrayEquals("Mensaje personalizado de error en testing", array, assertions.getLuckyNumbers())
    }

    @Test
    fun getNameTest(){
        val assertions = Assertions()
        val name = "Yesferal"
        val otherName = "Gonzalo"
        assertNotEquals(otherName, assertions.getName())
        assertEquals(name, assertions.getName())
    }

    @Test
    fun checkHumanTest(){
        val assertions = Assertions()
        val juan = User("Juan", 19, true)
        val bot = User("LaCamporaBit23",1, false)
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
    }

    @Test
    fun checkNullUserTest(){
        val user = null
        assertNull(user)
        val assertions = Assertions()
        assertNull(assertions.checkHuman(user))
    }

    @Test
    fun checkNotNullUserTest(){
        val juan = User("Juan", 19, true)
        assertNotNull(juan)
    }

    @Test
    fun checkNotSameUserTest(){
        val juan = User("Juan", 19, true)
        val bot = User("LaCamporaBit23",1, false)
        assertNotSame(bot, juan)
    }

    @Test
    fun checkSameUserTest(){
        val juan = User("Juan", 19, true)
        val bot = User("Juan", 19, true)
        val copyJuan = juan
        assertSame(copyJuan, juan)
    }

    @Test(timeout = 1_000)
    fun getCitiesTest(){
        val cities = arrayOf("Mexico", "Peru", "Argentina")
        Thread.sleep(Random.nextLong(200,1_100))
        assertEquals(3, cities.size)

    }

}