package com.example.exercise_5;

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
    void XuLy_BMI(View view){

        EditText dk_H = (EditText) findViewById(R.id.edtH);
        float SoA = Float.parseFloat(dk_H.getText().toString());
        EditText dk_W = (EditText) findViewById(R.id.edtW);
        float SoB = Float.parseFloat(dk_W.getText().toString());
        float KetQua =SoA / SoB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText( String.valueOf(KetQua) );
    }
}