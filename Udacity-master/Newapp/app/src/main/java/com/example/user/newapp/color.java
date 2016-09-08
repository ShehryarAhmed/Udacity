package com.example.user.newapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by user on 9/7/2016.
 */
public class color extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener monCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            release();
        }
    };
    private void release(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        final ArrayList<Word1> arrayList = new ArrayList<Word1>();

        arrayList.add(new Word1("weṭeṭṭi","red",R.drawable.color_red,R.raw.color_red));
        arrayList.add(new Word1("chokokki","green",R.drawable.color_green,R.raw.color_green));
        arrayList.add(new Word1("ṭakaakki","brown",R.drawable.color_brown,R.raw.color_brown));
        arrayList.add(new Word1("ṭopoppi","gray",R.drawable.color_gray,R.raw.color_gray));
        arrayList.add(new Word1("kululli","black",R.drawable.color_black,R.raw.color_black));
        arrayList.add(new Word1("kelelli","white",R.drawable.color_white,R.raw.color_white));
        arrayList.add(new Word1("ṭopiisә","dusty yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        arrayList.add(new Word1("chiwiiṭә","mustard yellow",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));



        WordAdapter0 wordAdapter = new WordAdapter0(this,arrayList,R.color.color_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word1 word1 = arrayList.get(position);
                mediaPlayer = MediaPlayer.create(color.this,word1.getAudio_resource_id());
                release();
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(monCompletionListener);
            }
        });
        listView.setAdapter(wordAdapter);
    }
}

