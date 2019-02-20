package com.example.android.allearsmusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        Button button = (Button)findViewById(R.id.browse_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new to open the {@link SearchResults Activity
                Intent browseResultsIntent = new Intent (BrowseActivity.this, BrowseResultsActivity.class);

                //Start the new activity
                startActivity(browseResultsIntent);
            }
        });

    }
    public void onButtonClickBrowse(View view) {
        //Where user can type in lyrics or song title in text field that they are searching for
        EditText browseEditText = (EditText) findViewById(R.id.browse_user_input);
        browseEditText.setHint("Type In Artist or Song Title");

    }
}



