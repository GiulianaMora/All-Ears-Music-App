package com.example.android.allearsmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the search category
        TextView search = (TextView) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the browse category
        TextView browse = (TextView) findViewById(R.id.browse);

        // Set a click listener on that View
        browse.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent browseIntent = new Intent(MainActivity.this, BrowseActivity.class);

                // Start the new activity
                startActivity(browseIntent);
            }
        });


        // Find the View that shows the phrases category
        TextView singIt = (TextView) findViewById(R.id.sing_it);

        // Set a click listener on that View
        singIt.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent singItIntent = new Intent(MainActivity.this, SingActivity.class);

                // Start the new activity
                startActivity(singItIntent);
            }
        });
    }
    public void openSearchList (View view) {
        Intent i = new Intent(this, SearchActivity.class);
        startActivity(i);
    }

}