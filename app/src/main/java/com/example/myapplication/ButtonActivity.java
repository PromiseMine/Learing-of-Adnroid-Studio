package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mbtn_6;
    private TextView mtv_7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mbtn_6 = findViewById(R.id.btn_6);
        mbtn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "按钮六点击成功!(3.5秒后消失)", Toast.LENGTH_LONG).show();
            }
        });

        mtv_7 = findViewById(R.id.tv_7);
        mtv_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "可点击文本点击成功!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //点击唤起Toast消息提示事件（一般不这么写）
    public void showToast(View view) {
        Toast.makeText(this, "按钮五点击成功!(2秒后消失)", Toast.LENGTH_SHORT).show();
    }


}