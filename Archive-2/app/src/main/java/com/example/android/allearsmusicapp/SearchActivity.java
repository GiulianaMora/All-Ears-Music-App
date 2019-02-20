package com.example.android.allearsmusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button searchButton = (Button)findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new to open the {@link SearchResults Activity
                Intent searchResultsIntent = new Intent (SearchActivity.this, SearchResultsActivity.class);

                //Start the new activity
                startActivity(searchResultsIntent);
            }
        });


    }
    public void onButtonClickSearch(View view) {
        //Where user can type in lyrics or song title in text field that they are searching for
        EditText searchEditText = (EditText) findViewById(R.id.search_user_input);
        searchEditText.setHint("Type in Lyrics");

    }
}
