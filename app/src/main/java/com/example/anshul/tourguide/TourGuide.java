package com.example.anshul.tourguide;

/**
 * Created by anshul on 19/7/17.
 */

public class TourGuide {

    private int tgImageResourceId;
    private String tgName;
    private double tgLatitude;
    private double tgLongitude;
    private String tgGregorian;
    private String tgUri;

    public TourGuide(String name, int imageResourceId) {
        tgName = name;
        tgImageResourceId = imageResourceId;
        tgGregorian = "geo:0,0?q=" + name + " Hyderabad, India";
    }

    public TourGuide(String name, int imageResourceId, String uri) {
        tgName = name;
        tgImageResourceId = imageResourceId;
        tgGregorian = "geo:0,0?q=" + name + " Hyderabad, India";
        tgUri = uri;
    }

    public TourGuide(String name, int imageResourceId, double latitude, double longitude) {
        tgName = name;
        tgImageResourceId = imageResourceId;
        tgLatitude = latitude;
        tgLongitude = longitude;
        tgGregorian = "geo:" + tgLatitude + "," + tgLongitude;
    }

    public int getImageResourceId() {
        return tgImageResourceId;
    }

    public String getName() {
        return tgName;
    }

    public String getGregorian() {
        return tgGregorian;
    }

    public String getTgUri() {
        return tgUri;
    }
}
