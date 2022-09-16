package at.tim.basics.calendar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calendar {

    public static void main(String[] args) {


        int month;
        int day;

        System.out.println("Bitte geben Sie den Monat ein");

        month = input();
        if (month < 1 || month >= 13) {
            System.out.println("Geben Sie eine Zahl zwischen 1 und 12 ein");
            month = input();
        }

        System.out.println();
        System.out.println("Bitte geben Sie den Wochentag ein an welchem der Monat beginnt");


        day = input();
        if (day < 1 || day >= 7) {
            System.out.println("Geben Sie eine Zahl zwischen 1 und 6 ein.");
            day = input();
        }

        System.out.println();
        printCalendar(month, day);

    }

    public static int input() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                return (scanner.nextInt());
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Bitte keine Kommastellen oder zu hohe Zahlen.");
            } finally {
                scanner.nextLine();
            }
        }

    }


    public static void printCalendar(int month, int startDay) {

        int numOfDays;
        String[] days = {"MO", "DI", "MI", "DO", "FR", "SA", "SO"};
        int i = 0;

        if (month == 2) {
            numOfDays = 28;
        } else if (month % 2 == 0 && month <= 7) {
            numOfDays = 30;
        } else if (month % 2 == 1 && month <= 7) {
            numOfDays = 31;
        } else if (month % 2 == 0) {
            numOfDays = 31;
        } else
            numOfDays = 30;


        while (i < 7) {
            if (i == 0) {
                System.out.print("| ");
            } else
                System.out.print(" | ");
            System.out.print(days[i]);
            i++;
            if (i == 7) System.out.println(" |");
            {

            }
        }
        i = 0;


        while (i < numOfDays + startDay + 7 - (numOfDays + startDay) % 7) {
            if (i % 7 == 0) {
                System.out.print("| ");
            } else System.out.print(" | ");

            if (i < startDay || i > numOfDays + startDay - 1) {
                System.out.print("  ");
            } else System.out.print(i - startDay + 1);

            if (i - startDay + 1 < 10 && i >= startDay) {
                System.out.print(" ");
            }
            i++;

            if (i % 7 == 0) {
                System.out.println(" |");
            }
        }

    }

}
