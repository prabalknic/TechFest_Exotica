package com.exotica.asus.theexotica2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Map extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);


        imageView=(ImageView)findViewById(R.id.imagemap);
        PhotoViewAttacher photoview=new PhotoViewAttacher(imageView);
        photoview.update();
    }
}
