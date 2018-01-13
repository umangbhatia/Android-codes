
package com.exasdfample.umang.containers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expandableListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    List<String> l1;
    List<String> l2;
    List<String> l3;
    List<String> l4;
    List<String> l5;
    List<String> l6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        prepareData();
        listAdapter = new CustomAdapter(this, listDataHeader, listDataChild);
        expandableListView.setAdapter(listAdapter);
    }
    private void prepareData(){
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        listDataHeader.add("India");
        listDataHeader.add("USA");
        listDataHeader.add("China");
        listDataHeader.add("Canada");
        listDataHeader.add("Australia");
        listDataHeader.add("France");
        l1 = new ArrayList<String>();
        l2 = new ArrayList<String>();
        l3 = new ArrayList<String>();
        l4 = new ArrayList<String>();
        l5 = new ArrayList<String>();
        l6 = new ArrayList<String>();
        l1.add("Haryana");
        l1.add("Punjab");
        l1.add("Bihar");
        l1.add("Sikkim");
        l1.add("Kashmir");
        l2.add("Washington DC");
        l2.add("Ohio");
        l2.add("Toronto");
        l3.add("Tibet");
        l3.add("Gansu");
        l3.add("Jilin");
        l4.add("Ontario");
        l4.add("Alberta");
        l4.add("Quebec");
        l5.add("Victoria");
        l5.add("Tasmania");
        l5.add("Queensland");
        l6.add("Centre");
        l6.add("Limousin");
        l6.add("Bretagne");
        listDataChild.put("India",l1);
        listDataChild.put("USA",l2);
        listDataChild.put("China",l3);
        listDataChild.put("Canada",l4);
        listDataChild.put("Australia",l5);
        listDataChild.put("France",l6);

    }
}
