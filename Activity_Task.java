package com.example.androiduniversitypr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Activity_Task extends AppCompatActivity {
    int level;
    String regime;
    String themeOfPlaying;
    EditText edit;
    Word w;
    TextView  translateTextView;
    ImageView imageView;
    String imageName;
    int index;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        Intent intent = getIntent();
        index = intent.getIntExtra("EngWord",0);
         w = Theory.listOfCurrentWords.get(index);
         imageName = w.referenceImage;
        imageView = findViewById(R.id.imageView2);
        int imageID = getResources().getIdentifier(imageName, "drawable", getPackageName());
        imageView.setImageResource(imageID);
       // imageView.setImageResource((imageName));
        TextView russianW = findViewById(R.id.textView2);
        russianW.setText(w.getRussian());
        translateTextView =  findViewById(R.id.textView);



//        level = intent.getIntExtra("Lev",0);
//        regime = intent.getStringExtra("Reg");
//        themeOfPlaying = intent.getStringExtra("ThemeOfPlay");
//        listOfCurrentWords = new ArrayList<>();
//        listOfCurrentWords.clear();
//        if (regime.equals(Word.RegimRepeat)) {
//            /////
//        } else {
//
//                for(Word k:MainActivity.words){
//                    if(themeOfPlaying.equals(Word.allThemes)){
//                        if(k.getLevel()==level){
//                            listOfCurrentWords.add(k);
//                        }
//                    } else{
//                        if(k.getLevel()==level&&k.getTheme().equals(themeOfPlaying)){
//                            listOfCurrentWords.add(k);
//                    }
//                    }
//
//                }
//        }
//        ///Рандомно будет выбираться слово из коллекции


    }


    public void Check(View view) {
        edit =  findViewById(R.id.editTextTextPersonName);
        String answer = String.valueOf(edit.getText());
        if(answer.equals(w.getEnglish())){
            Intent intent = new Intent(Activity_Task.this, ActivityTaskCards.class);
            intent.putExtra("EngWord",index);
            startActivity(intent);
        }else{
            translateTextView.setText("Неверный перевод. Попробуйте заново");


        }

    }

    public void CancelActivity(View view) {
        Intent intent = new Intent(Activity_Task.this, MainActivity.class);
        startActivity(intent);
    }
}
