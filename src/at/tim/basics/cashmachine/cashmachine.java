package at.tim.basics.cashmachine;

import java.util.Scanner;

public class cashmachine {
    public static void main(String[] args) {
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Ende");

        Scanner scanner = new Scanner(System.in);


        int balance = 0;

        while (true) {

            int selection = scanner.nextInt();

            switch (selection){
                case 1: {


                    System.out.println("Geben sie den Betrag ein den sie Einzahlen wollen");
                    int selection1 = scanner.nextInt();
                    System.out.println("Sie haben " + selection1 + " Euro Eingezahlt");
                    balance += selection1;
                    break;

                } case 2:{


                    System.out.println("Geben sie den Betrag ein den sie Abheben wollen");
                    int selection2 = scanner.nextInt();
                    System.out.println("Sie haben " + selection2 + " Euro Abgehoben");
                    balance -= selection2;
                    break;
                } case 3:{
                    System.out.println("Kontostand: " + balance);
                    break;
                } case 4: {

                    System.out.println("Vorgang beendet");

                    break;
                }


            }

        }
    }
}