package com.example.androiduniversitypr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.example.androiduniversitypr.MainActivity.words;

public class Activity_themes extends AppCompatActivity {
    ImageView close;
    ImageView allThemes;
    ImageView travellingThemes;
    ImageView furnitureThemes;
    int levelOfWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);
        close = findViewById(R.id.imageView);
        allThemes = findViewById(R.id.imageViewPinkTheme);
        travellingThemes = findViewById(R.id.imageViewYellow);
        furnitureThemes = findViewById(R.id.imageViewPurple);


        Intent intent2 = getIntent();
        levelOfWord = intent2.getIntExtra("LEVEL", 0);



        View.OnClickListener onClickListenerImageClose = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_themes.this, MainActivity.class);
                startActivity(intent);

            }
        };
        close.setOnClickListener(onClickListenerImageClose);

        View.OnClickListener onClickListenerImageAllThemes = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_themes.this, Theory.class);
                intent.putExtra("Lev", levelOfWord);
                intent.putExtra("Reg", Word.RegimLearning);
                intent.putExtra("ThemeOfPlay", Word.allThemes);

                startActivity(intent);

            }
        };
        allThemes.setOnClickListener(onClickListenerImageAllThemes);

        View.OnClickListener onClickListenerImageTravelling = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_themes.this, Theory.class);

                intent.putExtra("Lev", levelOfWord);
                intent.putExtra("Reg", Word.RegimLearning);
                intent.putExtra("ThemeOfPlay", Word.themeTravel);
                startActivity(intent);

            }
        };
        travellingThemes.setOnClickListener(onClickListenerImageTravelling);

        View.OnClickListener onClickListenerImageFurniture = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_themes.this, Theory.class);
                intent.putExtra("Lev", levelOfWord);
                intent.putExtra("Reg", Word.RegimLearning);
                intent.putExtra("ThemeOfPlay", Word.themeFurniture);
                startActivity(intent);

            }
        };
        furnitureThemes.setOnClickListener(onClickListenerImageFurniture);


    }
}