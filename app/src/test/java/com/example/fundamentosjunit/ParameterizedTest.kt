package com.example.fundamentosjunit

import org.junit.*
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedTest(var currentValue: Boolean, var currentUser:User ) {

    @get:Rule
    val locationESRule = LocationESRule()

    companion object{

        var assertions: Assertions? = null
        @BeforeClass @JvmStatic
        fun setupCommon(){
            assertions = Assertions()
        }

        @AfterClass @JvmStatic
        fun tearDownCommon(){
            assertions = null
        }


        @Parameterized.Parameters @JvmStatic
        fun getUserUS() = arrayOf(
            arrayOf(false, User("Gonzalo",15)),
            arrayOf(true, User("Juan",21)),
            arrayOf(true, User("Pedrito",26)),
            arrayOf(true, User("Bot23",2, false)),
            arrayOf(false, User("Yesferal", 18)))
    }

    @Test
    fun isAdultTest() {
      assertEquals(currentValue, assertions?.isAdult(currentUser))
}
}