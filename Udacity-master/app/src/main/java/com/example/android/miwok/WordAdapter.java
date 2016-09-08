package com.example.android.miwok;

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
 * Created by android on 9/2/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    private int backColor = 0;
    public WordAdapter(Activity context, ArrayList<Word> Word,int color) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context, 0, Word);
        backColor = color;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word word = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miowkTextView = (TextView) listItemView.findViewById(R.id.miowkWord);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miowkTextView.setText(word.getMiwokWord());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView engTextView = (TextView) listItemView.findViewById(R.id.engWord);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        engTextView.setText(word.getEnglishWord());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if(word.hasimage()) {
            imageView.setImageResource(word.getImage_id());
            // Return the whole list item layout (cont
            // aining 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
        //make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            //otherwise Hide Image
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.list_item);
        int currentColor = ContextCompat.getColor(getContext(),backColor);
        textContainer.setBackgroundColor(currentColor);
            return listItemView;
    }

}
