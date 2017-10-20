package com.example.anshul.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anshul on 19/7/17.
 */

public class TourGuideAdapter extends ArrayAdapter<TourGuide> {

    private int tgDirectionButton = 0;

    public TourGuideAdapter(Activity context, ArrayList<TourGuide> translations) {
        super(context, 0, translations);

    }

    public TourGuideAdapter(Activity context, ArrayList<TourGuide> translations, int directionButton) {
        super(context, 0, translations);
        tgDirectionButton = directionButton;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TourGuide currentTourGuide = getItem(position);

        TextView placeName = (TextView) listItemView.findViewById(R.id.place);
        placeName.setText(currentTourGuide.getName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentTourGuide.getImageResourceId());

        ImageView directionButtonView = (ImageView) listItemView.findViewById(R.id.direction_button);
        if (tgDirectionButton !=0 ) {
            directionButtonView.setVisibility(View.VISIBLE);
        } else {
            directionButtonView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
