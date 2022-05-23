package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChestnutActivity extends AppCompatActivity {
    Button chestnutMoreJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestnut);
        chestnutMoreJ = findViewById(R.id.moreButton);
        chestnutMoreJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.restaurantchestnutwestcork.ie/"));
                startActivity(browserIntent);
            }
        });
    }
}