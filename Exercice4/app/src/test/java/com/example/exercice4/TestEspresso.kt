package com.example.exercice4

import android.widget.EditText
import android.widget.TextView
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId


@RunWith(JUnit4::class)
class TestEspresso {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testInput() {
        onView(withId(R.id.firstNameEditText)).perform(typeText("Antonin"))
        onView(withId(R.id.lastNameEditText)).perform(typeText("Billot"))
        onView(withId(R.id.displayDataButton)).perform(click())
    }

    fun displayInfos(){
         val textView: TextView = findViewById(R.id.resultTextView)
         val edit1: EditText = findViewById(R.id.resultTextView)
         val edit2: EditText = findViewById(R.id.resultTextView)
         textView.text = "${edit1.text} ${edit2.text}"
    }
}