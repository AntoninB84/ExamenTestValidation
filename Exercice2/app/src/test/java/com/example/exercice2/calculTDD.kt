package com.example.exercice2

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class CalculTDD {

    val a = 3
    val b = 2
    val calculator = Calcul()

    @Test
    fun CalculAdd(){
        val somme: Int = calculator.add(a,b)
        assertThat(somme, equalTo(5))
    }

    @Test
    fun CalculSub(){
        val sub: Int = calculator.sub(a,b)
        assertThat(sub, equalTo(1))
    }

    @Test
    fun CalculDiv(){
        val div: Float = calculator.div(a.toFloat(),b.toFloat())
        assertThat(div, equalTo(1.5F))
    }

    @Test
    fun CalculMultiple(){
        val mult: Int = calculator.multiple(a,b)
        assertThat(mult, equalTo(6))
    }
}