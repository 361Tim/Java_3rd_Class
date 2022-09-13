package at.tim.basics.crossum;

import java.util.Scanner;

public class quersumme4 {
    public static void main(String[] args) {
        boolean isFinished = false;
        int ziffernsumme = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl eingeben");
        int selection = scanner.nextInt();
        int zahl = selection;
        while (){
            ziffernsumme += zahl%10;
            zahl /= 10;
            if (ziffernsumme)
        }
        System.out.println("Zahl: " + selection + "summe: " + ziffernsumme);

    }
}
