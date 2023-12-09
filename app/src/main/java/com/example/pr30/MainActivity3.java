package com.example.pr30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void onClickStart(View view) {
        startService(new Intent("ru.start-android.develop.p0942servicekillserver.MyService").putExtra("name", "value"));

    }
}