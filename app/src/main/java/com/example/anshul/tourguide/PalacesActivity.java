package com.example.anshul.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PalacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();
        tourGuide.add(new TourGuide("Asman Ghar Palace", R.drawable.asman_ghar_palace, 17.367958, 78.515944));
        tourGuide.add(new TourGuide("Bella Vista Palace", R.drawable.bella_vista_palace, 17.414122, 78.459644));
        tourGuide.add(new TourGuide("Chowmahalla Palace", R.drawable.chowmahalla_palace, 17.357796, 78.471633));
        tourGuide.add(new TourGuide("Falak Palace", R.drawable.falak_palace, 17.360742, 78.474550));
        tourGuide.add(new TourGuide("King Koti Palace", R.drawable.koti_palace, 17.393021, 78.480844));
        tourGuide.add(new TourGuide("Purani Haveli", R.drawable.purani_haveli, 17.365497, 78.482675));
        tourGuide.add(new TourGuide("Taramati Baradari", R.drawable.taramati_baradari, 17.376194, 78.378112));

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
