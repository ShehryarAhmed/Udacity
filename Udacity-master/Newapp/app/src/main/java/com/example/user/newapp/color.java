package com.example.user.newapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by user on 9/7/2016.
 */
public class color extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<Word1> arrayList = new ArrayList<Word1>();

        arrayList.add(new Word1("weṭeṭṭi","red",R.drawable.color_red));
        arrayList.add(new Word1("chokokki","green",R.drawable.color_green));
        arrayList.add(new Word1("ṭakaakki","brown",R.drawable.color_brown));
        arrayList.add(new Word1("ṭopoppi","gray",R.drawable.color_gray));
        arrayList.add(new Word1("kululli","black",R.drawable.color_black));
        arrayList.add(new Word1("kelelli","white",R.drawable.color_white));
        arrayList.add(new Word1("ṭopiisә","dusty yellow",R.drawable.color_dusty_yellow));
        arrayList.add(new Word1("chiwiiṭә","mustard yellow",R.drawable.color_mustard_yellow));



        WordAdapter0 wordAdapter = new WordAdapter0(this,arrayList,R.color.color_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}

