package com.maanvith.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class exploreScreen extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_screen);

        Toolbar toolbar = findViewById(R.id.toolbarexplore);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setBackgroundColor(getResources().getColor(R.color.toolbar));

        toolbar.setNavigationIcon(R.drawable.menu);


        getWindow().setStatusBarColor(getResources().getColor(R.color.status));


        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new fragment1(),"Personal");
        vpAdapter.addFragment(new fragment2(), "Buisiness");
        vpAdapter.addFragment(new fragment3(),"Merchant");
        viewPager.setAdapter(vpAdapter);
        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(exploreScreen.this, refineScreen.class);
                startActivity(i);
            }
        });


    }
}