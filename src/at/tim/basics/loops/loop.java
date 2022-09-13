package at.tim.basics.loops;

public class loop {
    public static void main(String[] args) {

        int i = 0;
        for (int j = 1; j <= 100; j++) {

            System.out.println("zahl: " + j);
            System.out.println("addiere " + j+" + " +i+" = "+i+j);
            i = i + j;

        }
        System.out.println("Alle Zahlen von 0 bis 100 addiert = "+i);
    }
}
