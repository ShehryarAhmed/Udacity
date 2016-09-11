package com.example.android.newmiowk;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Numbers
        final TextView Color = (TextView) findViewById(R.id.color);

        Color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Colors.class);
                i.putExtra(Colors.KEY_COLORS,"Colors");
                startActivity(i);
            }
        });

        final TextView Phrase = (TextView) findViewById(R.id.phrases);

        Phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Phrases.class);
                i.putExtra(Phrases.KEY_PHRASES,"Phrases");
                startActivity(i);
            }
        });

        TextView Family = (TextView) findViewById(R.id.family);
        Family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,FamilyNames.class);
                i.putExtra(FamilyNames.KEY_FAMILY,"FamilyNames");
                startActivity(i);
            }
        });

        TextView Number = (TextView) findViewById(R.id.number);
        Number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Numbers.class);
                i.putExtra(Numbers.KEY_NUMBERS,"Numbers");

                startActivity(i);
            }
        });

    }



}

