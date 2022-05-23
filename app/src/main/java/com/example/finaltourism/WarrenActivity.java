package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WarrenActivity extends AppCompatActivity {
    Button warrenMoreJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warren);
        //////////////////////////////////
        warrenMoreJ = findViewById(R.id.moreButton);
        warrenMoreJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.ie/Attraction_Review-g1009315-d14990876-Reviews-Warren_Beach-Rosscarbery_County_Cork.html"));
                startActivity(browserIntent);
            }
        });
    }
}