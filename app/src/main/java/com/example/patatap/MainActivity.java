package com.example.patatap;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void playMusic(View view){
        int id;
        id = view.getId();
        String nameID;
        nameID = view.getResources().getResourceEntryName(id);
        int myMusic = getResources().getIdentifier(nameID , "raw" , getPackageName());
        MediaPlayer mediaPlayer = MediaPlayer.create(this,myMusic);
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
