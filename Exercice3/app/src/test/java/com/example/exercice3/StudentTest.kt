package com.example.exercice3

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class StudentTest {



    var students : MutableList<Student>? = null

    @Before
    fun setup(){
        students = mutableListOf()
    }

    @Test
    fun listStudents(){
        for(student in students!!){
            println(student.name)
        }
    }

    @Test
    fun addStudent(){
        students?.add(Student("Antonin"))
        assertThat(students?.size, equalTo(1))
    }

    @Test
    fun deleteStudent(){
        students?.remove(Student( "Antonin"))
        assertThat(students?.size, equalTo(0))
    }

    @Test
    fun updateStudent(){
        students?.add(Student("Antonin"))
        students?.get(0)?.name = "Anto"
        assertThat( students?.get(0)?.name, equalTo("Anto"))
    }
}