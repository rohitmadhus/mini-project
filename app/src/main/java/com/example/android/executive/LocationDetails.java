package com.example.android.executive;

/**
  Created by RoshanJoy on 17-03-2017.
 */

public class LocationDetails {

    private Double latitude;
    private Double longitude;

    public LocationDetails(){}

    public LocationDetails(Double latitude, Double longitude){
        this.latitude=latitude;
        this.longitude=longitude;
    }

    public void setLatitude(Double latitude){this.latitude=latitude;}
    public void setLongitude(Double longitude){this.longitude=longitude;}
    public Double getLatitude(){return  latitude;}
    public Double getLongitude(){return longitude;}
}

