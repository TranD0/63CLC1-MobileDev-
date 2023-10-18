package com.tranthaingocdo.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryArrayAdater extends BaseAdapter {
    List<Country> dataSource;
    LayoutInflater inflater;
    Context context;

    public CountryArrayAdater(List<Country> dataSource, Context context) {
        this.dataSource = dataSource;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }
    //inner class (bao các class khác đc)
class CountryItemViewHoler{
        ImageView flagView;
        TextView countryNameView;
        TextView poPulationView;
}
    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return dataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        CountryItemViewHoler itemViewHoler;
        if (view == null) {
            //xml item view --> java item view
            view = inflater.inflate(R.layout.custom_item_layout,null);
            //get ref
            itemViewHoler = new CountryItemViewHoler();
            itemViewHoler.flagView= view.findViewById(R.id.imageViewFlag);
            itemViewHoler.countryNameView= view.findViewById(R.id.textViewName);
            itemViewHoler.poPulationView= view.findViewById(R.id.textViewPopulation);
            view.setTag(itemViewHoler);
        }
        else{
            itemViewHoler=(CountryItemViewHoler) view.getTag();
        }
        Country countrytryItem = dataSource.get(i);
        itemViewHoler.countryNameView.setText(countrytryItem.getCountryName());
        itemViewHoler.poPulationView.setText("Population"+countrytryItem.getPopulation());
        itemViewHoler.countryNameView.setText(countrytryItem.getCountryName());
        int flagID=getImgIDbyResName(countrytryItem.getCountryFlag());
        itemViewHoler.flagView.setImageResource(flagID);
        return view;
    }//end of getView
    public int getImgIDbyResName(String resName){
        String packageName = context.getPackageName();
        int imgId = context.getResources().getIdentifier(resName,"mipmap",packageName);
        return imgId;

    }
}
