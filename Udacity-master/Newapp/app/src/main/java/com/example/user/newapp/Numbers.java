package com.example.user.newapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by user on 9/7/2016.
 */
import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        {
            //Creat ArrayList
            ArrayList<Word1> arrayList = new ArrayList<Word1>();

            arrayList.add(new Word1("Luuti","One",R.drawable.number_one));
            arrayList.add(new Word1("otiiko","Two",R.drawable.number_two));
            arrayList.add(new Word1("tolookosu","Three",R.drawable.number_three));
            arrayList.add(new Word1("oyyisa","Four",R.drawable.number_four));
            arrayList.add(new Word1("massokka","Five",R.drawable.number_five));
            arrayList.add(new Word1("temmokka","Six",R.drawable.number_six));
            arrayList.add(new Word1("kenekaku","Seven",R.drawable.number_seven));
            arrayList.add(new Word1("kawinta","Eight",R.drawable.number_eight));
            arrayList.add(new Word1("wo’e","Nine",R.drawable.number_nine));
            arrayList.add(new Word1("na’aacha","Ten",R.drawable.number_ten));



            WordAdapter0 wordAdapter = new WordAdapter0(this,arrayList,R.color.color_Numbers);
            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(wordAdapter);
        }
    }
}