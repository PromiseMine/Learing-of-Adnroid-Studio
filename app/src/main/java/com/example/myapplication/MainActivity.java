package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnToTextView;
    private Button mBtnToButton;
    private Button mBtnToEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//起始页

        //跳转到TextView
        mBtnToTextView = findViewById(R.id.BtnToTextView);//找到控件
        //设置点击事件
        mBtnToTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到TextViewActivity
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });

        //跳转到TextView
        mBtnToButton = findViewById(R.id.BtnToButton);//找到控件
        //设置点击事件
        mBtnToButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到ButtonActivity
                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });

        //跳转到EditText
        mBtnToEditText = findViewById(R.id.BtnToEditText);//找到控件
        //设置点击事件
        mBtnToEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到ButtonActivity
                Intent intent = new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });

    }
}