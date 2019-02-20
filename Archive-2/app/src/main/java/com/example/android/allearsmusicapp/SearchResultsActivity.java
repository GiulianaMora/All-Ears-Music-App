package com.example.android.allearsmusicapp;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchResultsActivity extends AppCompatActivity {

    //handle lyric search by using Musixmatch lyrics API
    //read Musixmatch API terms & conditions and the privacy policy
    //register for an API key
    //read the docs on their wiki (API methods and input params)
    //integrate the Musixmatch service with app

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);


    Button artistButton = (Button)findViewById(R.id.artist_button);
        artistButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //Create a new to open the {@link NowPlaying Activity
            Intent nowPlayingIntent = new Intent (SearchResultsActivity.this, NowPlayingActivity.class);

            //Start the new activity
            startActivity(nowPlayingIntent);
        }
    });


}}
