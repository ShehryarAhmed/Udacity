package com.example.user.newapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 9/7/2016.
 */
public class WordAdapter0 extends ArrayAdapter<Word1> {
    private int backgroundcolor = 0;
            //check Activity and Context
    WordAdapter0(Activity context, ArrayList<Word1> Word1, int bgcolor){
        super(context,0, Word1);
        backgroundcolor = bgcolor;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    View listitemview = convertView;
        if(listitemview == null){
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        Word1 Word1 = getItem(position);
        TextView miowktextview = (TextView) listitemview.findViewById(R.id.miowkword);
        miowktextview.setText(Word1.getmMiowklangauge());

        TextView defaulttview = (TextView) listitemview.findViewById(R.id.defaultword);
        defaulttview.setText(Word1.getMdefaultlangauge());

        ImageView imageView = (ImageView) listitemview.findViewById(R.id.image_view);
        if(Word1.hasimage()){
            imageView.setImageResource(Word1.getImageid());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listitemview.findViewById(R.id.list_item);
        int currentColor = ContextCompat.getColor(getContext(),backgroundcolor);
        textContainer.setBackgroundColor(currentColor);
        return listitemview;
    }
}
