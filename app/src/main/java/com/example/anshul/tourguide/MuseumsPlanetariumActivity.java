package com.example.anshul.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.anshul.tourguide.R.string.religious_places;

public class MuseumsPlanetariumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("TS State Archaeology Museum", R.drawable.ap_state_archaeology_museum,
                17.399200, 78.470306));
        tourGuide.add(new TourGuide("Birla Science Museum", R.drawable.birla_science_museum, 17.403222, 78.470688));
        tourGuide.add(new TourGuide("KiDiHOU Children's Play Museum", R.drawable.kidihou_childrens_museum,
                17.453726, 78.367142));
        tourGuide.add(new TourGuide("Salar Jung Museum", R.drawable.salar_jung, 17.371275, 78.480375));
        tourGuide.add(new TourGuide("Surendrapuri", R.drawable.surendrapuri, 17.564852, 78.945270));

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
