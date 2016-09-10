package com.example.android.newmiowk;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

/**
 * Created by android on 9/9/2016.
 */
public class Colors extends AppCompatActivity
{

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

        arrayList.add(new ItemInListView("weṭeṭṭi","red",R.drawable.color_red,R.raw.color_red));
        arrayList.add(new ItemInListView("chokokki","green",R.drawable.color_green,R.raw.color_green));
        arrayList.add(new ItemInListView("ṭakaakki","brown",R.drawable.color_brown,R.raw.color_brown));
        arrayList.add(new ItemInListView("ṭopoppi","gray",R.drawable.color_gray,R.raw.color_gray));
        arrayList.add(new ItemInListView("kululli","black",R.drawable.color_black,R.raw.color_black));
        arrayList.add(new ItemInListView("kelelli","white",R.drawable.color_white,R.raw.color_white));
        arrayList.add(new ItemInListView("ṭopiisә","dusty yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        arrayList.add(new ItemInListView("chiwiiṭә","mustard yellow",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));



        AdapterView adapterView = new AdapterView(this,arrayList,R.color.color_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
                ItemInListView itemInListView = arrayList.get(position);
                release();
                mediaPlayer = MediaPlayer.create(Colors.this,itemInListView.getAudio_resource_id());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(monCompletionListener);
            }
        });
        listView.setAdapter(adapterView);

    }
}



