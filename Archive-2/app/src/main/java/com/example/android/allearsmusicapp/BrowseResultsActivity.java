package com.example.android.allearsmusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BrowseResultsActivity extends AppCompatActivity {

    //handle using spotify app remote SDK in order to play a suggested playlist from URI
    //prepare environment, authorize app, and connect to App remote

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_results);
    }
}
