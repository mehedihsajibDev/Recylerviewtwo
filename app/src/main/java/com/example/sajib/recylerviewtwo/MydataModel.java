package com.example.sajib.recylerviewtwo;

/**
 * Created by Sajib on 26-Mar-18.
 */

public class MydataModel {
    String name;
    String imageurl;

    public MydataModel(String name, String imageurl) {
        this.name = name;
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
