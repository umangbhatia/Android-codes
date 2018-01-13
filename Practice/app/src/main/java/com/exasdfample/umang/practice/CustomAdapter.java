package com.exasdfample.umang.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;

/**
 * Created by umang on 15-12-2016.
 */
public class CustomAdapter extends BaseAdapter {
    String[] items;
    LayoutInflater inflater = null;
    boolean[] checkedStates;
    Context context;
    public CustomAdapter(Context context, String[] resource) {
        items = resource;
        this.context = context;
        checkedStates = new boolean[items.length];
         inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.custom_layout, parent,false);
            viewHolder = new ViewHolder();
            final CheckBox box = (CheckBox) convertView.findViewById(R.id.checkBox);
            viewHolder.box=box;
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.box.setText(items[position]);
        final CheckBox box = viewHolder.box;

        box.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
               if(box.isChecked()){
                   box.setChecked(true);
                   checkedStates[position] = true;
               }else{
                   box.setChecked(false);
                   checkedStates[position] = false;
               }
            }
        });
        box.setChecked(checkedStates[position]);
        return convertView;
    }
}
