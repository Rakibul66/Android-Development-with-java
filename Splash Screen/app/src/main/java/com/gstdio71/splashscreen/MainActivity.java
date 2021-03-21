package com.gstdio71.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView thumb_up;
    LottieAnimationView thumb_down;
    LottieAnimationView toggle;
    int flag = 0;
    private static int SPLASH_SCREEN = 1200;
    Animation topAnim, bottomAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //Set animation to elements



        //Calling New Activity after SPLASH_SCREEN seconds 1s = 1000
        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                                          startActivity(intent);
                                          finish();

                                      }
                                  }, //Pass time here
                SPLASH_SCREEN);
        thumb_up = findViewById(R.id.lav_actionBar);
    }
        private void changeState () {
            if (flag == 0) {
                toggle.setMinAndMaxProgress(0f, 0.33f); //Here, calculation is done on the basis of start and stop frame divided by the total number of frames
                toggle.playAnimation();
                flag = 1;
                //---- Your code here------
            } else {
                toggle.setMinAndMaxProgress(0.5f, 1f);
                toggle.playAnimation();
                flag = 0;
                //---- Your code here------
            }
        }
    }
