package com.example.anshul.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamousFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("Hyderabadi Biryani", R.drawable.hyderabadi_biryani));
        tourGuide.add(new TourGuide("Karachi fruit biscuits", R.drawable.karachi_fruit_biscuits));
        tourGuide.add(new TourGuide("Hyderadabadi Paan", R.drawable.paan));

        TourGuideAdapter tourGuideAdapter = new TourGuideAdapter(this, tourGuide);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(tourGuideAdapter);
    }
}
