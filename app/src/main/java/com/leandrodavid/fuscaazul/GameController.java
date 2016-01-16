package com.leandrodavid.fuscaazul;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by android5519 on 12/01/16.
 */
public class GameController {
    private static GameController gameController;
    private GameCardStackFactory stackFactory;
    Activity activity ;
    private int level;
    private int acertos=0;
    TextView acertosView ;


    public static GameController getGameController(Activity activity){
        if(gameController ==null){
            gameController= new GameController(activity);
        }
        return gameController;
    }

    private GameController(Activity activity) {
        setLevel(0);
        setAcertos(0);
        this.activity=activity;
        stackFactory = new GameCardStackFactory(this.activity);
        acertosView=(TextView)activity.findViewById(R.id.acertos);
    }

    public List<GameCardModel> getCardStack(){
        return stackFactory.getGameCardStack(this.level);
    }

    public int getLevel() {
        return level;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    public int getAcertos() {
        return acertos;
    }

    private void setAcertos(int acertos){
        this.acertos=acertos;
    }
    public void addAcerto() {
        this.setAcertos(this.getAcertos()+1);
        Log.d("FUSCA AZUL CONTROLLER","Acertos:"+acertos);
        acertosView.setText(String.valueOf(this.getAcertos()));
    }
}
