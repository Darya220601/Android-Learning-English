package com.example.androiduniversitypr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ActivityTaskCards extends AppCompatActivity {
    int index;
    Word w;
    String imageName;
    ImageButton imageView;
    TextView textView;
    TextView wordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_cards);
        Intent intent = getIntent();
        index = intent.getIntExtra("EngWord",0);
        w = Theory.listOfCurrentWords.get(index);
        imageName = w.referenceImage;
        imageView = findViewById(R.id.imageButton5);
        int imageID = getResources().getIdentifier(imageName, "drawable", getPackageName());
        imageView.setImageResource(imageID);
        // imageView.setImageResource((imageName));
        TextView russianW = findViewById(R.id.textView8);
        russianW.setText(w.getRussian());
        textView = findViewById(R.id.textView6);
        wordTextView = findViewById(R.id.textView7);
        wordTextView.setText(w.getEnglish());




    }
    public void buttonClick(View view) {
        Intent intent = new Intent(ActivityTaskCards.this, ActivityEnd.class);
        startActivity(intent);
    }

    public void notCor(View view) {
        textView.setText("Неверно.");
    }
}