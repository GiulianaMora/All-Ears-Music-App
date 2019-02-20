package com.example.android.allearsmusicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    //handle music playing with MediaPlayer APIs, can play audio files from data stream (external urls) arriving over a network connection
    //use MediaPlayer and AudioManager classes
    //ensure manifest has the appropriate declarations to allow use of feature such as internet permission and wake lock permission

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button shopButton = (Button)findViewById(R.id.shop_button);
        shopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new to open the {@link SearchResults Activity
                Intent shopIntent = new Intent (NowPlayingActivity.this, PurchaseActivity.class);

                //Start the new activity
                startActivity(shopIntent);
            }
        });
    }
}
