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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> arrayList = new ArrayList<Word>();

        arrayList.add(new Word("әpә","father",R.drawable.family_father));
        arrayList.add(new Word("әṭa","Mother",R.drawable.family_mother));
        arrayList.add(new Word("angsi","son",R.drawable.family_son));
        arrayList.add(new Word("tune","daughter",R.drawable.family_daughter));
        arrayList.add(new Word("taachi","older brother\n",R.drawable.family_older_brother));
        arrayList.add(new Word("chalitti","younger brother\n",R.drawable.family_younger_brother));
        arrayList.add(new Word("teṭe","older sister\n",R.drawable.family_older_sister));
        arrayList.add(new Word("kolliti","younger sister\n",R.drawable.family_younger_sister));
        arrayList.add(new Word("ama","grandmother\n",R.drawable.family_grandmother));
        arrayList.add(new Word("paapa","grandfather",R.drawable.family_grandfather));



        WordAdapter wordAdapter = new WordAdapter(this,arrayList,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(wordAdapter);
    }
}
