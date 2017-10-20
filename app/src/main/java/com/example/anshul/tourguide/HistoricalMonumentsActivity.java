package com.example.anshul.tourguide;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.anshul.tourguide.R.id.historicalMonuments;

public class HistoricalMonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();
        tourGuide.add(new TourGuide("Charminar", R.drawable.charminar, 17.361523, 78.474686));
        tourGuide.add(new TourGuide("Golkonda Fort", R.drawable.golkonda_fort,  17.383299, 78.401064));
        tourGuide.add(new TourGuide("Mecca Masjid", R.drawable.mecca_masjid,  17.360462, 78.473571));
        tourGuide.add(new TourGuide("Paigah Tombs", R.drawable.paigah_toms,  17.343601, 78.504147));
        tourGuide.add(new TourGuide("Qutab Shah Tombs", R.drawable.qutb_shah_tomb, 17.395008, 78.396808 ));
        tourGuide.add(new TourGuide("Spanish Mosque", R.drawable.spanish_mosque, 17.443876, 78.472566));

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
