package com.example.user.newapp;

/**
 * Created by user on 9/7/2016.
 */
public class Word1 {

     private String mdefaultlangauge;
     private String mMiowklangauge;
     private int imageid = NO_IMAGE_RESOURCE;
     static final int NO_IMAGE_RESOURCE = -1;
     private int audio_resource_id;
//audio resource id;
    public int getAudio_resource_id() {
        return audio_resource_id;
    }

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
    Word1(String miowkword, String defaultword, int imageid,int audio_resource_id){
        this.mMiowklangauge = miowkword;
        this.mdefaultlangauge = defaultword;
        this.imageid = imageid;
        this.audio_resource_id = audio_resource_id;
        }
    Word1(String miowkword, String defaultword,int audio_resource_id){
        this.mMiowklangauge = miowkword;
        this.mdefaultlangauge = defaultword;
        this.audio_resource_id = audio_resource_id;

    }

    @Override
    public String toString() {
        return "Word1{" +
                "mdefaultlangauge='" + mdefaultlangauge + '\'' +
                ", mMiowklangauge='" + mMiowklangauge + '\'' +
                ", imageid=" + imageid +
                ", audio_resource_id=" + audio_resource_id +
                '}';
    }
}
