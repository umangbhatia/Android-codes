package com.exasdfample.umang.containers;

import android.content.Context;
import android.graphics.Typeface;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by umang on 16-12-2016.
 */
public class CustomAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    private Boolean[][] currentState;

    public CustomAdapter( Context context,List<String> listDataHeader, HashMap<String, List<String>> listDataChild) {
        this.listDataHeader = listDataHeader;
        this.context = context;
        this.listDataChild = listDataChild;
        currentState = new Boolean[listDataHeader.size()][];
        for(int i=0; i<listDataHeader.size();i++){
            currentState[i] = new Boolean[listDataChild.get(listDataHeader.get(i)).size()];
            for(int j=0;j<listDataChild.get(listDataHeader.get(i)).size();j++){
                currentState[i][j] = false;
            }
        }
    }


    @Override
    public int getGroupCount() {
        return this.listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.listDataChild.get(this.listDataHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.listDataHeader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.listDataChild.get(this.listDataHeader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(final int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_group, null);
        }
        TextView listHeader = (TextView) convertView.findViewById(R.id.text);
        listHeader.setTypeface(null, Typeface.BOLD);
        listHeader.setText(headerTitle);
//        listHeader.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                for(int i=0;i<listDataChild.get(listDataHeader.get(i)).size();i++){
//                    currentState[groupPosition][i] = true;
//                }
//
//            }
//        });
        return convertView;
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childText = (String) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, null);
        }
        final CheckBox textListChild;
        textListChild = (CheckBox) convertView.findViewById(R.id.checkbox2);


        textListChild.setText(childText);
        textListChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textListChild.isChecked()){
                    currentState[groupPosition][childPosition] = true;
                }else{
                    currentState[groupPosition][childPosition] = false;
                }
            }
        });
        Log.i("UMANG",""+currentState[groupPosition][childPosition]);
        System.out.print("UMANG"+currentState[groupPosition][childPosition]);
        textListChild.setChecked(currentState[groupPosition][childPosition]);
        return convertView;


    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}


