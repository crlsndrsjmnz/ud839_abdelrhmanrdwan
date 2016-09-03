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

public class FamilyActivity extends AppCompatActivity {

    MediaPlayer sond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<word> family = new ArrayList<word>();
        family.add(new word("grandfather", "...omef",R.drawable.family_grandfather, R.raw.family_grandfather));
        family.add(new word("father", "omef",R.drawable.family_grandmother));
        family.add(new word("father", "omef",R.drawable.family_father));
        family.add(new word("father", "omef",R.drawable.family_mother));
        family.add(new word("father", "omef",R.drawable.family_older_brother));
        family.add(new word("father", "omef",R.drawable.family_younger_brother));
        family.add(new word("father", "omef",R.drawable.family_older_sister));
        family.add(new word("father", "omef",R.drawable.family_younger_sister));
        family.add(new word("father", "omef",R.drawable.family_son));
        family.add(new word("father", "omef",R.drawable.family_daughter));
        wordAdapter familyadapter = new wordAdapter(this, family,R.color.category_family);
        final ListView familylist = (ListView) findViewById(R.id.family_list);
        familylist.setAdapter(familyadapter);

        familylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                word wordobject = (word) parent.getItemAtPosition(position);
                sond = MediaPlayer.create(FamilyActivity.this,wordobject.getAudioID());
                sond.start();
                String x = familylist.toString();
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
