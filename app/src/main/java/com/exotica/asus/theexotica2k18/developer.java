package com.exotica.asus.theexotica2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;


public class developer extends AppCompatActivity {

    List<Integer> IstImages= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);



        initdata();
        HorizontalInfiniteCycleViewPager pager=(HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);

        Adapter adapter= new Adapter(IstImages,getBaseContext());
        pager.setAdapter(adapter);
    }


    private void initdata() {

        IstImages.add(R.drawable.prabal);
        IstImages.add(R.drawable.rohan);
        IstImages.add(R.drawable.sallu);
    }
    }
