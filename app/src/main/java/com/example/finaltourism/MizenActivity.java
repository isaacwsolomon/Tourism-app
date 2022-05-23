package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MizenActivity extends AppCompatActivity {
    Button mizenMoreJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mizen);
        //////////////////////////////////
        mizenMoreJ = findViewById(R.id.moreButton);
        mizenMoreJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mizenhead.ie/"));
                startActivity(browserIntent);
            }
        });
    }
}