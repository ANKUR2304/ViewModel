package com.example.viewmodel_impl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ViewModel_MainActivity viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(ViewModel_MainActivity.class);

        final TextView textView1 = findViewById(R.id.textView1);
        textView1.setText("You clicked me " + viewModel.getCount() + " times!");

        final Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewModel.increaseCount();
                textView1.setText("You clicked me " + viewModel.getCount() + " times!");
            }
        });
    }
}