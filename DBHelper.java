package com.example.androiduniversitypr;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION =1;
    public static final String DATABASE_NAME = "EnglishWordsDB";
    public static final String TABLE_WORDS = "Words";

    public static final String WORD_ENGLISH ="english";
    public static final String WORD_RUSSIAN ="russian";
    public static final String WORD_IMAGE ="referenceImage";
    public static final String WORD_TEXT ="text";
    public static final String WORD_LEVEL ="level";
    public static final String WORD_ATTEMPTS ="attempts";
    public static final String WORD_THEME ="theme";

    public DBHelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL("create table "+ TABLE_WORDS + "("+WORD_ENGLISH
+"text primary key," + WORD_RUSSIAN+ " text,"+
        WORD_IMAGE+ " text,"+ WORD_TEXT+ " text,"+
        WORD_LEVEL+ " integer,"+ WORD_ATTEMPTS+ " integer,"+ WORD_THEME+ " text"+")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL("drop table if exists "+TABLE_WORDS);
onCreate(db);
    }
}
