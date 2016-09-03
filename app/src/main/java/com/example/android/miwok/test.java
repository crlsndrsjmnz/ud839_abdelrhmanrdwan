package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class test extends AppCompatActivity {



    MediaPlayer rise ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


            //  rise = MediaPlayer.create(this,R.raw.rise );
        final Button riseplay = (Button)findViewById(R.id.play);
        Button risepuse = (Button)findViewById(R.id.puse);
        Button risereset= (Button)findViewById(R.id.reset) ;

        riseplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rise==null){rise= MediaPlayer.create(test.this,R.raw.rise );
                rise.start();}
                else if (rise.isPlaying()){}
                else {rise.start();}

            }
        });

        risepuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rise.isPlaying()){rise.pause();}
                else {}
            }
        });

        risereset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = rise.getCurrentPosition();
                rise.seekTo(pos*2);
            rise.release();
            rise=null;
            }
        });


    }



}
