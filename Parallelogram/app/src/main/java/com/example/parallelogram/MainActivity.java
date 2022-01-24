package com.example.parallelogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText length,breadth,height;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        length=(EditText) findViewById(R.id.length);
        breadth=(EditText) findViewById(R.id.breadth);
        height=(EditText) findViewById(R.id.height);
        result= (TextView) findViewById(R.id.result);
        length.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                //call your function here of calculation here
                calc();

            }
        });
        breadth.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                //call your function here of calculation here
                calc();

            }
        });
        height.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int aft) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                //call your function here of calculation here
                calc();

            }
        });
    }
    public void calc(){
        double h,l,b;
        String hei=height.getText().toString();
        String len=length.getText().toString();
        String bre=breadth.getText().toString();
        if (hei.matches("") && len.matches("") && bre.matches("")) {
            result.setText("Area: Required fields empty for calculating Area.\n\nPerimeter: Required fields empty for calculating Perimeter.");
            return;
        }
        else if(hei.matches("") && !len.equals("") && !bre.equals("")){
            l=Double.parseDouble(len);
            b=Double.parseDouble(bre);
            result.setText("Area: Required fields empty for calculating Area.\n\nPerimeter: "+(2*(Math.abs(l)+Math.abs(b))));
        }
        else if(!hei.equals("") && !bre.equals("") && len.matches("")){
            b=Double.parseDouble(bre);
            h=Double.parseDouble(hei);
            result.setText("Area: "+(b*h)+"\n\nPerimeter: Perimeter: Required fields empty for calculating Perimeter.");
        }
        else if(!hei.equals("") && !len.equals("") && !bre.equals("")){
            l=Double.parseDouble(len);
            b=Double.parseDouble(bre);
            h=Double.parseDouble((hei));
            result.setText("Area: "+(b*h)+"\n\nPerimeter: "+(2*(Math.abs(l)+Math.abs(b))));
        }
        else{
            result.setText("Area: Required fields empty for calculating Area.\n Perimeter: Required fields empty for calculating Perimeter.");
            return;
        }

    }
}