package com.leandrodavid.fuscaazul;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import com.andtinder.model.CardModel;

/**
 * Created by android5519 on 12/01/16.
 */
public class GameCardModel extends CardModel {
    private Car car;


    public GameCardModel(String title, String description, Drawable cardImage, Car car) {
        super(title, description, cardImage);
        this.car = car;
    }

    public GameCardModel(String title, String description, Bitmap cardImage, Car car) {
        super(title, description, cardImage);
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
