package com.example.circle;

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
        double r=0;
        EditText radius=(EditText) findViewById(R.id.radius);
        TextView result= (TextView) findViewById(R.id.result);
        String rad=radius.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        r=Double.parseDouble(rad);
        result.setText("Area: "+(3.142857142857143*r*r));
    }
    public void calcPerimeter(View view){
        double r=0;
        EditText radius=(EditText) findViewById(R.id.radius);
        TextView result= (TextView) findViewById(R.id.result);
        String rad=radius.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        r=Double.parseDouble(rad);
        result.setText("Perimeter: "+(2*3.142857142857143*(Math.abs(r))));
    }

}