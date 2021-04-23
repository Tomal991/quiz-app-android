package com.example.quizapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    int mark;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent third = getIntent();
        mark = third.getIntExtra(MainActivity2.quizMark, 0);
        textview = findViewById(R.id.finaltextviewID);

        textview.setText("You get"+ " " + mark + " " + "out of 10");

    }

    public void TryAgain(View view) {
        Intent four = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(four);
    }
}