package com.example.opensourceapp_5weeks;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class project5_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project5_3);
        
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(255,255,255));
        setContentView(baseLayout, params);
        EditText edt = new EditText(this);
        edt.setText("project5_3");
        baseLayout.addView(edt);

        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.rgb(255,255,0));
        btn.setLayoutParams(new LinearLayout.LayoutParams(1100, 150));
        baseLayout.addView(btn);
        TextView txt = new TextView(this);
        txt.setTextSize(30);
        txt.setTextColor(Color.BLUE);
        baseLayout.addView(txt);
        TextView txt2 = new TextView(this);
        txt2.setTextSize(20);
        txt2.setTextColor(Color.rgb(150,150,150));
        txt2.setText("2018038028 민선홍");
        baseLayout.addView(txt2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String low = edt.getText().toString();
                txt.setText(low);
            }
        });
    }
}