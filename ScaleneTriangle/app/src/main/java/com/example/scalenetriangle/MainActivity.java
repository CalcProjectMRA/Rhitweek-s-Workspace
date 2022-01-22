package com.example.scalenetriangle;

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
    public void calcArea(View view){
        double s1=0,s2=0,s3=0;
        EditText side1=(EditText) findViewById(R.id.side1);
        EditText side2=(EditText) findViewById(R.id.side2);
        EditText side3=(EditText) findViewById(R.id.side3);
        TextView result= (TextView) findViewById(R.id.result);
        String sd1=side1.getText().toString();
        String sd2=side2.getText().toString();
        String sd3=side3.getText().toString();
        if (sd1.matches("") || sd2.matches("")|| sd3.matches("")) {
            result.setText("Fields can't be Empty.");
            return;
        }
        s1=Double.parseDouble(sd1);
        s2=Double.parseDouble(sd2);
        s3=Double.parseDouble(sd3);
        double s=s1+s2+s3;
        double res=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        result.setText("Area: "+res);
    }
    public void calcPerimeter(View view){
        double s1=0,s2=0,s3=0;
        EditText side1=(EditText) findViewById(R.id.side1);
        EditText side2=(EditText) findViewById(R.id.side2);
        EditText side3=(EditText) findViewById(R.id.side3);
        TextView result= (TextView) findViewById(R.id.result);
        String sd1=side1.getText().toString();
        String sd2=side2.getText().toString();
        String sd3=side3.getText().toString();
        if (sd1.matches("") || sd2.matches("")|| sd3.matches("")) {
            result.setText("Fields can't be Empty.");
            return;
        }
        s1=Double.parseDouble(sd1);
        s2=Double.parseDouble(sd2);
        s3=Double.parseDouble(sd3);
        double s=s1+s2+s3;
        result.setText("Perimeter: "+s);
    }

}