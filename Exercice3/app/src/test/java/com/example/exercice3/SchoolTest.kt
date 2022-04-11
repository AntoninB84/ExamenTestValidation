package com.example.exercice3

import org.hamcrest.MatcherAssert
import org.hamcrest.core.IsEqual
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class SchoolTest {
    
    var schoolSubjects : MutableList<Student>? = null

    @Before
    fun setup(){
        schoolSubjects = mutableListOf()
    }

    @Test
    fun listStudents(){
        for(student in schoolSubjects!!){
            println(student.name)
        }
    }

    @Test
    fun addStudent(){
        schoolSubjects?.add(Student("Antonin"))
        MatcherAssert.assertThat(schoolSubjects?.size, IsEqual.equalTo(1))
    }

    @Test
    fun deleteStudent(){
        schoolSubjects?.remove(Student( "Antonin"))
        MatcherAssert.assertThat(schoolSubjects?.size, IsEqual.equalTo(0))
    }

    @Test
    fun updateStudent(){
        schoolSubjects?.add(Student("Antonin"))
        schoolSubjects?.get(0)?.name = "Anto"
        MatcherAssert.assertThat(schoolSubjects?.get(0)?.name, IsEqual.equalTo("Anto"))
    }
}