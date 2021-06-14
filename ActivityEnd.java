package com.example.androiduniversitypr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityEnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }
    public void buttonClick(View view) {

    }

    public void Finish(View view) {
        Intent intent3 = new Intent(ActivityEnd.this, MainActivity.class);
        startActivity(intent3);
    }
}
