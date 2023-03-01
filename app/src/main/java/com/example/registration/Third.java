package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Third extends AppCompatActivity {
    Button b1,b2,b3,b6,b7,b8,b9;
    FirebaseAuth fa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1=(Button) findViewById(R.id.button506);
        b2=(Button) findViewById(R.id.button501);
        b3=(Button) findViewById(R.id.button502);
        b6=(Button) findViewById(R.id.button503);
        b7=(Button) findViewById(R.id.button504);
        b8=(Button) findViewById(R.id.button505);
        b9=(Button) findViewById(R.id.button500);
        fa=FirebaseAuth.getInstance();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fa.signOut();
                Intent i5=new Intent(Third.this,MainActivity.class);
                startActivity(i5);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(Third.this, WifiP.class);
                startActivity(i6);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9 = new Intent(Third.this, TorchP.class);
                startActivity(i9);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12 = new Intent(Third.this, CalcP.class);
                startActivity(i12);
                finish();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i15 = new Intent(Third.this, MusicPlayerP.class);
                startActivity(i15);
                finish();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i15 = new Intent(Third.this, TexttspeechP.class);
                startActivity(i15);
                finish();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i22 = new Intent(Third.this, BluetoothP.class);
                startActivity(i22);
                finish();
            }
        });

    }
}