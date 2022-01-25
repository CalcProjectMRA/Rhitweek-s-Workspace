package com.example.cylinder;

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
    public void calcVol(View view) {
        double r=0,h= 0;
        EditText length = (EditText) findViewById(R.id.radius);
        EditText breadth = (EditText) findViewById(R.id.height);
        TextView result = (TextView) findViewById(R.id.result);
        String len = length.getText().toString();
        String bre = breadth.getText().toString();
        if (len.matches("") || bre.matches("")) {
            result.setText("Both fields can't be Empty.");
            return;
        }
        r = Double.parseDouble(len);
        h = Double.parseDouble(bre);
        result.setText("Volume: " + (3.142857142857143*r*r*h));
    }
    public void calcCSA(View view) {
        double l = 0, b = 0;
        EditText length = (EditText) findViewById(R.id.radius);
        EditText breadth = (EditText) findViewById(R.id.height);
        TextView result = (TextView) findViewById(R.id.result);
        String len = length.getText().toString();
        String bre = breadth.getText().toString();
        if (len.matches("") || bre.matches("")) {
            result.setText("Both fields can't be Empty.");
            return;
        }
        l = Double.parseDouble(len);
        b = Double.parseDouble(bre);
        result.setText("Perimeter: " + (2 * (Math.abs(l) + Math.abs(b))));
    }
    public void calcTSA(View view) {
        double l=0,b=0;
        EditText length = (EditText) findViewById(R.id.radius);
        EditText breadth = (EditText) findViewById(R.id.height);
        TextView result = (TextView) findViewById(R.id.result);
        String len = length.getText().toString();
        String bre = breadth.getText().toString();
        if (len.matches("") || bre.matches("")) {
            result.setText("Both fields can't be Empty.");
            return;
        }
        l = Double.parseDouble(len);
        b = Double.parseDouble(bre);
        result.setText("Perimeter: " + (2 * (Math.abs(l) + Math.abs(b))));
    }
}