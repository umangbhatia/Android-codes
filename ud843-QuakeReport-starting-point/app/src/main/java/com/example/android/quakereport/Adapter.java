package com.example.android.quakereport;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.quakereport.R;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by umang on 31-03-2017.
 */
public class Adapter extends ArrayAdapter<Earthquake> {
    public Adapter(Context context, ArrayList<Earthquake> earthquakes ) {
        super(context,0,  earthquakes);
    }
    private static final String LOCATION_SEPARATOR = " of ";


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.adapter, parent, false);
        }
        Earthquake quake = getItem(position);
        TextView mag = (TextView) listItemView.findViewById(R.id.magnitude);
        DecimalFormat format = new DecimalFormat("0.0");
        String magn = format.format(quake.getMag());
        mag.setText(magn);

        String originalLocation = quake.getLocation();
        String primaryLocation;
        String locationOffset;
        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        } else {
            locationOffset = "Near the";
            primaryLocation = originalLocation;
        }
        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.primary_location);
        primaryLocationView.setText(primaryLocation);

        TextView locationOffsetView = (TextView) listItemView.findViewById(R.id.location_offset);
        locationOffsetView.setText(locationOffset);


        TextView date = (TextView ) listItemView.findViewById(R.id.date);
        long dateinml = (Long) quake.getDate();
        Date dateObj = new Date(dateinml);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM DD, yyyy");
        String datefinal = dateFormat.format(dateObj);
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        // Format the time string (i.e. "4:30PM")

        String formattedTime = formatTime(dateObj);
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);

        date.setText(datefinal);
        return listItemView;
    }
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
