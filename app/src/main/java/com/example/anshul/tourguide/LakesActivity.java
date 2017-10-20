package com.example.anshul.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LakesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("Durgam Cheruvu ", R.drawable.durgam_cheruvu, 17.428993, 78.389202));
        tourGuide.add(new TourGuide("Himayat Sagar", R.drawable.himayat_sagar, 17.319550, 78.358055));
        tourGuide.add(new TourGuide("Hussain Sagar", R.drawable.hussain_sagar, 17.426561, 78.471426));
        tourGuide.add(new TourGuide("Mir Alam Tank", R.drawable.mir_alam_tank, 17.348343, 78.436218));
        tourGuide.add(new TourGuide("Osman Sagar, Gandipet Lake", R.drawable.osman_sagar_gandipet_lake,
                17.380045, 78.304265));
        tourGuide.add(new TourGuide("Saroornagar Lake", R.drawable.saroornagar_lake, 17.355871, 78.527757));
        tourGuide.add(new TourGuide("Shamirpet Lake", R.drawable.shamirpet_lake, 17.612314, 78.561338));

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
