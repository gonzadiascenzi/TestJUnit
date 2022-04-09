package com.example.fundamentosjunit

import com.example.fundamentosjunit.ParameterizedTest.Companion.assertions
import org.junit.*
import org.junit.Assert.*

class AssertionsUsersAdultTest {

    private lateinit var bot: User
    private lateinit var juan: User

    @get:Rule val locationESRule = LocationESRule()

    @Before
    fun setup(){
        bot = User("LaCamporaBit23",1, false)
        juan = User("Juan",19, true)
        println("Before")
    }

    @After
    fun tearDown(){
        bot = User()
        juan = User()
        println("After")
    }

    @Test
    fun isAdultTest() {
        /*val assertions = Assertions()
        assertions.setLocation("ES")
        assertTrue(assertions.isAdult(juan))
        assertTrue(assertions.isAdult(bot))*/
        assertEquals(false, assertions?.isAdult(juan))



    }
}