package com.example.dell.miwokapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by DELL on 27-05-2018.
 */

public class NumbersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();
    }
}



