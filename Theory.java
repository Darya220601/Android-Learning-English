package com.example.androiduniversitypr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;


public class Theory extends AppCompatActivity {
        public Word w;
        private int level;
        private String regime;
        private String themeOfPlaying;
        TextView note;
        String imageName;
    int randomIndexInCollection;
        public static ArrayList<Word> listOfCurrentWords;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_theory);
            ImageButton leftImageButton = findViewById(R.id.imageButton4);
            leftImageButton.setEnabled(false);
            leftImageButton.setVisibility(View.INVISIBLE);
            Intent intent = getIntent();
            listOfCurrentWords = new ArrayList<>();
            level = intent.getIntExtra("Lev", 0);
            regime = intent.getStringExtra("Reg");
            themeOfPlaying = intent.getStringExtra("ThemeOfPlay");
            note = findViewById(R.id.textView5);


            for(Word k:MainActivity.words){
                if(themeOfPlaying.equals(Word.allThemes)){
                    if(k.getLevel()==level){
                        listOfCurrentWords.add(k);
                    }
                } else{
                    if(k.getLevel()==level&&k.getTheme().equals(themeOfPlaying)){
                        listOfCurrentWords.add(k);
                    }
                }

            }


            int lowBound = 0;
            int highBound = listOfCurrentWords.size();
            randomIndexInCollection = lowBound + (int) (Math.random() * (highBound - lowBound));
            w = listOfCurrentWords.get(randomIndexInCollection);
            ImageView imageView = findViewById(R.id.imageView);
            //String imageName = w.referenceImage;
            //imageView.setImageResource(R.drawable.(w.referenceImage));
            TextView russianW = findViewById(R.id.textView3);
            russianW.setText(w.getRussian());

            TextView englishW = findViewById(R.id.textView4);
            englishW.setText(w.getEnglish());

            imageName = w.referenceImage;
            imageView = findViewById(R.id.imageView);
            int imageID = getResources().getIdentifier(imageName, "drawable", getPackageName());
            imageView.setImageResource(imageID);
            note.setText(w.getText());

        }
        public void buttonClick(View view) {
            Intent intent2 = new Intent(Theory.this, Activity_Task.class);
            intent2.putExtra("EngWord",randomIndexInCollection);
            startActivity(intent2);

        }


    public void CancelActivity(View view) {
        Intent intent3 = new Intent(Theory.this, MainActivity.class);
        startActivity(intent3);
    }
}

