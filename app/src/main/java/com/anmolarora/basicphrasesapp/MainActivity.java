package com.anmolarora.basicphrasesapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view){

        int id= view.getId(); // to get id of indivisual buttons pressed
        String ourId="";

        ourId = view.getResources().getResourceEntryName(id); // will give us id of object we want to set

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.anmolarora.basicphrasesapp"); // To get id and use audio file

        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();

        Log.i("Button Tapped",ourId);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
