package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SchullHotelActivity extends AppCompatActivity {
    Button schullMoreJ, schullCallJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schull_hotel);
        //////////////////////////////////
        schullMoreJ = findViewById(R.id.moreButton);
        schullMoreJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.schullharbourhotel.ie/"));
                startActivity(browserIntent);
            }
        });
        schullCallJ = findViewById(R.id.pilgrimsCall);
        schullCallJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02828801"));
                startActivity(intent);
            }
        });
    }
}