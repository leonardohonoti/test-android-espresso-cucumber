package com.example.android.testing.espresso.BasicSample.test.page;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import static org.junit.Assert.assertEquals;

import android.widget.TextView;

import androidx.test.espresso.matcher.ViewMatchers;

import com.example.android.testing.espresso.BasicSample.R;

import org.junit.Assert;

public class AtividadePrincipalPage {

    public void digitarTextoCampoEntrada(String texto) {
        onView(ViewMatchers.withId(R.id.editTextUserInput)).perform(typeText(texto), closeSoftKeyboard());
    }

    public void pressionarBotaoAlterarTexto() {
        onView(ViewMatchers.withId(R.id.changeTextBt)).perform(click());
    }

    public void pressionarBotaoAlterarTextoAtividade() {
        onView(ViewMatchers.withId(R.id.activityChangeTextBtn)).perform(click());
    }

    public void verificarTextoAlterado(String textoEsperado) {

        onView(withId(R.id.textToBeChanged)).check(matches(withText(textoEsperado)));

        /*onView(withId(R.id.textToBeChanged)).check(((view, noViewFoundException) -> {
            TextView textView = (TextView) view;
            String textoDigitado = textView.getText().toString();
            Assert.assertEquals(textoEsperado, textoDigitado);
        }));

         */
    }

    public void msgCampoObrigatorio (String msgErro) {

        onView(withId(R.id.errorMessage)).check(matches(withText(msgErro)));

        /*onView(withId(R.id.errorMessage)).check(((view, noViewFoundException) -> {
            TextView textView = (TextView) view;
            String textoDeErro = textView.getText().toString();
            Assert.assertEquals(msgErro, textoDeErro);
        }));

         */
    }
}
