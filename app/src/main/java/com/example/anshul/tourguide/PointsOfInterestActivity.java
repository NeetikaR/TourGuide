package com.example.anshul.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.anshul.tourguide.R.id.famousFood;
import static com.example.anshul.tourguide.R.id.famousFor;

public class PointsOfInterestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points_of_interest);

        TextView historicalMonuments = (TextView) findViewById(R.id.historicalMonuments);
        historicalMonuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historicalMonumentsIntent = new Intent(PointsOfInterestActivity.this, HistoricalMonumentsActivity.class);
                startActivity(historicalMonumentsIntent);
            }
        });

        TextView palaces = (TextView) findViewById(R.id.palaces);
        palaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent palacesIntent = new Intent(PointsOfInterestActivity.this, PalacesActivity.class);
                startActivity(palacesIntent);
            }
        });

        TextView religiousPlaces = (TextView) findViewById(R.id.religiousPlaces);
        religiousPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent religiousPlacesIntent = new Intent(PointsOfInterestActivity.this, ReliegiousPlacesActivity.class);
                startActivity(religiousPlacesIntent);
            }
        });

        TextView museumsPlanetarium = (TextView) findViewById(R.id.museumsPlanetarium);
        museumsPlanetarium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumsPlanetariumIntent = new Intent(PointsOfInterestActivity.this, MuseumsPlanetariumActivity.class);
                startActivity(museumsPlanetariumIntent);
            }
        });

        TextView hyderabadLakes = (TextView) findViewById(R.id.hyderabadLakes);
        hyderabadLakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hyderabadLakesIntent = new Intent(PointsOfInterestActivity.this, LakesActivity.class);
                startActivity(hyderabadLakesIntent);
            }
        });

        TextView parksGardens = (TextView) findViewById(R.id.parksGardens);
        parksGardens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parksGardensIntent = new Intent(PointsOfInterestActivity.this, ParksGardensActivity.class);
                startActivity(parksGardensIntent);
            }
        });

        TextView wildlife = (TextView) findViewById(R.id.wildlife);
        wildlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wildlifeIntent = new Intent(PointsOfInterestActivity.this, WildlifeActivity.class);
                startActivity(wildlifeIntent);
            }
        });

        TextView other = (TextView) findViewById(R.id.others);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherIntent = new Intent(PointsOfInterestActivity.this, OtherActivity.class);
                startActivity(otherIntent);
            }
        });
    }
}
