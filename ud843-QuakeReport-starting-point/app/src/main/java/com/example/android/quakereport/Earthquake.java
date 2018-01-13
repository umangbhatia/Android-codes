package com.example.android.quakereport;
import java.sql.Date;
import java.sql.Struct;


/**
 * Created by umang on 31-03-2017.
 */
public class Earthquake {
    private double mag;
    private String location;
    private long date;
    private String mURL;

    public Earthquake(double mag, String location, long date, String mURL) {
        this.mag = mag;
        this.location = location;
        this.date = date;
        this.mURL = mURL;
    }

    public double getMag() {
        return mag;
    }
    public String getLocation() {
        return location;
    }
    public String getmURL() {
        return mURL;
    }

    public long getDate() {
        return date;
    }

}
