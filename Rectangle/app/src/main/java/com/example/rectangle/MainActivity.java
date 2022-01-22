package com.example.rectangle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcArea(View view){
        double l=0,b=0;
        EditText length=(EditText) findViewById(R.id.length);
        EditText breadth=(EditText) findViewById(R.id.breadth);
        TextView result= (TextView) findViewById(R.id.result);
        String len=length.getText().toString();
        String bre=breadth.getText().toString();
        if (len.matches("") || bre.matches("")) {
            result.setText("Both fields can't be Empty.");
            return;
        }
        l=Double.parseDouble(len);
        b=Double.parseDouble(bre);
        result.setText("Area: "+(Math.abs(l)*Math.abs(b)));
    }
    public void calcPerimeter(View view){
        double l=0,b=0;
        EditText length=(EditText) findViewById(R.id.length);
        EditText breadth=(EditText) findViewById(R.id.breadth);
        TextView result= (TextView) findViewById(R.id.result);
        String len=length.getText().toString();
        String bre=breadth.getText().toString();
        if (len.matches("") || bre.matches("")) {
            result.setText("Both fields can't be Empty.");
            return;
        }
        l=Double.parseDouble(len);
        b=Double.parseDouble(bre);
        result.setText("Perimeter: "+(2*(Math.abs(l)+Math.abs(b))));
    }

}