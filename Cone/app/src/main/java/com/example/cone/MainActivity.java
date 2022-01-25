package com.example.cone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcVol(View view){
        double r=0,l=0,h=0;
        EditText radius=(EditText) findViewById(R.id.radius);
        EditText height=(EditText) findViewById(R.id.height);
        TextView result= (TextView) findViewById(R.id.result);
        String rad=radius.getText().toString();
        String hei=height.getText().toString();
        if (rad.matches("") || hei.matches("")) {
            result.setText("Required fields can't be Empty.");
            return;
        }
        r=Math.abs(Double.parseDouble(rad));
        h=Math.abs(Double.parseDouble(hei));
        l=Math.sqrt((r*r)+(h*h));
        result.setText("Slant Length:"+String.format("%.8f",l)+"\nTotal Surface Area: "+String.format("%.8f",((0.3333333333333333*3.142857142857143*(r*r)*h))));
    }
    public void calcCSA(View view){
        double r=0,l=0,h=0;
        EditText radius=(EditText) findViewById(R.id.radius);
        EditText height=(EditText) findViewById(R.id.height);
        TextView result= (TextView) findViewById(R.id.result);
        String rad=radius.getText().toString();
        String hei=height.getText().toString();
        if (rad.matches("") || hei.matches("")) {
            result.setText("Required fields can't be Empty.");
            return;
        }
        r=Math.abs(Double.parseDouble(rad));
        h=Math.abs(Double.parseDouble(hei));
        l=Math.sqrt((r*r)+(h*h));
        result.setText("Slant Length:"+String.format("%.8f",l)+"\nCurved Surface Area: "+String.format("%.8f",((3.142857142857143*r*l))));
    }
    public void calcTSA(View view){
        double r=0,l=0,h=0;
        EditText radius=(EditText) findViewById(R.id.radius);
        EditText height=(EditText) findViewById(R.id.height);
        TextView result= (TextView) findViewById(R.id.result);
        String rad=radius.getText().toString();
        String hei=height.getText().toString();
        if (rad.matches("") || hei.matches("")) {
            result.setText("Required fields can't be Empty.");
            return;
        }
        r=Math.abs(Double.parseDouble(rad));
        h=Math.abs(Double.parseDouble(hei));
        l=Math.sqrt((r*r)+(h*h));
        result.setText("Slant Length:"+String.format("%.8f",l)+"\nTotal Surface Area: "+String.format("%.8f",(3.142857142857143*r*(r+l))));
    }
}

