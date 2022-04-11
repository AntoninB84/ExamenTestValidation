package com.example.exercice1

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class UserTest {

    var users : MutableList<User>? = null

    @Before
    fun setup(){
        users = mutableListOf()
    }
    @Test
    fun addUser(){
        users?.add(User(1, "Antonin", 26))
        Assert.assertEquals(1, users?.size)
    }

    @Test
    fun deleteUser(){
        users?.remove(User(1, "Antonin", 26))
        Assert.assertEquals(0, users?.size)
    }

    @Test
    fun updateUser(){
        users?.add(User(1, "Antonin", 26))
        users?.get(0)?.name = "Anto"
        users?.get(0)?.age = 27
        Assert.assertEquals("Anto",  users?.get(0)?.name)
        Assert.assertEquals(27,  users?.get(0)?.age)
    }
}