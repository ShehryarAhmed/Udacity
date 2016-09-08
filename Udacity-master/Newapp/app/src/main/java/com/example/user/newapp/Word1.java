package com.example.user.newapp;

/**
 * Created by user on 9/7/2016.
 */
public class Word1 {

     private String mdefaultlangauge;
     private String mMiowklangauge;
     private int imageid = NO_IMAGE_RESOURCE;
     static final int NO_IMAGE_RESOURCE = -1;


    public String getMdefaultlangauge() {
        return mdefaultlangauge;
    }

    public String getmMiowklangauge() {
        return mMiowklangauge;
    }

    public int getImageid() {
        return imageid;
    }

    public boolean hasimage() {
        return imageid != NO_IMAGE_RESOURCE ;
    }
    Word1(String miowkword, String defaultword, int imageid){
        this.mMiowklangauge = miowkword;
        this.mdefaultlangauge = defaultword;
        this.imageid = imageid;
        }
    Word1(String miowkword, String defaultword){
        this.mMiowklangauge = miowkword;
        this.mdefaultlangauge = defaultword;

    }
}
