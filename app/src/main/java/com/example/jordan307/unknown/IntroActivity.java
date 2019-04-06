package com.example.jordan307.unknown;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabIndicator;
    Button btnGetStarted;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Activity set to full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_intro);


        // ini views

        tabIndicator = findViewById(R.id.tab_indicator);
        btnGetStarted = findViewById(R.id.btn_get_started);

        // Fill list screen
        List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Connor", "A team leader, logical thinker and problem solver. He plans things before making decisions and relies on others for approval to move forward. He lacks confidence at times and is afraid of heights, he can't swim well either.",R.drawable.connor));
        mList.add(new ScreenItem("Amy", "Survival training background and can adapt to different environments. She can be difficult to deal with as she believes her opinion is always best. She is claustrophobic and avoids socialising. ",R.drawable.amy));
        mList.add(new ScreenItem("Trevor", "He knows how to keep people calm during stressful moments. Has always been a persistent person on achieving tasks and motivating others. He fears death and would never put himself in a situation that could risk his life.",R.drawable.trevor));
        mList.add(new ScreenItem("Evelyn", "She is observant, kind and has a positive attitude. A lot of people trust her as she is confident and open minded. She doesn't like to be alone, especially in the dark. Her anxiety can take over unpredictably, which will cause her to think irrationally.  ",R.drawable.evelyn));

        // Setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);


        // Get started button click listener

        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Open main activity
                Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mainActivity);

            }
        });

        // Setup tab layout with viewpager

        tabIndicator.setupWithViewPager(screenPager);

    }
}
