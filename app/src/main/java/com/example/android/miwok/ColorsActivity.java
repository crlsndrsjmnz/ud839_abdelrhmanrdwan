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

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<word> colors = new ArrayList<word>();
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_red));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_dusty_yellow));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_brown));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_mustard_yellow));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_white));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_green));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_black));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_red));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_dusty_yellow));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_brown));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_mustard_yellow));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_white));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_green));
        colors.add(new word("red", "weṭeṭṭi",R.drawable.color_black));

        wordAdapter colorsadapter = new wordAdapter(this, colors,R.color.category_colors);
        ListView colorslist = (ListView) findViewById(R.id.colors_list);
        colorslist.setAdapter(colorsadapter);
        colorslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ColorsActivity.this,"XXXXXcolorXXXXX",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
