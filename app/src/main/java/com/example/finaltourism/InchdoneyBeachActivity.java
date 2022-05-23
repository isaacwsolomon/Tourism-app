package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InchdoneyBeachActivity extends AppCompatActivity {
    Button incheydoneybeachMoreJ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inchdoney_beach);
        //////////////////////////////////
        incheydoneybeachMoreJ = findViewById(R.id.moreButton);
        incheydoneybeachMoreJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.theirishroadtrip.com/inchydoney-beach-cork/"));
                startActivity(browserIntent);
            }
        });
    }
}