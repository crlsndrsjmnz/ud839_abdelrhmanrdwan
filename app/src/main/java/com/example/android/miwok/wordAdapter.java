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
 * Created by Abdulrhman on 28/08/2016.
 */
public class wordAdapter extends ArrayAdapter<word> {

    private int color;


    public wordAdapter(Activity context, ArrayList<word> arraylistword, int color) {


        super(context, 0, arraylistword);
        this.color = color;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemView = convertView;
        if (itemView == null) {
            //// TODO: 28/08/2016 who is the parent for this view and why ?  
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }

        word currentview = getItem(position);


        TextView englishword = (TextView) itemView.findViewById(R.id.main_text);
        englishword.setText(currentview.getEnglishWord());


        TextView miwokword = (TextView) itemView.findViewById(R.id.sub_txt);
        miwokword.setText(currentview.getMiwokWord());
//        final LinearLayout wordssview = (LinearLayout) itemView.findViewById(R.id.wordsview);
//        wordssview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });


        ImageView image = (ImageView) itemView.findViewById(R.id.image_word);
        if (currentview.hasImage()) {

            image.setImageResource(currentview.getImage());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }
//        image.setFocusableInTouchMode(false);
//        image.setFocusable(false);

        View wordsview = itemView.findViewById(R.id.wordsview);
        final int colorback = ContextCompat.getColor(getContext(), color);
        wordsview.setBackgroundColor(colorback);
//        wordssview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });


        return itemView;

    }
}
