package com.example.task0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1 = (EditText)findViewById(R.id.number1);
    EditText num2 = (EditText)findViewById(R.id.number2);
    TextView res = (TextView)findViewById(R.id.result);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubButtonClick(View v){
        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());
        float sub = n1 - n2;
        res.setText(Float.toString(sub));
    }

    public void onMulButtonClick(View v){
        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());
        float mul = n1 * n2;
        res.setText(Float.toString(mul));
    }

    public void onDivButtonClick(View v){
        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());
        float div = n1 / n2;
        res.setText(Float.toString(div));
    }

    public void onAddButtonClick(View v){
        float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num2.getText().toString());
        float add = n1 + n2;
        res.setText(Float.toString(add));
    }
}
