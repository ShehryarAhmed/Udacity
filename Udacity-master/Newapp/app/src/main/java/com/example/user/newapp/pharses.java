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
public class pharses extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        final ArrayList<Word1> arrayList = new ArrayList<Word1>();

        arrayList.add(new Word1("minto wuksus","Where are you going?",R.raw.phrase_are_you_coming));
        arrayList.add(new Word1("tinnә oyaase'nә","What is your name?",R.raw.phrase_what_is_your_name));
        arrayList.add(new Word1("oyaaset","My name is...",R.raw.phrase_my_name_is));
        arrayList.add(new Word1("michәksәs?","How are you feeling?",R.raw.phrase_how_are_you_feeling));
        arrayList.add(new Word1("kuchi achit","I’m feeling good.",R.raw.phrase_im_feeling_good));
        arrayList.add(new Word1("әәnәs'aa?","Are you coming?",R.raw.phrase_are_you_coming));
        arrayList.add(new Word1("hәә’ әәnәm","Yes, I’m coming.",R.raw.phrase_yes_im_coming));
        arrayList.add(new Word1("әәnәm"," I’m coming.",R.raw.phrase_im_coming));
        arrayList.add(new Word1("yoowutis","Let’s go.",R.raw.phrase_lets_go));
        arrayList.add(new Word1("әnni'nem","Come here.",R.raw.phrase_come_here));



        WordAdapter0 wordAdapter = new WordAdapter0(this,arrayList,R.color.color_pharse);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word1 word1 = arrayList.get(position);
                mediaPlayer = MediaPlayer.create(pharses.this,word1.getAudio_resource_id());
                mediaPlayer.start();

            }
        });
        listView.setAdapter(wordAdapter);
    }
}

