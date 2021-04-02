package com.example.raddom23032021;


import  android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;



public class MainActivity extends Activity {
    EditText mA;
    EditText mB;
    TextView mKQ;
    Button mCong, mTru, mNhan, mChia, mRs, mRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2: Ánh xạ;
        mA = findViewById(R.id.a);
        mB= findViewById(R.id.b);
        mKQ = findViewById(R.id.kq);
        mCong = findViewById(R.id.cong);
        mTru = findViewById(R.id.tru);
        mNhan = findViewById(R.id.nhan);
        mChia = findViewById(R.id.chia);
        mRs = findViewById(R.id.rs);
        mRandom = findViewById(R.id.random);

        //Phep cong
        mCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((mA.getText().toString().equals("")) || (mB.getText().toString().equals(""))) {
                    Toast.makeText(MainActivity.this,"Please enter A and B", Toast.LENGTH_LONG).show();
                }
                else {
                    int a = Integer.parseInt(mA.getText().toString());
                    int b = Integer.parseInt(mB.getText().toString());
                    int temp = a + b;
                    String res = mA.getText().toString() + " + " + mB.getText().toString() + " = " + (temp);
                    mKQ.setText(res);
                }
            }
        });

        //Phep tru
        mTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((mA.getText().toString().equals("")) || (mB.getText().toString().equals(""))) {
                    Toast.makeText(MainActivity.this,"Please enter A and B", Toast.LENGTH_LONG).show();
                }
                else {
                    int a = Integer.parseInt(mA.getText().toString());
                    int b = Integer.parseInt(mB.getText().toString());
                    int temp = a - b;
                    String res = mA.getText().toString() + " - " + mB.getText().toString() + " = " + (temp);
                    mKQ.setText(res);
                }
            }
        });

        //Phep nhan
        mNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((mA.getText().toString().equals("")) || (mB.getText().toString().equals(""))) {
                    Toast.makeText(MainActivity.this,"Please enter A and B", Toast.LENGTH_LONG).show();
                }
                else {
                    int a = Integer.parseInt(mA.getText().toString());
                    int b = Integer.parseInt(mB.getText().toString());
                    int temp = a * b;
                    String res = mA.getText().toString() + " * " + mB.getText().toString() + " = " + (temp);
                    mKQ.setText(res);
                }
            }
        });

        //Phep chia
        mChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((mA.getText().toString().equals("")) || (mB.getText().toString().equals(""))) {
                    Toast.makeText(MainActivity.this,"Please enter A and B", Toast.LENGTH_LONG).show();
                }
                else {
                    int a = Integer.parseInt(mA.getText().toString());
                    int b = Integer.parseInt(mB.getText().toString());
                    int temp = a / b;
                    String res = mA.getText().toString() + " / " + mB.getText().toString() + " = " + (temp);
                    mKQ.setText(res);
                }
            }
        });

        //reset
        mRs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mA.setText("");
                mB.setText("");
                mKQ.setText("");
                Toast.makeText(MainActivity.this, "You reseted successful", LENGTH_LONG).show();
            }
        });

        //chuyen qua màn hình random
        mRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Random.class);
                startActivity(intent);
            }
        });


    }

}