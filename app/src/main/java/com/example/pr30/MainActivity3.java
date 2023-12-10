package com.example.pr30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button = findViewById(R.id.button1);
        button.setOnClickListener(this);
    }

    public void onClickStart(View view) {
       // startService(new Intent("com.example.pr301.MyService").putExtra("name", "value"));
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}
