package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mtv_4;
    private TextView mtv_5;
    private TextView mtv_6;
    private TextView mtv_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);
        //中划线及处理锯齿
        mtv_4 = findViewById(R.id.tv_4);
        mtv_4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mtv_4.getPaint().setAntiAlias(true);//去中划线造成的锯齿
        //下划线
        mtv_5 = findViewById(R.id.tv_5);
        mtv_5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
        //Html显示文本及属性
        mtv_6 = findViewById(R.id.tv_6);
        mtv_6.setText(Html.fromHtml("<p style = \"color:red;font-size:48px;\"><u>杰哥不要啊</u></p>"));
        //跑马灯必须
        mtv_7 = findViewById(R.id.tv_7);
        mtv_7.setSelected(true);
    }
}