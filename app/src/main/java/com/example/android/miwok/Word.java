package com.example.android.miwok;

/**
 * Created by android on 9/2/2016.
 */
public class Word {
    private String EnglishWord;
    private String MiwokWord;

    Word(final String englishWord,final  String miwokWord){
        this.EnglishWord = englishWord;
        this.MiwokWord = miwokWord;
    }
    public String getEnglishWord(){
        return EnglishWord;
    }
    public  String getMiwokWord(){
        return MiwokWord;
    }
}
