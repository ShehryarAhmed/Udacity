package com.example.android.newmiowk;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
import android.widget.Adapter;

import java.util.ArrayList;

/**
 * Created by android on 9/9/2016.
 */
public class Phrases extends AppCompatActivity {
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
    protected void onStop() {
        super.onStop();
        release();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);


        final ArrayList<ItemInListView> arrayList = new ArrayList<ItemInListView>();

        arrayList.add(new ItemInListView("minto wuksus","Where are you going?",R.raw.phrase_are_you_coming));
        arrayList.add(new ItemInListView("tinnә oyaase'nә","What is your name?",R.raw.phrase_what_is_your_name));
        arrayList.add(new ItemInListView("oyaaset","My name is...",R.raw.phrase_my_name_is));
        arrayList.add(new ItemInListView("michәksәs?","How are you feeling?",R.raw.phrase_how_are_you_feeling));
        arrayList.add(new ItemInListView("kuchi achit","I’m feeling good.",R.raw.phrase_im_feeling_good));
        arrayList.add(new ItemInListView("әәnәs'aa?","Are you coming?",R.raw.phrase_are_you_coming));
        arrayList.add(new ItemInListView("hәә’ әәnәm","Yes, I’m coming.",R.raw.phrase_yes_im_coming));
        arrayList.add(new ItemInListView("әәnәm"," I’m coming.",R.raw.phrase_im_coming));
        arrayList.add(new ItemInListView("yoowutis","Let’s go.",R.raw.phrase_lets_go));
        arrayList.add(new ItemInListView("әnni'nem","Come here.",R.raw.phrase_come_here));



        AdapterView adapterView = new AdapterView(this,arrayList,R.color.color_pharse);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
                release();

                ItemInListView itemInListView = arrayList.get(position);

                mediaPlayer = MediaPlayer.create(Phrases.this,itemInListView.getAudio_resource_id());

                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(monCompletionListener);

            }
        });
        listView.setAdapter(adapterView);
    }
}
