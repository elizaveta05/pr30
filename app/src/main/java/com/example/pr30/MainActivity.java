package com.example.pr30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {
   Button button, btnStart, btnStop;

    final String LOG_TAG="myLogs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        btnStart = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);
    }


    public void onClickStart(View view) {
        startService(new Intent(this, My_Service.class));
    }

    public void onClickStop(View view) {
        stopService(new Intent(this, My_Service.class));
    }

    public void sled(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}