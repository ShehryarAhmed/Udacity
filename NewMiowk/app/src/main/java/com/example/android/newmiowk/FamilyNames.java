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
public class FamilyNames extends AppCompatActivity {
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

        arrayList.add(new ItemInListView("әpә", "father", R.drawable.family_father,R.raw.family_father));
        arrayList.add(new ItemInListView("әṭa", "Mother", R.drawable.family_mother,R.raw.family_mother));
        arrayList.add(new ItemInListView("angsi", "son", R.drawable.family_son,R.raw.family_son));
        arrayList.add(new ItemInListView("tune", "daughter", R.drawable.family_daughter,R.raw.family_daughter));
        arrayList.add(new ItemInListView("taachi", "older brother\n", R.drawable.family_older_brother,R.raw.family_older_brother));
        arrayList.add(new ItemInListView("chalitti", "younger brother\n", R.drawable.family_younger_brother,R.raw.family_younger_brother));
        arrayList.add(new ItemInListView("teṭe", "older sister\n", R.drawable.family_older_sister,R.raw.family_older_sister));
        arrayList.add(new ItemInListView("kolliti", "younger sister\n", R.drawable.family_younger_sister,R.raw.family_younger_sister));
        arrayList.add(new ItemInListView("ama", "grandmother\n", R.drawable.family_grandmother,R.raw.family_grandmother));
        arrayList.add(new ItemInListView("paapa", "grandfather", R.drawable.family_grandfather,R.raw.family_grandmother));


        AdapterView adapterView = new AdapterView(this, arrayList, R.color.color_family);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapterView);
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
                ItemInListView itemInListView = arrayList.get(position);
                release();
                mediaPlayer = MediaPlayer.create(FamilyNames.this,itemInListView.getAudio_resource_id());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(monCompletionListener);
            }
        });

    }

}
