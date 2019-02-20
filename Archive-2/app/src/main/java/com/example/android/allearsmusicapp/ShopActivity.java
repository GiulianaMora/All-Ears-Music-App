package com.example.android.allearsmusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Button purchaseButton = (Button)findViewById(R.id.purchase_button);
        purchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new to open the {@link SearchResults Activity
                Intent purchaseActivityIntent = new Intent (ShopActivity.this, PurchaseActivity.class);

                //Start the new activity
                startActivity(purchaseActivityIntent);
            }
        });

    }
}
