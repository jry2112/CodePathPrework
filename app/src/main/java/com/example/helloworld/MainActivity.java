package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        // User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.cadet_grey));
            }
        });

        // User can tap a button to change the color of the background view
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change th color of the background view
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.tutu));

            }

        });

        // User can tap a button to change the text of the label
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the text of the label
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        // User can tap on the background view to reset all views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Reset the text to "Hello from Jada!" id -- text
                textView.setText("Hello from Jada!");

                // 2. Reset the color of the background view to gossamer
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.mint_green));

                // 3. Reset the text color to arsenic, id -- text
                textView.setTextColor(getResources().getColor(R.color.arsenic));
            }
        });

        // User can tap the "change text string" button to update the label with text from the text field.
        findViewById(R.id.customTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                // If the text field is empty, update the label to a default message
                if (userEnteredText.isEmpty()){
                    textView.setText("Enter your own text.");
                }
                else {
                    textView.setText(userEnteredText);
                }
            }

        });

    }
}