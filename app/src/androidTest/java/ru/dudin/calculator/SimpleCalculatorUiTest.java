package ru.dudin.calculator;

/**
 * Simple calculator Ui testing.
 *
 * @created 23.05.2019
 * @author Andrey Dudin <programmer1973@mail.ru>
 * @version 0.1.0.2019.05.23
 */

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class SimpleCalculatorUiTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkUi() {
        onView(withId(R.id.edit_text_number_a))
                .check(matches(isDisplayed()));

        onView(withId(R.id.edit_text_number_b))
                .check(matches(isDisplayed()));

        onView(withId(R.id.text_view_result))
                .check(matches(isDisplayed()));

        onView(withId(R.id.button_add))
                .check(matches(isDisplayed()));

        onView(withId(R.id.button_sub))
                .check(matches(isDisplayed()));

        onView(withId(R.id.button_mul))
                .check(matches(isDisplayed()));

        onView(withId(R.id.button_div))
                .check(matches(isDisplayed()));
    }

    @Test
    public void checkCalculation() {
        onView(withId(R.id.edit_text_number_a))
                .perform(typeText("3"));

        onView(withId(R.id.edit_text_number_b))
                .perform(typeText("2"));

        //=====================
        onView(withId(R.id.button_add))
                .perform(click());

        onView(withId(R.id.text_view_result))
                .check(matches(withText("5")));

        //=====================
        onView(withId(R.id.button_sub))
                .perform(click());

        onView(withId(R.id.text_view_result))
                .check(matches(withText("1")));

        //=====================
        onView(withId(R.id.button_mul))
                .perform(click());

        onView(withId(R.id.text_view_result))
                .check(matches(withText("6")));

        //=====================
        onView(withId(R.id.button_div))
                .perform(click());

        onView(withId(R.id.text_view_result))
                .check(matches(withText("1.500000")));
    }
}