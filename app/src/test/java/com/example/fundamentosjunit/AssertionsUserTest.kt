package com.example.fundamentosjunit

import org.junit.*
import org.junit.Assert.*

class AssertionsUserTest {

   private lateinit var bot: User

companion object{

    private lateinit var juan: User

    @BeforeClass @JvmStatic
    fun setupCommon(){
        juan = User("Juan", 19, true)
        println("BeforeClass")
    }

    @AfterClass @JvmStatic
    fun tearDownCommon(){
        juan = User()
        println("AfterClass")
    }
}

   @Before
   fun setup(){
       bot = User("LaCamporaBit23",1, false)
       println("Before")
   }

    @After
    fun tearDown(){
        bot = User()
        println("After")
    }

    @Test
    fun checkHuman() {
        val assertions = Assertions()
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
        println("checkHuman")
    }

    @Test
    fun checkNotNullUserTest(){
        assertNotNull(juan)
        println("checkNotNullUser")
    }

    @Test
    fun checkNotSameUserTest(){
        assertNotSame(bot, juan)
        println("checkNotSameUserTest")
    }

    @Test
    fun checkSameUserTest(){
        val copyJuan = juan
        assertSame(copyJuan, juan)
        println("checkSameUsers")
    }
}