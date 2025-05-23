/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.testing.espresso.BasicSample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * An {@link Activity} that gets a text string from the user and displays it back when the user
 * clicks on one of the two buttons. The first one shows it in the same activity and the second
 * one opens another activity and displays the message.
 */
public class MainActivity extends Activity implements View.OnClickListener {

    // The TextView used to display the message inside the Activity.
    private TextView mTextView;


    // The EditText where the user types the message.
    private EditText mEditText;

    private TextView mErrorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mErrorMessage = (TextView) findViewById(R.id.errorMessage);

        // Set the listeners for the buttons.
        findViewById(R.id.changeTextBt).setOnClickListener(this);
        findViewById(R.id.activityChangeTextBtn).setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textToBeChanged);
        mEditText = (EditText) findViewById(R.id.editTextUserInput);
    }

    @Override
    public void onClick(View view) {
        // Remove erro anterior
        mErrorMessage.setVisibility(View.GONE);
        mErrorMessage.setText("");

        final String text = mEditText.getText().toString().trim();

        if (text.isEmpty()) {
            mErrorMessage.setText("Campo obrigatório");
            mErrorMessage.setVisibility(View.VISIBLE);
            return;
        }

        if (text.matches("\\d+")) {
            mErrorMessage.setText("Texto não pode conter apenas números");
            mErrorMessage.setVisibility(View.VISIBLE);
            return;
        }

        String textoAtual = mTextView.getText().toString().trim();
        if (text.equals(textoAtual)) {
            mErrorMessage.setText("Texto já existe");
            mErrorMessage.setVisibility(View.VISIBLE);
            return;
        }

        if (view.getId() == R.id.changeTextBt) {
            mTextView.setText(text);
        } else if (view.getId() == R.id.activityChangeTextBtn) {
            Intent intent = com.example.android.testing.espresso.BasicSample.ShowTextActivity
                    .newStartIntent(this, text);
            startActivity(intent);
        }
    }
}
