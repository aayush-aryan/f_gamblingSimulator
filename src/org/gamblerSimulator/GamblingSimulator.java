package org.gamblerSimulator;

import java.util.Random;

public class GamblingSimulator {
    double STACK =100;
    double BET =1;
    double WIN =0;
    double LOOSE=0;

    public void chekWinningLoose(){
        Random random = new Random();
        int randomNumber =  random.nextInt(2);
        if(randomNumber==0){
            WIN=BET;
            System.out.println("gambler is going to win and Winning Amount"+WIN);

        }else{
            LOOSE=BET;
            System.out.println("gambler is going to loose and Loosing amount"+BET);
           
        }

    }

    public static void main(String[] args) {
        GamblingSimulator gamblingSimulator = new GamblingSimulator();
        gamblingSimulator.chekWinningLoose();
    }


}
