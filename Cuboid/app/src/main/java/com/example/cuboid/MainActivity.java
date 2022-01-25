package com.example.cuboid;

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
    public void calcVol(View view){
        double l=0,b=0,h=0;
        EditText length=(EditText) findViewById(R.id.length);
        EditText breadth=(EditText) findViewById(R.id.breadth);
        EditText height=(EditText) findViewById(R.id.height);
        TextView result= (TextView) findViewById(R.id.result);
        String len=length.getText().toString();
        String bre=breadth.getText().toString();
        String hei=height.getText().toString();
        if (len.matches("") || bre.matches("") || hei.matches("")) {
            result.setText("Both fields can't be Empty.");
            return;
        }
        l=Math.abs(Double.parseDouble(len));
        b=Math.abs(Double.parseDouble(bre));
        h=Math.abs(Double.parseDouble(hei));
        result.setText("Volume: "+(l*b*h));
    }
    public void calcCSA(View view){
        double l=0,b=0,h=0;
        EditText length=(EditText) findViewById(R.id.length);
        EditText breadth=(EditText) findViewById(R.id.breadth);
        EditText height=(EditText) findViewById(R.id.height);
        TextView result= (TextView) findViewById(R.id.result);
        String len=length.getText().toString();
        String bre=breadth.getText().toString();
        String hei=height.getText().toString();
        if (len.matches("") || bre.matches("") || hei.matches("")) {
            result.setText("Both fields can't be Empty.");
            return;
        }
        l=Math.abs(Double.parseDouble(len));
        b=Math.abs(Double.parseDouble(bre));
        h=Math.abs(Double.parseDouble(hei));
        result.setText("Lateral Surface Area: "+(2*h*(l+b)));
    }
    public void calcTSA(View view){
        double l=0,b=0,h=0;
        EditText length=(EditText) findViewById(R.id.length);
        EditText breadth=(EditText) findViewById(R.id.breadth);
        EditText height=(EditText) findViewById(R.id.height);
        TextView result= (TextView) findViewById(R.id.result);
        String len=length.getText().toString();
        String bre=breadth.getText().toString();
        String hei=height.getText().toString();
        if (len.matches("") || bre.matches("") || hei.matches("")) {
            result.setText("Both fields can't be Empty.");
            return;
        }
        l=Math.abs(Double.parseDouble(len));
        b=Math.abs(Double.parseDouble(bre));
        h=Math.abs(Double.parseDouble(hei));
        result.setText("Total Surface Area: "+(2*(l*b+b*h+h*l)));
    }
}