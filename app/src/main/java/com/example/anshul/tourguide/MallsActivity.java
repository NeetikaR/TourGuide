package com.example.anshul.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);;

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("Inorbit Mall", R.drawable.inorbit_mall));
        tourGuide.add(new TourGuide("The Forum Sujana Mall", R.drawable.forum_mall));
        tourGuide.add(new TourGuide("GVK One Mall", R.drawable.gvk_one_mall));
        tourGuide.add(new TourGuide("Manjeera Trinity Mall", R.drawable.manjeera_trinity_mall));
        tourGuide.add(new TourGuide("City Centre Mall", R.drawable.city_centre_mall));
        tourGuide.add(new TourGuide("The Chennai Shopping Mall", R.drawable.chennai_shopping_mall));
        tourGuide.add(new TourGuide("Hyderabad Central Mall", R.drawable.hyderabad_central_mall));
        tourGuide.add(new TourGuide("Cinepolis Mantra Mall ", R.drawable.cinepolis_mantra_mall));
        tourGuide.add(new TourGuide("Padmavathi Shopping Mall", R.drawable.padmavathi_shopping_mall));
        tourGuide.add(new TourGuide("Svm Mall", R.drawable.svm_mall));
        tourGuide.add(new TourGuide("Fmg Mall", R.drawable.fmg_mall));
        tourGuide.add(new TourGuide("Pegasus Shopping Mall", R.drawable.pegasus_shopping_mall));
        tourGuide.add(new TourGuide("Malli Shopping Centre", R.drawable.malli_shopping_centre));
        tourGuide.add(new TourGuide("Magna Mall", R.drawable.magna_mall));
        tourGuide.add(new TourGuide("Rks Grand Shopping Mall", R.drawable.rks_shopping_mall));
        tourGuide.add(new TourGuide("Maheshwari Palace Mall", R.drawable.maheshwari_palace_mall));
        tourGuide.add(new TourGuide("Mega Shopping Mall", R.drawable.mega_shopping_mall));
        tourGuide.add(new TourGuide("Lumbini Jewel Mall", R.drawable.lumbini_jewel_mall));

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
