package com.leandrodavid.fuscaazul;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


import com.andtinder.model.CardModel;
import com.andtinder.model.Orientations;
import com.andtinder.view.CardContainer;
import com.andtinder.view.ImageCardStackAdapter;
import com.andtinder.view.SimpleCardStackAdapter;

import java.util.List;


public class GameActivity extends ActionBarActivity {
    private  CardContainer mCardContainer;
    private ImageCardStackAdapter imageCardStackAdapter;
    private GameController gameController;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mCardContainer = (CardContainer) findViewById(R.id.layoutview);
        mCardContainer.setOrientation(Orientations.Orientation.Ordered);

        gameController =  GameController.getGameController(this);
        //imageCardStackAdapter = new ImageCardStackAdapter(this,gameController.getCardStack());
        imageCardStackAdapter = new ImageCardStackAdapter(this);
        List<GameCardModel> cardStack = gameController.getCardStack();

        /**
        CardModel card1 = new CardModel("Fusca 1", "Esse é o fusca 1", ContextCompat.getDrawable(this, R.drawable.fusca1));
        CardModel card2 = new CardModel("Fusca 2", "Esse é o fusca 2", ContextCompat.getDrawable(this, R.drawable.fusca2));
        CardModel card3 = new CardModel("Fusca 3", "Esse é o fusca 3", ContextCompat.getDrawable(this, R.drawable.fusca3));
        setOnCardDismissListener(card1);
        setOnCardDismissListener(card2);
        setOnCardDismissListener(card3);
        ImageCardStackAdapter adapter = new ImageCardStackAdapter(this,gameC;
        adapter.add(card1);
        adapter.add(card2);
        adapter.add(card3);
**/

//        Car car1 = new Car(1, true);
//        Car car2 = new Car(2, true);
//        Car car3 = new Car(3, true);
//        GameCardModel gameCard1 =  new GameCardModel("Card "+1, "", ContextCompat.getDrawable(this, R.drawable.fusca1),car1);
//        gameCard1.setOnCardDismissedListener(new GameCardDismissedListener(car1,this));
//        GameCardModel gameCard2 =  new GameCardModel("Card "+2, "", ContextCompat.getDrawable(this, R.drawable.fusca1),car2);
//        gameCard2.setOnCardDismissedListener(new GameCardDismissedListener(car2,this));
//        GameCardModel gameCard3 =  new GameCardModel("Card "+1, "", ContextCompat.getDrawable(this, R.drawable.fusca1),car3);
//        gameCard3.setOnCardDismissedListener(new GameCardDismissedListener(car3,this));
//
//        imageCardStackAdapter.add(gameCard1);
//        imageCardStackAdapter.add(gameCard2);
//        imageCardStackAdapter.add(gameCard3);

        for (GameCardModel card:cardStack){
            imageCardStackAdapter.add(card);
        }
        mCardContainer.setAdapter(imageCardStackAdapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
