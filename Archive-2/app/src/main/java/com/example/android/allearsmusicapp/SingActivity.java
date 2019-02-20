package com.example.android.allearsmusicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SingActivity extends AppCompatActivity {

    //handle features like singing karaoke and record while singing by using Karaoke Online: Sing & Record APK (download)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing);

        Button button = (Button)findViewById(R.id.search_songs_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new to open the {@link SearchResults Activity
                Intent singResultsIntent = new Intent (SingActivity.this, SingResultsActivity.class);

                //Start the new activity
                startActivity(singResultsIntent);
            }
        });

    }
    public void onButtonClickBrowse(View view) {
        //Where user can type in lyrics or song title in text field that they are searching for
        EditText browseEditText = (EditText) findViewById(R.id.browse_user_input);
        browseEditText.setHint("Enter Song to Sing");

    }
}