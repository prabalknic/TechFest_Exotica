package com.exotica.asus.theexotica2k18;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    MediaPlayer mediaplayer1;

    Typeface tfc1, tfc2;

    TextView text, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mediaplayer1 = MediaPlayer.create(MainActivity.this, R.raw.theexotica);
        mediaplayer1.setLooping(true);
        mediaplayer1.start();


        text = (TextView) findViewById(R.id.head);
        text2 = (TextView) findViewById(R.id.desc);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        tfc1 = Typeface.createFromAsset(getAssets(), "font/Ar.ttf");
        text.setTypeface(tfc1);
        tfc2 = Typeface.createFromAsset(getAssets(), "font/At.ttf");
        text2.setTypeface(tfc2);
    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))

        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);


            builder.setMessage("Are you sure you want to exit?")
                    .setTitle("Really exit ?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            MainActivity.super.onBackPressed();
                            mediaplayer1.stop();
                        }
                    }).setNegativeButton("No", null);

            AlertDialog alert = builder.create();
            alert.show();
        }



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            // Handle the camera action
        } else if (id == R.id.events) {

            Intent e = new Intent(MainActivity.this, Events.class);
            mediaplayer1.stop();
            startActivity(e);


        } else if (id == R.id.gallery) {
            Intent g = new Intent(MainActivity.this, Gallery.class);
            mediaplayer1.stop();
            startActivity(g);


        } else if (id == R.id.team_exotica) {

            Intent t = new Intent(MainActivity.this, teamexotica.class);
            mediaplayer1.stop();
            startActivity(t);

        } else if (id == R.id.developers) {

            Intent d = new Intent(MainActivity.this, developer.class);
            mediaplayer1.stop();
            startActivity(d);

        } else if (id == R.id.map) {

            Intent m = new Intent(MainActivity.this, Map.class);
            mediaplayer1.stop();
            startActivity(m);


        } else if (id == R.id.sponsors) {

            Intent s = new Intent(MainActivity.this, Sponsors.class);
            mediaplayer1.stop();
            startActivity(s);

        } else if (id == R.id.faq) {

            Intent f = new Intent(MainActivity.this, Faq.class);
            mediaplayer1.stop();
            startActivity(f);

        } else if (id == R.id.website) {

            Intent w = new Intent(Intent.ACTION_VIEW, Uri.parse("http://theexotica2k18.in"));
            mediaplayer1.stop();
            startActivity(w);

        } else if (id == R.id.contact) {

            Intent c = new Intent(MainActivity.this, Contact.class);
            mediaplayer1.stop();
            startActivity(c);


        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }


}
