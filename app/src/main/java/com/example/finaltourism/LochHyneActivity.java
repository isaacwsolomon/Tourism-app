package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LochHyneActivity extends AppCompatActivity {
    Button hyneButtonJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loch_hyne);
        //////////////////////////////////
        hyneButtonJ = findViewById(R.id.moreButton);
        hyneButtonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.discoveringireland.com/vacations/lough-hyne/"));
                startActivity(browserIntent);
            }
        });
    }

    }
