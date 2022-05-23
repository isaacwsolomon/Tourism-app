package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PilgrimActivity extends AppCompatActivity {
    Button moreButtonJ, pilgrimCallJ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilgrim);
        //////////////////////////////////
        moreButtonJ = findViewById(R.id.moreButton);
        moreButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pilgrims.ie/new-page"));
                startActivity(browserIntent);
            }
        });
        pilgrimCallJ = findViewById(R.id.pilgrimsCall);
        pilgrimCallJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0238831796"));
                startActivity(intent);
            }
        });

    }
}