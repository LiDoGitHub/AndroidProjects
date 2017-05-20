package com.lido.a03_clickevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
        Button btn2= (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"按钮2",Toast.LENGTH_SHORT).show();
            }
        });

        Button btn3= (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new MyClickListener());
    }

    @Override
    public void onClick(View v) {
        //duration 弹出事件,毫秒
        Toast.makeText(MainActivity.this,"按钮1",Toast.LENGTH_SHORT).show();
    }

    //写法不推荐
    public void btn4Click(View view){
        Toast.makeText(MainActivity.this,"按钮4",Toast.LENGTH_SHORT).show();
    }

    class MyClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"按钮3",Toast.LENGTH_SHORT).show();
        }
    }
}


