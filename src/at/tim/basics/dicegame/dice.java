package at.tim.basics.dicegame;

import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        System.out.println("Zahl der Würfel eingeben");
        int seletion = scanner.nextInt();
        if (seletion > 1) {
            System.out.println("Deine Zahlen");
        } else System.out.println("Deine Zahl");


        for (int i = 0; i < seletion; i++) {
            int nmb1 = random.nextInt(6) + 1;
            System.out.println(nmb1);
            sum1 += nmb1;
        }
        System.out.println("Deine Summe: " + sum1);

        if (seletion > 1) {
            System.out.println("Zahlen vom Computer");
        } else System.out.println("Zahl vom Computer");


        for (int i = 0; i < seletion; i++) {
            int nmb2 = random.nextInt(6) + 1;
            System.out.println(nmb2);
            sum2 += nmb2;
        }
        System.out.println("Summe vom Computer: " + sum2);
        if (sum1==sum2){
            System.out.println("Unentschieden");
        } else if (sum2<sum1) {
            System.out.println("Du hast gewonnen");
        }
        else System.out.println("Computer hat gewonnen");

    }

}
