package com.example.android.newmiowk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

/**
 * Created by android on 9/9/2016.
 */
public class Numbers extends AppCompatActivity  {
    public static final String KEY_NUMBERS = "number_key";
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
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        {

            Intent ii = getIntent();
            String s = ii.getStringExtra(KEY_NUMBERS);
            setTitle(s);
               //Creat ArrayList
            final ArrayList<ItemInListView> arrayList = new ArrayList<ItemInListView>();

            arrayList.add(new ItemInListView("Luuti","One",R.drawable.number_one,R.raw.number_one));
            arrayList.add(new ItemInListView("otiiko","Two",R.drawable.number_two,R.raw.number_two));
            arrayList.add(new ItemInListView("tolookosu","Three",R.drawable.number_three,R.raw.number_three));
            arrayList.add(new ItemInListView("oyyisa","Four",R.drawable.number_four,R.raw.number_four));
            arrayList.add(new ItemInListView("massokka","Five",R.drawable.number_five,R.raw.number_five));
            arrayList.add(new ItemInListView("temmokka","Six",R.drawable.number_six,R.raw.number_six));
            arrayList.add(new ItemInListView("kenekaku","Seven",R.drawable.number_seven,R.raw.number_seven));
            arrayList.add(new ItemInListView("kawinta","Eight",R.drawable.number_eight,R.raw.number_eight));
            arrayList.add(new ItemInListView("wo’e","Nine",R.drawable.number_nine,R.raw.number_nine));
            arrayList.add(new ItemInListView("na’aacha","Ten",R.drawable.number_ten,R.raw.number_ten));



            AdapterView adapterView = new AdapterView(this,arrayList,R.color.color_Numbers);
            ListView listView = (ListView) findViewById(R.id.list);


            listView.setAdapter(adapterView);
            listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
                    ItemInListView itemInListView = arrayList.get(position);
                    release();
                    mediaPlayer = MediaPlayer.create(Numbers.this,itemInListView.getAudio_resource_id());
                    //release media player to play next sound

                    mediaPlayer.start();
                    //setup a listner on the media players so that we can stop and release the
                    //media player once the sound has  finished playing.
                    mediaPlayer.setOnCompletionListener(monCompletionListener);
                }
            });
        }
    }
}