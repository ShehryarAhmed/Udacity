package com.example.user.newapp;

import android.content.Intent;
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
        TextView Colors = (TextView) findViewById(R.id.color);

        Colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,color.class);
                startActivity(i);
            }
        });

        TextView Phrases = (TextView) findViewById(R.id.phrases);

        Phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,pharses.class);
                startActivity(i);
            }
        });

        TextView Family = (TextView) findViewById(R.id.family);
        Family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,family.class);
                startActivity(i);
            }
        });

        TextView Number = (TextView) findViewById(R.id.number);
        Number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Numbers.class);
                startActivity(i);
            }
        });

    }



}
