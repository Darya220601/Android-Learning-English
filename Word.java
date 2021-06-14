package com.example.androiduniversitypr;

public class Word { //Коллекция из слов
    protected String english;
    protected  String russian;
    protected String referenceImage;
    protected  String text;
    protected int level;
    protected int attempts;
    //ответы
    protected String theme;
    protected static String themeTravel = "t";
    protected static String allThemes = "all";
    protected static String themeFurniture = "f";
    protected static String RegimLearning = "l";
    protected static String RegimRepeat = "r";



    public Word(String english, String russian, String referenceImage, String text, int level, int attempts,  String theme) {
        this.english = english;
        this.russian = russian;
        this.referenceImage = referenceImage;
        this.text = text;
        this.level = level;
        this.attempts = attempts;

        this.theme = theme;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    public String getReferenceImage() {
        return referenceImage;
    }

    public void setReferenceImage(String referenceImage) {
        this.referenceImage = referenceImage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }



    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    //Конструктор
    //Set get

}
