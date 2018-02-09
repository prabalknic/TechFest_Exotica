package com.exotica.asus.theexotica2k18;

/**
 * Created by asus on 04-02-2018.
 */

public class Movie {
    private String Name,ImageURl;

    public Movie(String name,String imageURl){
        Name=name;
        ImageURl= imageURl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImageURl() {
        return ImageURl;
    }

    public void setImageURl(String imageURl) {
        ImageURl = imageURl;
    }
}
