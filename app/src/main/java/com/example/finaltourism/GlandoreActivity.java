package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GlandoreActivity extends AppCompatActivity {
    Button glandoreMoreJ, glandoreCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glandore);
        //////////////////////////////////
        glandoreMoreJ = findViewById(R.id.moreButton);
        glandoreMoreJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pages/category/Bar/Glandore-Inn-425998134271336/"));
                startActivity(browserIntent);
            }
        });
        glandoreCall = findViewById(R.id.pilgrimsCall);
        glandoreCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02834494"));
                startActivity(intent);
            }
        });

    }
}