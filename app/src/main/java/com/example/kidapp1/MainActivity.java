package com.example.kidapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Educational Application");



    }

    public void StartQuiz(View view) {
        Intent myIntent = new Intent(MainActivity.this, Quiz.class);

        MainActivity.this.startActivity(myIntent);
    }
}