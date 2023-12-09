package com.example.pr30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        View button = findViewById(R.id.button1);
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent=new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                return false;
            }
        });
    }
    public void onClickStart(View v) {
        startService(new Intent(this, My_service2.class).putExtra("time", 7));
        startService(new Intent(this, My_service2.class).putExtra("time", 2));
        startService(new Intent(this, My_service2.class).putExtra("time", 4));
    }
}