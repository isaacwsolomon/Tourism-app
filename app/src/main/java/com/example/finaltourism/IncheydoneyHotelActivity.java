package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IncheydoneyHotelActivity extends AppCompatActivity {
    Button incheyhotelMoreJ, incheyCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incheydoney_hotel);
        //////////////////////////////////
        incheyhotelMoreJ = findViewById(R.id.moreButton);
        incheyhotelMoreJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.inchydoneyisland.com/"));
                startActivity(browserIntent);
            }

        });
        incheyCall = findViewById(R.id.pilgrimsCall);
        incheyCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0238833143"));
                startActivity(intent);
            }
        });
    }}