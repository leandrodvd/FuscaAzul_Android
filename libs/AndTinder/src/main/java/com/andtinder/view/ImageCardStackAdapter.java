package com.andtinder.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.andtinder.R;

import com.andtinder.model.CardModel;

/**
 * Created by android5519 on 12/01/16.
 */
public class ImageCardStackAdapter extends CardStackAdapter{
    public ImageCardStackAdapter(Context context) {
        super(context);
    }

    @Override
    protected View getCardView(int position, CardModel model, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.image_card, parent, false);
            assert convertView != null;
        }

        ((ImageView) convertView.findViewById(R.id.image)).setImageDrawable(model.getCardImageDrawable());
        return convertView;
    }
}
