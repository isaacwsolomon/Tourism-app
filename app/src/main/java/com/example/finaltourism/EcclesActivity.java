package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EcclesActivity extends AppCompatActivity {
    Button ecclesMoreJ, ecclesCallJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eccles);
        //////////////////////////////////
        ecclesMoreJ = findViewById(R.id.moreButton);
        ecclesMoreJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eccleshotel.com/"));
                startActivity(browserIntent);
            }
        });
        ecclesCallJ = findViewById(R.id.pilgrimsCall);
        ecclesCallJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02763003"));
                startActivity(intent);
            }
        });
    }
}