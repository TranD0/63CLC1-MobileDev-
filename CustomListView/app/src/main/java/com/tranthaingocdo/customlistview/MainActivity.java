package com.tranthaingocdo.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dsQG =new ArrayList<>();
        Country qg1 = new Country("VietNam","vie","1000");
        Country qg2 = new Country("United state","us","1000");
        Country qg3 = new Country("Russia","ru","1000");
        dsQG.add(qg1);
        dsQG.add(qg2);
        dsQG.add(qg3);
        ListView lvQG = findViewById(R.id.listViewNation);
        CountryArrayAdater adater;
        adater = new CountryArrayAdater(dsQG,this);
        lvQG.setAdapter(adater);
    }
}