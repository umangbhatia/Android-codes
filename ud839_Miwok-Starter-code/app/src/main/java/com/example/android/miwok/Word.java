package com.example.android.miwok;

/**
 * Created by umang on 12-10-2016.
 */
public class Word {
    private String defaultTranslation;
    private String miwokTranslation;
    private int ImageId;
    private int song;


    public int getSong() {
        return song;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageId, int songID) {
        this.defaultTranslation = defaultTranslation;
        ImageId = imageId;
        song = songID;

        this.miwokTranslation = miwokTranslation;
    }

    public Word(String dfault, String miwok){
        defaultTranslation=dfault;
        miwokTranslation=miwok;
    }
    public String getDefault(){
        return defaultTranslation;
    }
    public String getMiwok(){
        return miwokTranslation;
    }
    public int getImageId() {
        return ImageId;
    }

}
