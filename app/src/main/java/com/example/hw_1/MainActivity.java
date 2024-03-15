package com.example.hw_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainViewModel viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        //+ task 1
        TextView textViewClicker = findViewById(R.id.textViewClicker);
        textViewClicker.setText("" + viewModel.clickCount.getValue());

        Button buttonClicker = findViewById(R.id.buttonClicker);

        buttonClicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.clickCount.setValue(viewModel.clickCount.getValue() + 1);
            }
        });
        viewModel.clickCount.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textViewClicker.setText("" + viewModel.clickCount.getValue());
            }
        });
        //- task 1

        //+ task 2
        TextView textViewHello = findViewById(R.id.textViewHello);
        textViewHello.setText("Привет, " + viewModel.name.getValue());

        EditText editTextHello = findViewById(R.id.editTextHello);

        Button buttonHello = findViewById(R.id.buttonHello);
        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.name.postValue(editTextHello.getText().toString());
//                textViewHello.setText("Привет, " + viewModel.name);
            }
        });
        //- task 2
        viewModel.name.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textViewHello.setText("Привет, " + viewModel.name.getValue());
            }
        });

    }

}