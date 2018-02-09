package com.exotica.asus.theexotica2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.List;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class teamexotica extends AppCompatActivity {

    private FeatureCoverFlow coverFlow;
    private MovieAdapter movieAdapter;
    private List<Movie> movieList = new ArrayList<>();
    private TextSwitcher mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teamexotica);

        initData();
        mTitle = (TextSwitcher) findViewById(R.id.title);
        mTitle.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(teamexotica.this);
                TextView txt = (TextView) inflater.inflate(R.layout.layout_title, null);

                return txt;
            }
        });
        final Animation in = AnimationUtils.loadAnimation(this, R.anim.slide_in_top);
        final Animation out = AnimationUtils.loadAnimation(this, R.anim.slide_out_bottom);
        mTitle.setInAnimation(in);
        mTitle.setOutAnimation(out);

        movieAdapter = new MovieAdapter(movieList, this);
        coverFlow = (FeatureCoverFlow) findViewById(R.id.coverflow);
        coverFlow.setAdapter(movieAdapter);

        coverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle.setText(movieList.get(position).getName());
            }

            @Override
            public void onScrolling() {

            }
        });


    }

    private void initData() {


        movieList.add(new Movie("Himadri Tanya", "http://www.fotothing.com/photos/3f9/3f9fcea9ac3eada48d880e2e9c9544e9_dc6.jpg"));
        movieList.add(new Movie("Pallavi jha", "http://www.fotothing.com/photos/7bc/7bcdf6dec0de5529dcf9538347ac5472_76c.jpg"));
        movieList.add(new Movie("Kishore Kumar Saha", "http://www.fotothing.com/photos/3fd/3fd684fdc0cb9a7ca619ebcabff6c1c6.jpg"));
        movieList.add(new Movie("Apurv Abhijeet", "http://www.fotothing.com/photos/b4e/b4e5323af4ea8c325dd063dd423a64df_be2.jpg"));
        movieList.add(new Movie("Adarsh kumar", "http://www.fotothing.com/photos/e5c/e5c9ce00f7c9f14477d1670d14f9de4e_801.jpg"));

        movieList.add(new Movie("Jaya Parida Biswal", "http://www.fotothing.com/photos/f93/f9348068b9a6d9f54ffc00f584f4bc4b.jpg"));
        movieList.add(new Movie("Sarat Lohar", "http://www.fotothing.com/photos/bb2/bb2ab44ed5614919c2b34267f5822e36.jpg"));
        movieList.add(new Movie("Lily Pradhan", "http://www.fotothing.com/photos/8df/8df791487730b2e6c1e30ef07364a527.jpg"));
        movieList.add(new Movie("Manoj Kumar Thakur", "http://www.fotothing.com/photos/5cf/5cf758fa060ec3f2da66a3e16b660cce.jpg"));
        movieList.add(new Movie("Payal Pradhan", "http://www.fotothing.com/photos/726/7269acab4dec2c9a3768ab82daf22cdb_1d1.jpg"));
        movieList.add(new Movie("Prince Kumar", "http://www.fotothing.com/photos/cb6/cb60de5eaf973047b44154d56facfe82_e65.jpg"));
        movieList.add(new Movie("Pratiksha Pradhan", "http://www.fotothing.com/photos/75b/75bd86b810252c6a3ad3b71e819c7f86_689.jpg"));

        movieList.add(new Movie("Tarun Roy", "http://www.fotothing.com/photos/ce1/ce11412a9a47822cd544fbee631856b3_257.jpg"));
        movieList.add(new Movie("Ashwini Singh", "http://www.fotothing.com/photos/d1d/d1d48c03b51a67c9978896212102204d.jpg"));
        movieList.add(new Movie("Vishal Behera", "http://www.fotothing.com/photos/7c9/7c9641f93e0289970fd7d24ad73a1541.jpg"));
        movieList.add(new Movie("Priyanka Mahakul", "http://www.fotothing.com/photos/831/831221dd4b56ea71053301d1aecbb6b0_d9c.jpg"));
        movieList.add(new Movie("Prakash Behera", "http://www.fotothing.com/photos/538/538e3405bae9eb0247e8f30c8e45640a.jpg"));
        movieList.add(new Movie("Anuradha Ray", "http://www.fotothing.com/photos/1df/1df65b80069228d626ef30e205dc25fe_f43.jpg"));
        movieList.add(new Movie("Akash Ranjan Naik", "http://www.fotothing.com/photos/684/6844aa8fd7af75ed4250ed00f775f571.jpg"));
        movieList.add(new Movie("Devnath Pradhan", "http://www.fotothing.com/photos/d4c/d4ce3e644b2fd2b45d8d2dd9abfd6419.jpg"));
        movieList.add(new Movie("Sandhya Rani Subudhi", "http://www.fotothing.com/photos/413/413aba8ac6d2f89b77e192c1f322c851.jpg"));
        movieList.add(new Movie("Nadeem Warsi", "http://www.fotothing.com/photos/2f5/2f5e3a50683648d7c4b4415628de3e78.jpg"));
        movieList.add(new Movie("Prateek Mohanty", "http://www.fotothing.com/photos/52b/52b39aa66be901ea74fc71b113916014.jpg"));

        movieList.add(new Movie("Gouttam Nayak", "http://www.fotothing.com/photos/3bd/3bd6cd539feb1884107fc7628b2d674f_457.jpg"));
        movieList.add(new Movie("Tapan Khuntia", "http://www.fotothing.com/photos/bb2/bb244cbcf097b401e4ae0707b82db6b5_921.jpg"));
        movieList.add(new Movie("Rahul Kumar", "http://www.fotothing.com/photos/b75/b750ca18adecc652dd541465ecb179e4.jpg"));

        movieList.add(new Movie("Priyabrata Behera","http://www.fotothing.com/photos/d8c/d8c92011f33a61e324cff394bc03bbf5.jpg"));

        movieList.add(new Movie("Aswini kumar Parida","http://www.fotothing.com/photos/e29/e29304773d3c8733bd64657e1d8c54c9.jpg"));

    }
}
