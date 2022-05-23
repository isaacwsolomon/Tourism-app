package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OwenahinchaActivity extends AppCompatActivity {
    Button owenahinchaMoreJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owenahincha);
        //////////////////////////////////
        owenahinchaMoreJ = findViewById(R.id.moreButton);
        owenahinchaMoreJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.discoverireland.ie/cork/owenahincha-beach"));
                startActivity(browserIntent);
            }
        });
    }
}