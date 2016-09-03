package com.example.android.miwok;

/**
 * Created by Abdulrhman on 28/08/2016.
 */

public class word {



    private String EnglishWord;
    private String MiwokWord;
    final private int NOT_HAS_IMAGE = -1;
    private int imageResourseId = NOT_HAS_IMAGE;
   private int audioID;




    public word(String EnglishWord, String MiwokWord, int imageResourseId, int audioID) {
        this.EnglishWord = EnglishWord;
        this.MiwokWord = MiwokWord;
        this.imageResourseId = imageResourseId;
        this.audioID=audioID;
    }
    public word(String EnglishWord, String MiwokWord, int imageResourseId) {
        this.EnglishWord = EnglishWord;
        this.MiwokWord = MiwokWord;
        this.imageResourseId = imageResourseId;
        this.audioID=audioID;
    }

    public word(String EnglishWord, String MiwokWord) {
        this.EnglishWord = EnglishWord;
        this.MiwokWord = MiwokWord;
    }

    public void setAudioID(int audioID) {this.audioID = audioID;}

    public int getAudioID() {return audioID;}

    public void setImage(int image) {this.imageResourseId = image;}

    public int getImage() {return imageResourseId;}

    public void setEnglishWord(String englishWord) {
        EnglishWord = englishWord;
    }

    public String getEnglishWord() {
        return EnglishWord;
    }

    public void setMiwokWord(String miwokWord) {
        MiwokWord = miwokWord;
    }

    public String getMiwokWord() {
        return MiwokWord;
    }

    public boolean hasImage() {
        return imageResourseId != NOT_HAS_IMAGE;
    }



}
