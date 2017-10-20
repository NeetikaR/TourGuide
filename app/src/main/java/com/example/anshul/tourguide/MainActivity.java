package com.example.anshul.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity", "onCreate");

        TextView pointsOfInterest = (TextView) findViewById(R.id.pointOfInterest);
        pointsOfInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pointsOfInterestIntent = new Intent(MainActivity.this, PointsOfInterestActivity.class);
                startActivity(pointsOfInterestIntent);
            }
        });

        TextView hotels = (TextView) findViewById(R.id.hotels);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelIntent);
            }
        });

        TextView restaurants = (TextView) findViewById(R.id.restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        TextView famousFood = (TextView) findViewById(R.id.famousFood);
        famousFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent famousFoodIntent = new Intent(MainActivity.this, FamousFoodActivity.class);
                startActivity(famousFoodIntent);
            }
        });

        TextView famousFor = (TextView) findViewById(R.id.famousFor);
        famousFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent famousForIntent = new Intent(MainActivity.this, FamousForActivity.class);
                startActivity(famousForIntent);
            }
        });

        TextView marketplace = (TextView) findViewById(R.id.marketplace);
        marketplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent marketplaceIntent = new Intent(MainActivity.this, MarketPlaceActivity.class);
                startActivity(marketplaceIntent);
            }
        });

        TextView malls = (TextView) findViewById(R.id.malls);
        malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mallsIntent = new Intent(MainActivity.this, MallsActivity.class);
                startActivity(mallsIntent);
            }
        });

        TextView artGalleries = (TextView) findViewById(R.id.art_galleries);
        artGalleries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artGalleriesIntent = new Intent(MainActivity.this, ArtGalleryActivity.class);
                startActivity(artGalleriesIntent);
            }
        });
    }
}
