package com.example.anshul.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.anshul.tourguide.R.string.religious_places;

public class ReliegiousPlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("Ananda Buddha Vihara", R.drawable.ananda_buddha_vihara, 17.448314, 78.521471));
        tourGuide.add(new TourGuide("Birla Mandir", R.drawable.birla_temple, 17.406247, 78.469028));
        tourGuide.add(new TourGuide("Chilkoor Balaji Temple", R.drawable.chilkoor_balaji_temple, 17.356821, 78.299814));
        tourGuide.add(new TourGuide("Jagannath Temple", R.drawable.jagannath_temple, 17.431124, 78.457812));
        tourGuide.add(new TourGuide("Sri Lakshminarasimha Swamy Temple", R.drawable.lakshminarasimha_swamy_temple,
                17.664991, 78.552310));
        tourGuide.add(new TourGuide("Ratnalayam Temple", R.drawable.ratnalayam_temple, 17.619293, 78.573042));
        tourGuide.add(new TourGuide("Shahi Masjid", R.drawable.shahi_masjid, 17.400524, 78.469059));
        tourGuide.add(new TourGuide("Sanghi Temple", R.drawable.sanghi_temple, 17.266900, 78.675882));
        tourGuide.add(new TourGuide("Wargal Saraswati Temple", R.drawable.wargal_temple, 17.769549, 78.620642));

        TourGuideAdapter tourGuideAdapter = new TourGuideAdapter(this, tourGuide, 1);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(tourGuideAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                TourGuide tg = tourGuide.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(tg.getGregorian()));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
