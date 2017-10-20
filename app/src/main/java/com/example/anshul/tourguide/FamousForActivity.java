package com.example.anshul.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamousForActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("Pearl Jewellery", R.drawable.pearl_jewellery));
        tourGuide.add(new TourGuide("Bangles at Laad Bazaar", R.drawable.bangles));
        tourGuide.add(new TourGuide("Attar/Ittar (perfume)", R.drawable.perfume));
        tourGuide.add(new TourGuide("Hand-loom sarees", R.drawable.hand_loom_sarees));
        tourGuide.add(new TourGuide("Toys", R.drawable.toys));
        tourGuide.add(new TourGuide("Bidriware", R.drawable.bidriware));
        tourGuide.add(new TourGuide("Kalamkari art", R.drawable.kalamkari_art));
        tourGuide.add(new TourGuide("Banjara embroidery", R.drawable.banjara_embroidery));
        tourGuide.add(new TourGuide("Brass Artware ", R.drawable.brass_artware));
        tourGuide.add(new TourGuide("Wood Carvings", R.drawable.wood_carvings));
        tourGuide.add(new TourGuide("Rose Wood Furniture", R.drawable.rose_wood_furniture));
        tourGuide.add(new TourGuide("Stone Carvings", R.drawable.stone_carvings));
        tourGuide.add(new TourGuide("Leather Toys", R.drawable.leather_puppet));
        tourGuide.add(new TourGuide("Kondapalli Toys", R.drawable.kondapalli_toys));
        /*tourGuide.add(new TourGuide("Crochet Lace", R.drawable.crochet_lace));*/
        /*tourGuide.add(new TourGuide("Palm Leaf Crafts", R.drawable.palm_leaf_crafts));*/

        TourGuideAdapter tourGuideAdapter = new TourGuideAdapter(this, tourGuide);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(tourGuideAdapter);
    }
}
