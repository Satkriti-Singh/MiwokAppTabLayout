package com.example.dell.miwokapp;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);




        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager_id);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPageAdapter adapter = new SimpleFragmentPageAdapter(getSupportFragmentManager());

        adapter.AddFragment(new NumbersFragment(), "Numbers");
        adapter.AddFragment(new FamilyMembersFragment(), "Family Members");
        adapter.AddFragment(new ColorsFragment(), "Colors");
        adapter.AddFragment(new PhrasesFragment(), "Phrases");

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);


        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
    }


}
