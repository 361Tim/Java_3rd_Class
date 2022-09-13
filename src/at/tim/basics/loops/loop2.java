package at.tim.basics.loops;

public class loop2 {
    public static void main(String[] args) {

        int i = 2;
        for (int j = 2; j <= 1000; j += 2) {

            System.out.println("zahl" + i);
            System.out.println("addiere " + j + " + " + i + " = " + i + j);
            i = i + j;

        }
        System.out.println("Alle Zahlen von 0 bis 100 addiert = " + i);
    }


}
