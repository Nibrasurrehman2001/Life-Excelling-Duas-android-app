package com.example.lifeexcellingduas;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class leavinghome extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button play,pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leavinghome);
        mediaPlayer = MediaPlayer.create(this, R.raw.homeleave);

        play = (Button)findViewById(R.id.play);
        pause =(Button) findViewById(R.id.pause);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });

    }
}