package com.leandrodavid.fuscaazul;

import android.app.Activity;
import android.content.Context;
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
    private Activity context;
    public GameCardStackFactory(Activity context) {
        this.context=context;
    }

    public List<GameCardModel> getGameCardStack(int level){
        List<GameCardModel> cardStack = new ArrayList<GameCardModel>();
        for (int cardIndex =0; cardIndex<15;cardIndex++){
            Log.d("Swipeable Card", "Create card "+cardIndex);
           final GameCardModel card =  new GameCardModel("Card "+cardIndex, "", ContextCompat.getDrawable(context, R.drawable.fusca1),cardIndex%2==0);
           card.setOnCardDismissedListener(new CardModel.OnCardDismissedListener() {
                @Override
                public void onLike() {
                    if(card.isFuscaAzul()){
                        GameController.getGameController(context).addAcerto();

                    }
                    Toast.makeText(context, "I liked it  " + card.getTitle() + " "+card.isFuscaAzul(), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onDislike() {
                    if(!card.isFuscaAzul()){
                        GameController.getGameController(context).addAcerto();

                    }
                    Toast.makeText(context,"I did not liked it "+ card.getTitle() + " "+card.isFuscaAzul(),Toast.LENGTH_SHORT).show();
                }
            });
            cardStack.add(card);
        }
        return cardStack;
    }
}
