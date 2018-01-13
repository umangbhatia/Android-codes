package com.exasdfample.umang.newwidgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by umang on 11-12-2016.
 */
 public class CustomAdapter extends ArrayAdapter<Object> {
    Context context;
    ArrayList<Object> lists;


   public CustomAdapter(Context context, int text, ArrayList<Object> list){

       super(context, text, R.id.textView,list);
        this.context = context;
       /* this.a = a;*/
        lists = list;


    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.customview, null);
        ImageView img = (ImageView) v.findViewById(R.id.imageView);
        TextView txt = (TextView) v.findViewById(R.id.textView);
        img.setImageResource(lists.get(position).getId());
        txt.setText(lists.get(position).getName());

        return v;
    }


    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.customview, null);
        ImageView img = (ImageView) v.findViewById(R.id.imageView);
        TextView txt = (TextView) v.findViewById(R.id.textView);
        img.setImageResource(lists.get(position).getId());
        txt.setText(lists.get(position).getName());

        return v;
    }
}
