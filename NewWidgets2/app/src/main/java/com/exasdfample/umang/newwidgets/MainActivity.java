package com.exasdfample.umang.newwidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{
    ArrayList<Object> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add(new Object("item 1", R.drawable.ic_launcher));
        list.add(new Object("item 2", R.drawable.ic_launcher));
        list.add(new Object("item 3", R.drawable.ic_launcher));

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.customview,list);
       // customAdapter.setDropDownViewResource(R.layout.customview);                    ;
        spin.setAdapter(customAdapter);


    }

}
