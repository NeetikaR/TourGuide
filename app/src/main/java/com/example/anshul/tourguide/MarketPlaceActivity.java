package com.example.anshul.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MarketPlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("Laad Bazaar", R.drawable.laad_bazaar));
        tourGuide.add(new TourGuide("Shilparamam", R.drawable.shilparamam));
        tourGuide.add(new TourGuide("RuddBuddy", R.drawable.rudd_buddy));
        tourGuide.add(new TourGuide("SLN Terminus", R.drawable.sln_terminus));
        tourGuide.add(new TourGuide("Hyderabad Pearls", R.drawable.pearl));
        tourGuide.add(new TourGuide("Hyderabad My Way", R.drawable.hyderabad_my_way));
        tourGuide.add(new TourGuide("Antique Glass Creations ", R.drawable.antique_glass_creations));
        tourGuide.add(new TourGuide("Antiques Humayun", R.drawable.antiques_humayun));
        tourGuide.add(new TourGuide("Krishna Pearls & Jewellers", R.drawable.krishna_jewellers_pearls));
        tourGuide.add(new TourGuide("The Sunday Book Bazaar", R.drawable.book_bazaar));

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
