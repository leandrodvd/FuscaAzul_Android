package com.leandrodavid.fuscaazul;

/**
 * Created by android5519 on 15/01/16.
 */
public class Car {
    private int ID;
    private boolean isFuscaAzul;

    public Car(int ID, boolean isFuscaAzul) {
        this.ID = ID;
        this.isFuscaAzul = isFuscaAzul;
    }

    public int getID() {
        return ID;
    }

    public boolean isFuscaAzul() {
        return isFuscaAzul;
    }
}
