/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Creat ArrayList
        ArrayList<Word> arrayList = new ArrayList<Word>();

        arrayList.add(new Word("Luuti","One",R.drawable.number_one));
        arrayList.add(new Word("otiiko","Two",R.drawable.number_two));
        arrayList.add(new Word("tolookosu","Three",R.drawable.number_three));
        arrayList.add(new Word("oyyisa","Four",R.drawable.number_four));
        arrayList.add(new Word("massokka","Five",R.drawable.number_five));
        arrayList.add(new Word("temmokka","Six",R.drawable.number_six));
        arrayList.add(new Word("kenekaku","Seven",R.drawable.number_seven));
        arrayList.add(new Word("kawinta","Eight",R.drawable.number_eight));
        arrayList.add(new Word("wo’e","Nine",R.drawable.number_nine));
        arrayList.add(new Word("na’aacha","Ten",R.drawable.number_ten));



        WordAdapter wordAdapter = new WordAdapter(this,arrayList,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(wordAdapter);



    }
}
