package com.example.excercise_6;

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
    public void XuLy_Cong(View view){
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        int SoA = Integer.parseInt(dk_soA.getText().toString());
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        int SoB = Integer.parseInt(dk_soB.getText().toString());
        int KetQua =SoA + SoB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText(String.valueOf(KetQua));
    }
    public void XuLy_Tru(View view){
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        int SoA = Integer.parseInt(dk_soA.getText().toString());
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        int SoB = Integer.parseInt(dk_soB.getText().toString());
        int KetQua =SoA - SoB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText( String.valueOf(KetQua) );
    }
    public void XuLy_Nhan(View view){
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        float SoA = Float.parseFloat(dk_soA.getText().toString());
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        float SoB = Float.parseFloat(dk_soB.getText().toString());
        float KetQua =SoA * SoB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText( String.valueOf(KetQua) );
    }

    public void XuLy_Chia(View view){
        EditText dk_soA = (EditText) findViewById(R.id.edtA);
        float SoA = Float.parseFloat(dk_soA.getText().toString());
        EditText dk_soB = (EditText) findViewById(R.id.edtB);
        float SoB = Float.parseFloat(dk_soB.getText().toString());
        float KetQua =SoA / SoB;
        TextView dk_KQ = (TextView) findViewById(R.id.tvResult);
        dk_KQ.setText( String.valueOf(KetQua) );
}}