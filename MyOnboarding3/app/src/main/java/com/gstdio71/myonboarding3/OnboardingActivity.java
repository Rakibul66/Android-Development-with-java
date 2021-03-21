package com.gstdio71.myonboarding3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnboardingActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addFragment(new Step.Builder().setTitle("This is header")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#171743")) // int background color
                .setDrawable(R.drawable.ss_1) // int top drawable
                .setSummary("This is summary")
                .build());
        //slide2
        addFragment(new Step.Builder().setTitle("This is header2")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#171743")) // int background color
                .setDrawable(R.drawable.ss_2) // int top drawable
                .setSummary("This is summary")

                .build());
//slide3
        addFragment(new Step.Builder().setTitle("This is header3")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#171743")) // int background color
                .setDrawable(R.drawable.ss_3) // int top drawable
                .setSummary("This is summary")
                .build());


    }


    @Override
    public void finishTutorial() {

    }


    @Override
    public void currentFragmentPosition(int position) {

    }

}
