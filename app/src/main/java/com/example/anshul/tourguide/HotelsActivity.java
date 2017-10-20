package com.example.anshul.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.anshul.tourguide.R.id.historicalMonuments;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("Radisson Hyderabad Hitec City", R.drawable.hotel_radisson,
                17.447403, 78.363093 ));
        tourGuide.add(new TourGuide("Trident Hyderabad", R.drawable.hotel_trident, 17.449819, 78.378957));
        tourGuide.add(new TourGuide("Novotel Hyderabad Convention Centre", R.drawable.hotel_novotel, 17.472708, 78.372783));
        tourGuide.add(new TourGuide("Best Western Ashoka", R.drawable.hotel_ashoka, 17.404158, 78.465312));
        tourGuide.add(new TourGuide("Hotel Sai Prakash", R.drawable.hotel_sai_prakash, 17.390484, 78.470825));
        tourGuide.add(new TourGuide("Hyderabad Marriott Hotel & Convention Centre", R.drawable.hotel_marriott, 17.424165, 78.487229));
        tourGuide.add(new TourGuide("Hyatt Hyderabad", R.drawable.hotel_hyatt, 17.418501, 78.342070));
        tourGuide.add(new TourGuide("The Golkonda Hyderabad", R.drawable.hotel_the_golkonda, 17.404425, 78.453920));
        tourGuide.add(new TourGuide("The Westin Hyderabad Mindspace", R.drawable.hotel_westin, 17.442374, 78.381769));
        tourGuide.add(new TourGuide("The Park Hyderabad", R.drawable.hotel_park, 17.423707, 78.462145));
        tourGuide.add(new TourGuide("Taj Krishna Hyderabad", R.drawable.hotel_taj_krishna, 17.416491, 78.449722));
        tourGuide.add(new TourGuide("Lahari Resorts", R.drawable.lahari_resorts, 17.482564, 78.185892));
        tourGuide.add(new TourGuide("Alankrita Resorts", R.drawable.alankrita_resorts, 17.573493, 78.558230));
        tourGuide.add(new TourGuide("Leonia Holistic Resort", R.drawable.leonia_holistic_resort, 17.577825, 78.601551));
        tourGuide.add(new TourGuide("Dream Valley Resorts", R.drawable.dream_valley, 17.417856, 78.446973));
        tourGuide.add(new TourGuide("Treasure Island Resorts", R.drawable.treasure_island, 17.391333, 78.314896));

        TourGuideAdapter tourGuideAdapter = new TourGuideAdapter(this, tourGuide, 1);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(tourGuideAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                TourGuide tg = tourGuide.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(tg.getGregorian()));
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });
    }
}
