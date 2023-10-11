package com.tranthaingocdo.autocompleteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView auTV;
    //b1
   // ArrayList<String> COUNTRIES;
    List<String> COUNTRIES = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
        //b0-next
      COUNTRIES.add("VietNam");
        COUNTRIES.add("ThaiLand");
        COUNTRIES.add("Autralia");
        COUNTRIES.add("USA");
        COUNTRIES.add("Algeria");
        //b2
       ArrayAdapter<String> adapterCountries = new ArrayAdapter<String>(this,
               android.R.layout.simple_dropdown_item_1line,
               COUNTRIES);
auTV.setAdapter(adapterCountries);
    }
    public void getWidget(){
        auTV = findViewById(R.id.autoCompleteCountries);
    }
}