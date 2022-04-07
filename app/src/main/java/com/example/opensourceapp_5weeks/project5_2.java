package com.example.opensourceapp_5weeks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class project5_2 extends AppCompatActivity {

    String n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project5_2);
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button[] numBtn = new Button[10];
        Integer[] btnID = {
                R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2, R.id.BtnNum3,
                R.id.BtnNum4, R.id.BtnNum5, R.id.BtnNum6,
                R.id.BtnNum7, R.id.BtnNum8, R.id.BtnNum9,
        };

        Button add = findViewById(R.id.add);
        Button minus = findViewById(R.id.minus);
        Button mul = findViewById(R.id.mul);
        Button div = findViewById(R.id.div);

        TextView result = findViewById(R.id.result);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length() == 0 || num2.getText().length() == 0){
                    Toast.makeText(project5_2.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    n1 = num1.getText().toString();
                    n2 = num2.getText().toString();
                    float tmpRet1 = Float.parseFloat(n1);
                    float tmpRet2 = Float.parseFloat(n2);
                    String ret = Float.toString(tmpRet1+tmpRet2);
                    result.setText(ret);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length() == 0 || num2.getText().length() == 0){
                    Toast.makeText(project5_2.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    n1 = num1.getText().toString();
                    n2 = num2.getText().toString();
                    float tmpRet1 = Float.parseFloat(n1);
                    float tmpRet2 = Float.parseFloat(n2);
                    String ret = Float.toString(tmpRet1-tmpRet2);
                    result.setText(ret);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length() == 0 || num2.getText().length() == 0){
                    Toast.makeText(project5_2.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    n1 = num1.getText().toString();
                    n2 = num2.getText().toString();
                    float tmpRet1 = Float.parseFloat(n1);
                    float tmpRet2 = Float.parseFloat(n2);
                    String ret = Float.toString(tmpRet1*tmpRet2);
                    result.setText(ret);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().length() == 0 || num2.getText().length() == 0){
                    Toast.makeText(project5_2.this, "숫자를 입력하세요", Toast.LENGTH_SHORT).show();
                }else{
                    if(num1.getText().toString().equals("0")){
                        Toast.makeText(project5_2.this, "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    }else{
                        n1 = num1.getText().toString();
                        n2 = num2.getText().toString();
                        float tmpRet1 = Float.parseFloat(n1);
                        float tmpRet2 = Float.parseFloat(n2);
                        String ret = Float.toString(tmpRet1/tmpRet2);
                        result.setText(ret);
                    }

                }
            }
        });

        for(int i =0;i<btnID.length;i++){
            numBtn[i] = findViewById(btnID[i]);
        }

        for (int i=0;i<numBtn.length;i++){
            int idx;
            idx = i;
            numBtn[idx].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (num1.isFocused()){
                        n1 = num1.getText().toString();
                        num1.setText(n1+numBtn[idx].getText().toString());
                    }else if(num2.isFocused()){
                        n2 = num2.getText().toString();
                        num2.setText(n2+numBtn[idx].getText().toString());
                    }else {
                        Toast.makeText(project5_2.this, "먼저 edittext를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }


    }
}