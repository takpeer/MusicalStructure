package com.example.android.musicalstructure;

public class ArtistData {
    String name;
    int imageResourceId;


    public ArtistData(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getArtistName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }

}
