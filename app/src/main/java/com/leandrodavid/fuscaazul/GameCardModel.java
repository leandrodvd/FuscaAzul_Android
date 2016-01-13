package com.leandrodavid.fuscaazul;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import com.andtinder.model.CardModel;

/**
 * Created by android5519 on 12/01/16.
 */
public class GameCardModel extends CardModel {
    private boolean isFuscaAzul;


    public GameCardModel(String title, String description, Drawable cardImage, boolean isFuscaAzul) {
        super(title, description, cardImage);
        this.isFuscaAzul = isFuscaAzul;
    }

    public GameCardModel(String title, String description, Bitmap cardImage, boolean isFuscaAzul) {
        super(title, description, cardImage);
        this.isFuscaAzul = isFuscaAzul;
    }

    public boolean isFuscaAzul() {
        return isFuscaAzul;
    }
}
