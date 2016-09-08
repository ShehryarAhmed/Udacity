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
public class family extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        final ArrayList<Word1> arrayList = new ArrayList<Word1>();

        arrayList.add(new Word1("әpә", "father", R.drawable.family_father,R.raw.family_father));
        arrayList.add(new Word1("әṭa", "Mother", R.drawable.family_mother,R.raw.family_mother));
        arrayList.add(new Word1("angsi", "son", R.drawable.family_son,R.raw.family_son));
        arrayList.add(new Word1("tune", "daughter", R.drawable.family_daughter,R.raw.family_daughter));
        arrayList.add(new Word1("taachi", "older brother\n", R.drawable.family_older_brother,R.raw.family_older_brother));
        arrayList.add(new Word1("chalitti", "younger brother\n", R.drawable.family_younger_brother,R.raw.family_younger_brother));
        arrayList.add(new Word1("teṭe", "older sister\n", R.drawable.family_older_sister,R.raw.family_older_sister));
        arrayList.add(new Word1("kolliti", "younger sister\n", R.drawable.family_younger_sister,R.raw.family_younger_sister));
        arrayList.add(new Word1("ama", "grandmother\n", R.drawable.family_grandmother,R.raw.family_grandmother));
        arrayList.add(new Word1("paapa", "grandfather", R.drawable.family_grandfather,R.raw.family_grandmother));


        WordAdapter0 wordAdapter = new WordAdapter0(this, arrayList, R.color.color_family);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word1 word1 = arrayList.get(position);
                mediaPlayer = MediaPlayer.create(family.this,word1.getAudio_resource_id());
                mediaPlayer.start();
            }
        });
    }}