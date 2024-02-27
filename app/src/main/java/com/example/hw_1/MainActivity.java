package com.example.hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int clickCount = 0;
    String userName = "Anonimous";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //+ task 1
        TextView textViewClicker = findViewById(R.id.textViewClicker);
        textViewClicker.setText("empty");

        Button buttonClicker = findViewById(R.id.buttonClicker);

        buttonClicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                textViewClicker.setText("" + clickCount);
            }
        });
        //- task 1

        //+ task 2
        TextView textViewHello = findViewById(R.id.textViewHello);
        textViewHello.setText("Привет, " + userName);

        EditText editTextHello = findViewById(R.id.editTextHello);

        Button buttonHello = findViewById(R.id.buttonHello);
        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName = editTextHello.getText().toString();
                textViewHello.setText("Привет, " + userName);
            }
        });
        //- task 2

    }

}