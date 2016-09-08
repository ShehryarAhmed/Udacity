package com.example.user.newapp;

import android.media.MediaActionSound;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 9/7/2016.
 */
import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
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
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        {
            //Creat ArrayList
            final ArrayList<Word1> arrayList = new ArrayList<Word1>();

            arrayList.add(new Word1("Luuti","One",R.drawable.number_one,R.raw.number_one));
            arrayList.add(new Word1("otiiko","Two",R.drawable.number_two,R.raw.number_two));
            arrayList.add(new Word1("tolookosu","Three",R.drawable.number_three,R.raw.number_three));
            arrayList.add(new Word1("oyyisa","Four",R.drawable.number_four,R.raw.number_four));
            arrayList.add(new Word1("massokka","Five",R.drawable.number_five,R.raw.number_five));
            arrayList.add(new Word1("temmokka","Six",R.drawable.number_six,R.raw.number_six));
            arrayList.add(new Word1("kenekaku","Seven",R.drawable.number_seven,R.raw.number_seven));
            arrayList.add(new Word1("kawinta","Eight",R.drawable.number_eight,R.raw.number_eight));
            arrayList.add(new Word1("wo’e","Nine",R.drawable.number_nine,R.raw.number_nine));
            arrayList.add(new Word1("na’aacha","Ten",R.drawable.number_ten,R.raw.number_ten));



            WordAdapter0 wordAdapter = new WordAdapter0(this,arrayList,R.color.color_Numbers);
            ListView listView = (ListView) findViewById(R.id.list);


            listView.setAdapter(wordAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Word1 word1 = arrayList.get(position);
                    mediaPlayer = MediaPlayer.create(Numbers.this,word1.getAudio_resource_id());
                    //release media player to play next sound
                    release();
                    mediaPlayer.start();
                    //setup a listner on the media players so that we can stop and release the
                    //media player once the sound has  finished playing.
                    mediaPlayer.setOnCompletionListener(monCompletionListener);
                }
            });
        }
    }
}