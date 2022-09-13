package at.tim.basics.switchaufgabe;

import java.util.Random;

public class control {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt( 6)+5;

        switch (randomNumber){
            case 5:
                System.out.println("its 5");
                break;
            case 6:
                System.out.println("its 6");
                break;
            case 7:
                System.out.println("its 7");
                break;
            case 8:
                System.out.println("its 8");
                break;
            case 9:
                System.out.println("its 9");
                break;
            case 10:
                System.out.println("its 10");

        }
    }
}