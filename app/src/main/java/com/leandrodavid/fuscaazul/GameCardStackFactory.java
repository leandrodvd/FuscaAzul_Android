package com.leandrodavid.fuscaazul;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.Toast;

import com.andtinder.model.CardModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by android5519 on 12/01/16.
 */
public class GameCardStackFactory {
    private Activity activity;
    public GameCardStackFactory(Activity activity) {
        this.activity =activity;
    }

    public List<GameCardModel> getGameCardStack(int level){
        List<GameCardModel> cardStack = new ArrayList<GameCardModel>();
        for (int cardIndex =0; cardIndex<15;cardIndex++){
            Log.d("Swipeable Card", "Create card "+cardIndex);
            Car car = new Car(cardIndex, cardIndex%2==0);
            GameCardModel gameCard =  new GameCardModel("Card "+cardIndex, "", ContextCompat.getDrawable(activity, R.drawable.fusca1),car);
            gameCard.setOnCardDismissedListener(new GameCardDismissedListener(car,activity));
            cardStack.add(gameCard);
        }
        return cardStack;
    }
}
