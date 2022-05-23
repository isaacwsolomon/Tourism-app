package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BarleycoveBeachActivity extends AppCompatActivity {
    Button barleycovebeachMoreJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barleycove_beach);
        //////////////////////////////////
        barleycovebeachMoreJ = findViewById(R.id.moreButton);
        barleycovebeachMoreJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.theirishroadtrip.com/barleycove%E2%80%8C-%E2%80%8Cbeach%E2%80%8C-%E2%80%8Cin%E2%80%8C-%E2%80%8Ccork/"));
                startActivity(browserIntent);
            }
        });
    }
}