package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TorchP extends AppCompatActivity {
    Button b1,b2,b3;
    CameraManager cameraManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch_p);
        b1=(Button) findViewById(R.id.button31);
        b2=(Button) findViewById(R.id.button32);
        b3=(Button) findViewById(R.id.button33);
        cameraManager=(CameraManager) getApplicationContext().getSystemService(CAMERA_SERVICE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String id=cameraManager.getCameraIdList()[0];
                    cameraManager.setTorchMode(id,true);
                }
                catch (CameraAccessException e){
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String id2=cameraManager.getCameraIdList()[0];
                    cameraManager.setTorchMode(id2,false);
                }
                catch(CameraAccessException e){

                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i21 = new Intent(TorchP.this, Third.class);
                startActivity(i21);
                finish();
            }
        });

    }
}