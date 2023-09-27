package com.example.xulysukien1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_UN;
    EditText editText_PW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
    }
    void getWidget()
    {
        EditText editText_UN= findViewById(R.id.edtUserName);
        EditText editText_PW= findViewById(R.id.edtPassWord);
    }

    public void XuLyLogin(View v){

        String tenDN= editText_UN.getText().toString();
        String mk = editText_PW.getText().toString();
        String KetQua;
        if(tenDN.equals("63CLC1") && mk.equals("123")) KetQua="Ok, Login SUCCESS";
        else KetQua="Ok'nt, Login FAILED";
        Toast.makeText(this,KetQua,Toast.LENGTH_LONG).show();

    }
}