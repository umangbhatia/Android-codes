package com.exasdfample.umang.newwidgets;

/**
 * Created by umang on 08-12-2016.
 */
public class SPinnerModel {

    String Name;
    int Image;

    public SPinnerModel(String animalName,int animalImage)
    {
        this.Image=animalImage;
        this.Name=animalName;
    }
    public String getAnimalName()
    {
        return Name;
    }
    public int getAnimalImage()
    {
        return Image;
    }
}
