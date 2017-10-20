package com.example.anshul.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtGalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("Birla Science Center", R.drawable.birla_science_museum));
        tourGuide.add(new TourGuide("Kalakriti Art Gallery", R.drawable.kalakriti_art_gallery));
        tourGuide.add(new TourGuide("Picasso Art Gallery", R.drawable.picasso_art_gallery));
        tourGuide.add(new TourGuide("Lakshana Art Gallery", R.drawable.lakshana_art_gallery));
        tourGuide.add(new TourGuide("Achala Studios", R.drawable.achala_studios));
        tourGuide.add(new TourGuide("Art Antiqua", R.drawable.art_antiqua));
        tourGuide.add(new TourGuide("Vishwakarma Arts Gallery", R.drawable.vishwakarma_arts_gallery));
        tourGuide.add(new TourGuide("Muse Art Gallery", R.drawable.muse_art_gallery));
        tourGuide.add(new TourGuide("Earth Art Gallery", R.drawable.earth_art_gallery));
        tourGuide.add(new TourGuide("ICCR Art Gallery", R.drawable.iccr_art_gallery));
        tourGuide.add(new TourGuide("Inspire Art Gallery", R.drawable.inspire_art_gallery));

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
