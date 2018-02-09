package com.exotica.asus.theexotica2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by asus on 04-02-2018.
 */

public class MovieAdapter extends BaseAdapter {
    private List<Movie> movieList;
    private Context mcontext;

    public MovieAdapter(List<Movie> movieList, Context mcontext) {
        this.movieList = movieList;
        this.mcontext = mcontext;
    }


    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public Object getItem(int position) {
        return movieList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView=convertView;
        if (rowView==null)
        {
            rowView= LayoutInflater.from(mcontext).inflate(R.layout.layout_item,null);
            TextView name=(TextView)rowView.findViewById(R.id.label);
            ImageView image=(ImageView)rowView.findViewById(R.id.image);

            Picasso.with(mcontext).load(movieList.get(position).getImageURl()).into(image);
            name.setText(movieList.get(position).getName());

        }

        return rowView;
    }
}
