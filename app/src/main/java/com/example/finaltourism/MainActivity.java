package com.example.finaltourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton pilgrimsImagebuttonJ,chestnuImagebuttonJ,buddsImagebuttonJ,glandoreImagebuttonJ,inchyImagebuttonJ,owenImagebuttonJ,barleyImagebuttonJ,warrenImagebuttonJ,mizenImagebuttonJ,durseyImagebuttonJ,beaconImagebuttonJ,hyneImagebuttonJ,schullImagebuttonJ,incheyspaImagebuttonJ,barleyhotelImagebuttonJ,ecclesImagebuttonJ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //////////////////////////////////////
        pilgrimsImagebuttonJ = findViewById(R.id.pilgrimsImagebutton);
        pilgrimsImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PilgrimActivity.class));
            }
        });
        chestnuImagebuttonJ = findViewById(R.id.chestnuImagebutton);
        chestnuImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ChestnutActivity.class));

            }
        });
        buddsImagebuttonJ = findViewById(R.id.buddsImagebutton);
        buddsImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, buddsActivity.class));

            }
        });
        glandoreImagebuttonJ = findViewById(R.id.glandoreImagebutton);
        glandoreImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,GlandoreActivity.class));

            }
        });
        inchyImagebuttonJ = findViewById(R.id.inchyImagebutton);
        inchyImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,InchdoneyBeachActivity.class));

            }
        });
        owenImagebuttonJ = findViewById(R.id.owenImagebutton);
        owenImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,OwenahinchaActivity.class));

            }
        });
        barleyImagebuttonJ = findViewById(R.id.barleyImagebutton);
        barleyImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BarleycoveBeachActivity.class));

            }
        });
        warrenImagebuttonJ = findViewById(R.id.warrenImagebutton);
        warrenImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,WarrenActivity.class));

            }
        });
        mizenImagebuttonJ = findViewById(R.id.mizenImagebutton);
        mizenImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MizenActivity.class));

            }
        });
        durseyImagebuttonJ = findViewById(R.id.durseyImagebutton);
        durseyImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,DurseyActivity.class));

            }
        });
        beaconImagebuttonJ = findViewById(R.id.beaconImagebutton);
        beaconImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BeaconActivity.class));

            }
        });
        hyneImagebuttonJ = findViewById(R.id.hyneImagebutton);
        hyneImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LochHyneActivity.class));

            }
        });
        schullImagebuttonJ = findViewById(R.id.schullImagebutton);
        schullImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SchullHotelActivity.class));

            }
        });
        incheyspaImagebuttonJ = findViewById(R.id.incheyspaImagebutton);
        incheyspaImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,IncheydoneyHotelActivity.class));

            }
        });
        barleyhotelImagebuttonJ = findViewById(R.id.barleyhotelImagebutton);
        barleyhotelImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BarleyHotelActivity.class));

            }
        });
        ecclesImagebuttonJ = findViewById(R.id.ecclesImagebutton);
        ecclesImagebuttonJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,EcclesActivity.class));

            }
        });
    }
}