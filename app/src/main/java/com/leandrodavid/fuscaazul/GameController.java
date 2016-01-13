package com.leandrodavid.fuscaazul;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by android5519 on 12/01/16.
 */
public class GameController {
    private int level;
    private GameCardStackFactory stackFactory = new GameCardStackFactory();

    public int getLevel() {
        return level;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    public GameController() {
        setLevel(0);
    }

    public List<GameCardModel> getCardStack(){

        return new ArrayList<GameCardModel>();
    }



}
