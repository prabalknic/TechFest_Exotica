package com.exotica.asus.theexotica2k18;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class WelcomeActivity extends AppCompatActivity {

    ImageView imageView;

    MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mediaplayer=MediaPlayer.create(WelcomeActivity.this,R.raw.exotica);
        mediaplayer.start();

        imageView=(ImageView)findViewById(R.id.imageView);
        android.view.animation.Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.welcome_activity);

        imageView.setAnimation(animation);

        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                finish();
                mediaplayer.stop();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
    }
