package org.gamblerSimulator;

import java.util.Random;

public class GamblingSimulator {
    public static final int  STACK =100;
    public static final int BET =1;
    public static int WIN =0;
    public static int LOOSE=0;

    public void chekWinningLoose(){

        Random random = new Random();
        int tempStack=STACK;
        while (tempStack>50 && tempStack<150) {
            int randomNumber = random.nextInt(2);
            if (randomNumber == 0) {
                tempStack=tempStack+BET;
                System.out.println("gambler is going to win and Winning Amount" + WIN);

            } else {
                tempStack=tempStack-BET;
                System.out.println("gambler is going to loose and Loosing amount" + BET);

            }
        }
        System.out.println("total stack :" + tempStack);

    }

    public static void main(String[] args) {
        GamblingSimulator gamblingSimulator = new GamblingSimulator();
        gamblingSimulator.chekWinningLoose();
    }


}
