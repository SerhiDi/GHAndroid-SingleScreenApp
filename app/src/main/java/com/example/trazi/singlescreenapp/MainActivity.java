package com.example.trazi.singlescreenapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.tmnt80sthemesong);
        play();
    }

    public void play() {
        if (mp.isPlaying()) {
            mp.seekTo(0);
            mp.pause();
        } else {
            mp.start();
        }
    }
}
