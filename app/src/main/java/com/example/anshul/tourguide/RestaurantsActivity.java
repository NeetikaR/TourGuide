package com.example.anshul.tourguide;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourguide_list);

        final ArrayList<TourGuide> tourGuide = new ArrayList<TourGuide>();

        tourGuide.add(new TourGuide("Dakshin", R.drawable.restaurant_dakshin));
        tourGuide.add(new TourGuide("MoMo Cafe", R.drawable.restaurant_momo_cafe));
        tourGuide.add(new TourGuide("Deccan Pavilion", R.drawable.restaurant_deccan_pavilion));
        tourGuide.add(new TourGuide("Gokul Chat Bhandar", R.drawable.gokul_chat_bhandar));
        tourGuide.add(new TourGuide("Sardarji's Dhaba", R.drawable.restaurant_sardarji_dhaba));
        tourGuide.add(new TourGuide("Pizza Den", R.drawable.restaurant_pizza_den));
        tourGuide.add(new TourGuide("Tease", R.drawable.restaurant_tease));
        tourGuide.add(new TourGuide("Heart Cup Coffee ", R.drawable.restaurant_heart_cup_coffee));
        tourGuide.add(new TourGuide("The Coffee Cup", R.drawable.restaurant_coffee_cup));
        tourGuide.add(new TourGuide("Tea Trails", R.drawable.restaurant_tea_trails));
        tourGuide.add(new TourGuide("Waffle House", R.drawable.restaurant_waffle_house));
        tourGuide.add(new TourGuide("The Chocolate Room", R.drawable.restaurant_choclate_room));
        tourGuide.add(new TourGuide("Beyond Coffee", R.drawable.restaurant_beyond_coffee));

        TourGuideAdapter tourGuideAdapter = new TourGuideAdapter(this, tourGuide, 1);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(tourGuideAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                TourGuide tg = tourGuide.get(position);
                Intent webPageIntent = new Intent(Intent.ACTION_VIEW);
                webPageIntent.setData(Uri.parse("http://techblogon.com"));

                try {
                    startActivity(webPageIntent);
                } catch (ActivityNotFoundException ex) {
                    // can do something about the exception.
                }
                /*Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(tg.getGregorian()));
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }*/
            }
        });

        /*ImageView direction = (ImageView) findViewById(R.id.direction_button);
        direction.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                TourGuide tg = tourGuide.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(tg.getGregorian()));
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });*/
    }
}
