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

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    MediaPlayer sond;

    @Override
    public String toString() {
        return "NumbersActivity{" +
                "sond=" + sond +
                '}';

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

      final   ArrayList<word> names = new ArrayList<word>();

        names.add(new word("one","lutti",R.drawable.number_one, R.raw.number_one));
        names.add(new word("two","otiiko",R.drawable.number_two, R.raw.number_two));
        names.add(new word("three","tolookosu",R.drawable.number_three, R.raw.number_three));
        names.add(new word("four","oyyisa",R.drawable.number_four, R.raw.number_four));
        names.add(new word("five","massokka",R.drawable.number_five, R.raw.number_five));
        names.add(new word("six","temmokka",R.drawable.number_six, R.raw.number_six));
        names.add(new word("seven","kenekaku",R.drawable.number_seven, R.raw.number_seven));
        names.add(new word("eight","kawinta",R.drawable.number_eight, R.raw.number_eight));
        names.add(new word("nine","wo’e",R.drawable.number_nine, R.raw.number_nine));
        names.add(new word("ten","na’aacha",R.drawable.number_ten, R.raw.number_ten));
        names.add(new word("one","lutti",R.drawable.number_one, R.raw.number_one));
        names.add(new word("two","otiiko",R.drawable.number_two, R.raw.number_two));
        names.add(new word("three","tolookosu",R.drawable.number_three, R.raw.number_three));
        names.add(new word("four","oyyisa",R.drawable.number_four, R.raw.number_four));
        names.add(new word("five","massokka",R.drawable.number_five, R.raw.number_five));
        names.add(new word("six","temmokka",R.drawable.number_six, R.raw.number_six));
        names.add(new word("seven","kenekaku",R.drawable.number_seven, R.raw.number_seven));
        names.add(new word("eight","kawinta",R.drawable.number_eight, R.raw.number_eight));
        names.add(new word("nine","wo’e",R.drawable.number_nine, R.raw.number_nine));
        names.add(new word("ten","na’aacha",R.drawable.number_ten, R.raw.number_ten));
        names.add(new word("one","lutti",R.drawable.number_one, R.raw.number_one));
        names.add(new word("two","otiiko",R.drawable.number_two, R.raw.number_two));
        names.add(new word("three","tolookosu",R.drawable.number_three, R.raw.number_three));
        names.add(new word("four","oyyisa",R.drawable.number_four, R.raw.number_four));
        names.add(new word("five","massokka",R.drawable.number_five, R.raw.number_five));
        names.add(new word("six","temmokka",R.drawable.number_six, R.raw.number_six));
        names.add(new word("seven","kenekaku",R.drawable.number_seven, R.raw.number_seven));
        names.add(new word("eight","kawinta",R.drawable.number_eight, R.raw.number_eight));
        names.add(new word("nine","wo’e",R.drawable.number_nine, R.raw.number_nine));
        names.add(new word("ten","na’aacha",R.drawable.number_ten, R.raw.number_ten));


      //  ArrayAdapter<word> itemsAdapter = new ArrayAdapter<word>(this, names);
        wordAdapter itemsAdapter = new wordAdapter(this, names,R.color.category_numbers);


        final ListView listView = (ListView)findViewById(R.id.gridview);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                word wordobject = names.get(position);
                sond = MediaPlayer.create(NumbersActivity.this,wordobject.getAudioID());
                sond.start();
                String x = listView.toString();
                Log.v("listView",x);


//                if (sond==null){sond= MediaPlayer.create(NumbersActivity.this,R.raw.number_one );
//
//                    sond.start();}
//                else if (sond.isPlaying()){}
//                else {sond.start();}


            }
        });


    }


        }





