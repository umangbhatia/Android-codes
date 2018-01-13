package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by umang on 12-10-2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0, words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listitemview = convertView;
        if(listitemview==null){
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord = getItem(position);
        TextView dfault = (TextView) listitemview.findViewById(R.id.textView2);
        dfault.setText(currentWord.getDefault());
        TextView miwok = (TextView) listitemview.findViewById(R.id.textView);
        miwok.setText(currentWord.getMiwok());
        ImageView imageView = (ImageView) listitemview.findViewById(R.id.imageView);
        imageView.setImageResource(currentWord.getImageId());

        return listitemview;
    }

}
