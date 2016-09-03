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

        arrayList.add(new Word("Luuti","One"));
        arrayList.add(new Word("otiiko","Two"));
        arrayList.add(new Word("tolookosu","Three"));
        arrayList.add(new Word("oyyisa","Four"));
        arrayList.add(new Word("massokka","Five"));
        arrayList.add(new Word("temmokka","Six"));
        arrayList.add(new Word("kenekaku","Seven"));
        arrayList.add(new Word("kawinta","Eight"));
        arrayList.add(new Word("wo’e","Nine"));
        arrayList.add(new Word("na’aacha","Ten"));



        WordAdapter wordAdapter = new WordAdapter(this,arrayList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(wordAdapter);



    }
}
