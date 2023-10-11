package com.tranthaingocdo.listviewsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> danhsachlstNNLT =new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
        //b1 next
        danhsachlstNNLT.add("C");
        danhsachlstNNLT.add("C++");
        danhsachlstNNLT.add("C#");
        danhsachlstNNLT.add("Ruby");
        danhsachlstNNLT.add("Java");
        danhsachlstNNLT.add("Python");
        //b2
        ArrayAdapter<String> adapterNNLT = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                danhsachlstNNLT
        );
        listViewNNLT.setAdapter(adapterNNLT);
        listViewNNLT.setOnClickListener(new A);
//        listViewNNLT.setOnClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view,int i,long l)
//            {
//                //String mucChon = danhsachlstNNLT.getItem(i);
                    //String mucChon = danhsachlstNNLT.get(i);
//            }
//        });
    }
    public void getWidget(){
        listViewNNLT=findViewById(R.id.lvNNLT);
    }
    ListView listViewNNLT;
}