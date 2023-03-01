package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicPlayerP extends AppCompatActivity {
    MediaPlayer mp;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player_p);
        b1=(Button)findViewById(R.id.button24);
        b2=(Button)findViewById(R.id.button25);
        b3=(Button)findViewById(R.id.button27);
        mp=MediaPlayer.create(this,R.raw.y);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i14 = new Intent(MusicPlayerP.this, Third.class);
                startActivity(i14);
                finish();
            }
        });

    }
}