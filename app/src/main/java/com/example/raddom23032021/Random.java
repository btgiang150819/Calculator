package com.example.raddom23032021;

import androidx.appcompat.app.AppCompatActivity;

import  android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Random extends Activity {
    TextView mKQ;
    Button mRandom, mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        //tìm kiếm bằng id
        mKQ = findViewById(R.id.kq);
        mRandom = findViewById(R.id.random);
        mBack = findViewById(R.id.back);

        //setonclick cho sự kiện random
        mRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                java.util.Random rd = new java.util.Random();
                int number = rd.nextInt(100);
                String res = String.valueOf(number);
                mKQ.setText(res);
            }
        });
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Random.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}