package com.example.android.testing.espresso.BasicSample.test.page;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import androidx.test.espresso.matcher.ViewMatchers;

import com.example.android.testing.espresso.BasicSample.R;

public class MostrarTextoDeAtividadePage {

    public void checkTextDisplayed(String expectedText) {
        onView(ViewMatchers.withId(R.id.show_text_view)).check(matches(withText(expectedText)));
    }
}
