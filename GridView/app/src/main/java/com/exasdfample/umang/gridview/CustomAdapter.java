package com.exasdfample.umang.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by umang on 16-12-2016.
 */
public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] strings;

    public CustomAdapter(Context context, String[] strings1) {
        this.context = context;
        strings=strings1;
    }


    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final TextView textView;
        if(convertView == null){
            textView = new TextView(context);
        }else{
            textView = (TextView) convertView;
        }
        textView.setText(strings[position]);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "item: "+(pos+1)+" clicked",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return textView;
    }
}
