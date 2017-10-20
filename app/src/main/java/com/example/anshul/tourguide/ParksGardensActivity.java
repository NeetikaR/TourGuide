package com.example.anshul.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksGardensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("Indira Park", R.drawable.indira_park, 17.413120, 78.485274));
        tourGuide.add(new TourGuide("Kotla Vijayabhaskara Reddy Botanical Gardens", R.drawable.botanical_garden,
                17.456710, 78.360884));
        tourGuide.add(new TourGuide("Lotus Pond", R.drawable.lotus_pond, 17.413591, 78.420617));
        tourGuide.add(new TourGuide("Lumbini Park", R.drawable.lumbini_park, 17.409915, 78.473084));
        tourGuide.add(new TourGuide("Mahavir Harina Vanasthali National Park", R.drawable.national_park,
                17.335445, 78.585161));
        tourGuide.add(new TourGuide("NTR Gardens", R.drawable.ntr_garden, 17.412036, 78.470430));

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
