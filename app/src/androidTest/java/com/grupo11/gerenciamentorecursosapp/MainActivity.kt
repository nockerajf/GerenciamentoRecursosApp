package com.grupo11.gerenciamentorecursosapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testRecyclerViewIsDisplayed() {
        onView(withId(R.id.recyclerView)).check(matches(isDisplayed()))
    }
    @Test
    fun testRecyclerViewHasItems() {
        onView(withId(R.id.recyclerView))
            .check(matches(hasMinimumChildCount(1)))
    }

}
