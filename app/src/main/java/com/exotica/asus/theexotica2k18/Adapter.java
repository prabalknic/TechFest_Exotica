package com.exotica.asus.theexotica2k18;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by asus on 08-02-2018.
 */

public class Adapter extends PagerAdapter {
    List<Integer> Istimages;
    Context context;

    LayoutInflater layoutInflater;

    public Adapter(List<Integer> istimages, Context context) {
        Istimages = istimages;
        this.context = context;

        layoutInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return Istimages.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.card_item, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(Istimages.get(position));
        container.addView(view);
        return view;
    }
}
