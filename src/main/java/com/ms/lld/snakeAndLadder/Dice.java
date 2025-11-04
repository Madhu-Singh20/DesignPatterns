package com.ms.lld.snakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private int diceCount;
    private int min=1;
    private int max=6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice(){

        int diceRolled=0;
        int count=0;
        while(diceRolled<diceCount){
            int random= ThreadLocalRandom.current().nextInt(min,max+1);
            count += random;
            diceRolled++;
        }
        return count;
    }
}
