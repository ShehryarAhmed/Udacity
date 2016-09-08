package com.example.user.newapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by user on 9/7/2016.
 */
public class pharses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        ArrayList<Word1> arrayList = new ArrayList<Word1>();

        arrayList.add(new Word1("minto wuksus","Where are you going?"));
        arrayList.add(new Word1("tinnә oyaase'nә","What is your name?"));
        arrayList.add(new Word1("oyaaset","My name is..."));
        arrayList.add(new Word1("michәksәs?","How are you feeling?"));
        arrayList.add(new Word1("kuchi achit","I’m feeling good."));
        arrayList.add(new Word1("әәnәs'aa?","Are you coming?"));
        arrayList.add(new Word1("hәә’ әәnәm","Yes, I’m coming."));
        arrayList.add(new Word1("әәnәm"," I’m coming."));
        arrayList.add(new Word1("yoowutis","Let’s go."));
        arrayList.add(new Word1("әnni'nem","Come here."));



        WordAdapter0 wordAdapter = new WordAdapter0(this,arrayList,R.color.color_pharse);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
    }
}

