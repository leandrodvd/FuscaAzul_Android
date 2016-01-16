package com.leandrodavid.fuscaazul;

import android.app.Activity;
import android.widget.Toast;

import com.andtinder.model.CardModel;

/**
 * Created by android5519 on 15/01/16.
 */
public class GameCardDismissedListener implements CardModel.OnCardDismissedListener {
     private Car car;
     private Activity activity;

    public GameCardDismissedListener(Car car,Activity activity) {
        this.car = car;
        this.activity=activity;
    }

    @Override
    public void onLike() {
        if(this.car.isFuscaAzul()){
            GameController.getGameController(activity).addAcerto();

        }
        Toast.makeText(activity, "I liked it  " + car.getID() + " " + this.car.isFuscaAzul(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDislike() {
        if(!car.isFuscaAzul()){
            GameController.getGameController(activity).addAcerto();

        }
        Toast.makeText(activity,"I did not liked it "+ car.getID() + " "+car.isFuscaAzul(),Toast.LENGTH_SHORT).show();

    }
}
