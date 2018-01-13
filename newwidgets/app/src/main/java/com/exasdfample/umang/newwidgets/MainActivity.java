package com.exasdfample.umang.newwidgets;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    String[] arr = {"item 1", "item 2","item 3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }



}
