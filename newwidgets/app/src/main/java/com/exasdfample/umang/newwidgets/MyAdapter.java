package com.exasdfample.umang.newwidgets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by umang on 09-12-2016.
 */
public class MyAdapter extends ArrayAdapter {
    ArrayList<SPinnerModel> list = new ArrayList<>();

    public MyAdapter(Context context,int layoutId, ArrayList<SPinnerModel> objects ){
        super(context, layoutId, objects);
        list = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.spinnerlayout, parent, false);
        TextView textView = (TextView) v.findViewById(R.id.textView1);

        return super.getView(position, convertView, parent);
    }
}
