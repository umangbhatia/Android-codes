package com.exasdfample.umang.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    String[] strings = {"item 1", "item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9","item 10","item 11","item 12","item 13"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridview = (GridView) findViewById(R.id.grid);
        CustomAdapter customAdapter = new CustomAdapter(this, strings);
        gridview.setAdapter(customAdapter);
    }

}
