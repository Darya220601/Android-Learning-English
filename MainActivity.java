package com.example.androiduniversitypr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MainActivity extends AppCompatActivity {
    ImageView pinkImageView;
    ImageView yellowImageView;
    ImageView purpleImageView;
    Button learn;
    Button repeat;
    Button prof;

    DBHelper dbHelper;

    public static ArrayList<Word> words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pinkImageView = findViewById(R.id.imageViewPink);
        yellowImageView = findViewById(R.id.imageViewYellow);
        purpleImageView = findViewById(R.id.imageViewPurple);
        repeat = findViewById(R.id.buttonRepeat);
        prof = findViewById(R.id.buttonProf);
        learn = findViewById(R.id.buttonLearning);
        learn.setEnabled(false);

        words = new ArrayList<>();

//        dbHelper = new DBHelper(this);
//        SQLiteDatabase database = dbHelper.getWritableDatabase();
       // Cursor c = database.rawQuery("select * from TABLE_WORDS", null);
       // if (c.getCount() == 0) {
            //Создание слов
            Word w1 = new Word("map", "карта", "map", "map in travell", 0, 0, Word.themeTravel);
            Word w2 = new Word("sunglasses", "очки", "sunglasses", "это очки", 0, 0, Word.themeTravel);
            Word w3 = new Word("chair", "стул", "chair", "это стул", 0, 0, Word.themeFurniture);
            Word w4 = new Word("table", "стол", "table", "это стол", 0, 0, Word.themeFurniture);


            Word w5 = new Word("hitchike", "путешествие автостопом", "hitchike", "это путешествует", 2, 0, Word.themeTravel);
            Word w6 = new Word("road", "дорога", "road", "это дорога", 2, 0, Word.themeTravel);
            Word w7 = new Word("sofa", "диван", "sofa", "это диванв", 2, 0, Word.themeFurniture);
            Word w8 = new Word("sink", "раковина", "sink", "это раковина", 2, 0, Word.themeFurniture);

            Word w9 = new Word("ocean", "океан", "ocean", "Это океан", 1, 0, Word.themeTravel);
            Word w10 = new Word("tourist", "турист", "tourist", "Это турист", 1, 0, Word.themeTravel);
            Word w11 = new Word("cabinet", "шкаф", "cabinet", "Это шкаф", 1, 0, Word.themeFurniture);
            Word w12 = new Word("mirror", "зеркало", "mirror", "Это зеркало", 1, 0, Word.themeFurniture);

            words.add(w1);
            words.add(w2);
            words.add(w3);
            words.add(w4);
            words.add(w5);
            words.add(w6);
            words.add(w7);
            words.add(w8);
            words.add(w9);
            words.add(w10);
            words.add(w11);
            words.add(w12);

//            for (Word w : words
//            ) {
//                ContentValues contentValues = new ContentValues();
//                contentValues.put(dbHelper.WORD_ENGLISH, w.english);
//                contentValues.put(dbHelper.WORD_RUSSIAN, w.russian);
//                contentValues.put(dbHelper.WORD_IMAGE, w.referenceImage);
//                contentValues.put(dbHelper.WORD_TEXT, w.text);
//                contentValues.put(dbHelper.WORD_LEVEL, w.level);
//                contentValues.put(dbHelper.WORD_ATTEMPTS, w.attempts);
//                contentValues.put(dbHelper.WORD_THEME, w.theme);
//                database.insert(dbHelper.TABLE_WORDS, null, contentValues);
//            }

       // }






        View.OnClickListener onClickListenerButtonEasy = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Activity_themes.class);
                intent.putExtra("LEVEL", 0);
                startActivity(intent);

            }
        };
        pinkImageView.setOnClickListener(onClickListenerButtonEasy);

        View.OnClickListener onClickListenerButtonMedium = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Activity_themes.class);
                intent.putExtra("LEVEL", 1);
                startActivity(intent);

            }
        };
        yellowImageView.setOnClickListener(onClickListenerButtonMedium);

        View.OnClickListener onClickListenerButtonHard = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Activity_themes.class);
                intent.putExtra("LEVEL", 2);
                startActivity(intent);

            }
        };
        purpleImageView.setOnClickListener(onClickListenerButtonHard);
        View.OnClickListener onClickListenerButtonRepeat = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Activity_Task.class);


                intent.putExtra("LEVEL", 3);
                intent.putExtra("Regime", Word.RegimRepeat);
                startActivity(intent);

            }
        };
        repeat.setOnClickListener(onClickListenerButtonRepeat);

        View.OnClickListener onClickListenerButtonProf = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Prof.class);
                startActivity(intent);
                //сюда тоже нужно будет передавать для статистики

            }
        };
        prof.setOnClickListener(onClickListenerButtonProf);
    }

}