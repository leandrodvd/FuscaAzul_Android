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
import com.andtinder.view.SimpleCardStackAdapter;


public class GameActivity extends ActionBarActivity {
    private  CardContainer mCardContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mCardContainer = (CardContainer) findViewById(R.id.layoutview);
        mCardContainer.setOrientation(Orientations.Orientation.Ordered);

        CardModel card1 = new CardModel("", "", ContextCompat.getDrawable(this, R.drawable.fusca1));
        CardModel card2 = new CardModel("", "", ContextCompat.getDrawable(this, R.drawable.fusca2));
        CardModel card3 = new CardModel("", "", ContextCompat.getDrawable(this, R.drawable.fusca3));


        SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(this);
        adapter.add(card1);
        adapter.add(card2);
        adapter.add(card3);

        mCardContainer.setAdapter(adapter);

    }

    private void setOnCardDismissListener(CardModel card){
        card.setOnCardDimissedListener(new CardModel.OnCardDimissedListener() {
            @Override
            public void onLike() {
                Toast.makeText(GameActivity.this,"I liked it",Toast.LENGTH_SHORT).show();
                Log.d("Swipeable Card", "I liked it");
            }

            @Override
            public void onDislike() {
                Toast.makeText(GameActivity.this,"I did not liked it",Toast.LENGTH_SHORT).show();
            }
        });
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
