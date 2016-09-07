package com.example.android.miwok;

/**
 * Created by android on 9/2/2016.
 */
public class Word {
    private String EnglishWord;
    private String MiwokWord;
    private int image_id = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    Word(final String englishWord,final  String miwokWord){
        this.EnglishWord = englishWord;
        this.MiwokWord = miwokWord;
    }
    Word(final String englishWord,final  String miwokWord,final int Image_id){
        this.EnglishWord = englishWord;
        this.MiwokWord = miwokWord;
        this.image_id = Image_id;
    }
    public String getEnglishWord(){
        return EnglishWord;
    }
    public  String getMiwokWord(){
        return MiwokWord;
    }

    public int getImage_id() {
        return image_id;
    }
    public boolean hasimage(){
        return image_id != NO_IMAGE_PROVIDED;
    }
}
