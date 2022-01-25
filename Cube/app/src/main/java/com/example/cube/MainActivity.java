package com.example.cube;

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
        double a=0;
        EditText side=(EditText) findViewById(R.id.side);
        TextView result= (TextView) findViewById(R.id.result);
        String rad=side.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        a=Math.abs(Double.parseDouble(rad));
        result.setText("Volume: "+(a*a*a));
    }
    public void calcTSA(View view){
        double r=0;
        EditText side=(EditText) findViewById(R.id.side);
        TextView result= (TextView) findViewById(R.id.result);
        String rad=side.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        r=Double.parseDouble(rad);
        result.setText("Total Surface Area: "+(6*(Math.abs(r)*(Math.abs(r)))));
    }
    public void calcCSA(View view){
        double r=0;
        EditText side=(EditText) findViewById(R.id.side);
        TextView result= (TextView) findViewById(R.id.result);
        String rad=side.getText().toString();
        if (rad.matches("")) {
            result.setText("Field can't be Empty.");
            return;
        }
        r=Double.parseDouble(rad);
        result.setText("Total Surface Area: "+(4*(Math.abs(r)*(Math.abs(r)))));
    }
}