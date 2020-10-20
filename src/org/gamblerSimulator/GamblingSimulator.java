package org.gamblerSimulator;

import java.util.Random;

public class GamblingSimulator {
    public static final int  STACK =100;
    public static final int BET =1;
   // public static int WIN =0;
    //public static int LOOSE=0;
    int tempStack=STACK;
    int total_Amount=0;
    //int totalLoss_Amount=0;

    public void chekWinningLooseForDay(){

        Random random = new Random();
        while (tempStack>50 && tempStack<150) {
            int randomNumber = random.nextInt(2);
            if (randomNumber > 0) {
                tempStack=tempStack+BET;
               System.out.println("gambler is going to win and Winning Amount" );

            } else {
                tempStack=tempStack-BET;
                System.out.println("gambler is going to loose and Loosing amount" );

            }
        }
        System.out.println("total stack :" + tempStack);

    }

    public void gamePlay(int day){

        for(int index=1; index<=day;index++){
            chekWinningLooseForDay();

            if (tempStack-STACK>0){
                total_Amount=total_Amount+(tempStack-STACK);
                System.out.println("winning day " + index + " by amount " + total_Amount);
            }
            else{
                total_Amount = total_Amount+(STACK-tempStack);
                System.out.println("looseing day " + index + " by amount " + total_Amount);
            }

        }


    }

    public static void main(String[] args) {
        GamblingSimulator gamblingSimulator = new GamblingSimulator();
        //gamblingSimulator.chekWinningLoose();
        gamblingSimulator.gamePlay(20);
        System.out.println(gamblingSimulator.total_Amount);
    }


}
