package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BarleyHotelActivity extends AppCompatActivity {
    Button barleyhotelMoreJ, barleyCallJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barley_hotel);
        //////////////////////////////////
        barleyhotelMoreJ = findViewById(R.id.moreButton);
        barleyhotelMoreJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.ie/Hotel_Review-g551490-d631073-Reviews-Barleycove_Beach_Hotel-Goleen_County_Cork.html"));
                startActivity(browserIntent);
            }
        });
        barleyCallJ = findViewById(R.id.pilgrimsCall);
        barleyCallJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02835874"));
                startActivity(intent);
            }
        });
    }
}