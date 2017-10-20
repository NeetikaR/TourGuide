package com.example.anshul.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("Ramoji Film City", R.drawable.ramoji_film_city, 17.254321, 78.680746));
        tourGuide.add(new TourGuide("Ravindra Bharati", R.drawable.bharati, 17.403488, 78.466838));
        tourGuide.add(new TourGuide("Necklace road", R.drawable.necklace_road, 17.430545, 78.462984));
        tourGuide.add(new TourGuide("Keesara", R.drawable.keesara, 17.528282, 78.654222));
        tourGuide.add(new TourGuide("Rachakonda ", R.drawable.rachakond, 17.181303, 78.803118));
        tourGuide.add(new TourGuide("Sudha Cars Museum", R.drawable.sudha_cars_museum, 17.357034, 78.454365));
        tourGuide.add(new TourGuide("Pragati Green Meadows", R.drawable.pragati_green_meadows, 17.368448, 78.223636));
        tourGuide.add(new TourGuide("Runway 9", R.drawable.runway_9, 17.535112, 78.488541));
        tourGuide.add(new TourGuide("Ocean Park", R.drawable.ocean_park, 17.391085, 78.329601));
        tourGuide.add(new TourGuide("Mount Opera", R.drawable.mount_opera, 17.316386, 78.719022));
        tourGuide.add(new TourGuide("Dhola-ri-Dhani", R.drawable.dhola_ri_dhani, 17.545268, 78.492608));
        tourGuide.add(new TourGuide("Hitex Exhibition Centre", R.drawable.hitex_exhibition_centre, 17.470399, 78.376491));

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
